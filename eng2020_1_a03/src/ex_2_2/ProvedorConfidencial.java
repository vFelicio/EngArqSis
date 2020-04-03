package ex_2_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ProvedorConfidencial extends ProvedorInformacao{
	
	private String linha;
    private String texto =  " ";
	
	protected String recuperarInformacao() {
		String nome = new File("confidencial.txt").getAbsolutePath();
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
