package ex_2_3;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;


public class FerramentaLogArquivo extends FerramentaLog {
	
	private String log = "";
	
	public void registrarLog(String mensagem) {
				try {
				PrintWriter writer = new PrintWriter("log.txt");
				 log = log+dateFormat.format(new Date(System.currentTimeMillis())) + mensagem + "\n";
				writer.write(log);
				writer.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	
	}


