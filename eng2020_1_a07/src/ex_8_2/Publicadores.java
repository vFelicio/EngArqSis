package ex_8_2;
import ex_8_1.observer.Noticiario;
import ex_8_1.subject.FonteNoticias;

public class Publicadores extends Noticiario {

	public Publicadores(FonteNoticias fonte, String nome) {
		super(fonte, nome);
	}

	@Override
	public void notificaNoticia(String textoNoticia, int dia, int mes, String topico) {
		System.out.println("Veiculo: "+this.getNome());
		System.out.printf("Topico: %s\nData: %d/%d\n%s\n", topico, dia, mes, textoNoticia);
		System.out.println("-----------------------------------------");
	}

	@Override
	public void consomeNoticia(String textoNoticia, int dia, int mes, String topico) {
		this.notificaNoticia(textoNoticia, dia, mes, topico);
		
	}

}
