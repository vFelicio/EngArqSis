package ex_2_2;

import javax.swing.JOptionPane;

public class ProvedorasTest {

	public static void main(String[] args) {
		String senha = JOptionPane.showInputDialog(null, "Digite a senha:");
		if(senha.isEmpty()) {
			ProvedorInformacao provedor = new ProvedorPublico();
			provedor.exibirInformacao();			
		} else if("designpatterns".equals(senha)) {
				ProvedorInformacao provedor = new ProvedorConfidencial();
				provedor.exibirInformacao();			
			} else System.out.println("Senha incorreta!");	

}
}
