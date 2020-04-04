package ex_7_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class ManipuladorAbstrato {
	
	public void manipularString() {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Digite sua mensagem: ");
		String s = "";
		try {
			s = reader.readLine();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

		System.out.println("Apos a manipulacao: " + transformarString(s));
		System.out.println();
	}

	protected abstract String transformarString(String s);
}