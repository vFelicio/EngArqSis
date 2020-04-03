package ex_5_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivoTexto {
	
	private String linha;
    private String texto =  "";

	protected String lerArquivoTxt() {
		String nome = new File("aluno.txt").getAbsolutePath();
		try {
		      FileReader arq = new FileReader(nome);
		      BufferedReader lerArq = new BufferedReader(arq);
		 
		      linha = lerArq.readLine();
		      
		      while (linha != null) {
		        texto = texto+"\n"+linha;
		        linha = lerArq.readLine();
		      }
		 
		      arq.close();
		    } catch (IOException e) {
		        System.err.printf("Erro na abertura do arquivo: %s.\n",
		          e.getMessage());
		    }
		return texto;
	}
	
}
