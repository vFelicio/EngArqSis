package ex_8_2;


import ex_8_1.observer.Noticiario;
import ex_8_1.subject.FonteNoticias;


public class Agregadores extends Noticiario {
	
	String t = "";
    int c = 0;
    int m = 0;
	
	public Agregadores(FonteNoticias fonte, String nome, String tipoT) {
		super(fonte, nome);
		t = tipoT;
		
		}
	

    
	String agrT = "";
    String agrM = "";
	@Override
	public void notificaNoticia(String textoNoticia, int dia, int mes, String topico) {

		if(t == topico) {
		c = c + 1;
		agrT = agrT +"Veiculo: "+this.getNome()+"\nTopico: "+topico+"\nData: "+dia+"/"+mes+"\n"+textoNoticia+"\n----------------------------\n";
        if (c == 10) {	
        System.out.println(agrT);
        c = 0;
        agrT = "";
		}
		}
		
		if (m == 0) {
			m = mes;
			}
		
		if (m == mes) {
			agrM = agrM +"Veiculo: "+this.getNome()+" Topico: MENSAL" +"\nData: 0"+"/"+mes+"\n"+textoNoticia+"\n----------------------------\n";
		} else {
			System.out.println(agrM);
			agrM = "";
		}
	}

	@Override
	public void consomeNoticia(String textoNoticia, int dia, int mes, String topico) {
		this.notificaNoticia(textoNoticia, dia, mes, topico);
		
	}
	


}
