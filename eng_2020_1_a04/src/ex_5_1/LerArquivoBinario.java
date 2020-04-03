package ex_5_1;

import java.io.*;

public class LerArquivoBinario {

	protected String lerArquivoBinario() {
	
        String nome = new File("Aluno.class").getAbsolutePath();
        String bytes = "";
 
        String inputFile = nome;
 
 
        try (
            InputStream inputStream = new FileInputStream(inputFile);) {
            int byteRead;
 
            while ((byteRead = inputStream.read()) != -1) {
                bytes = bytes+" "+byteRead;
           
            } 
 
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    return bytes;
}
}

