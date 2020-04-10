package ex_9_1;

import javax.swing.JOptionPane;

public class TesteMoeda {

	public static void main(String[] args) {
		
		Slot slot1 = new Slot1();
		Slot slot5 = new Slot5();
		Slot slot10 = new Slot10();
		Slot slot50 = new Slot50();
		
		slot1.setSlot(slot5);
		slot5.setSlot(slot10);
		slot10.setSlot(slot50);
		
	/*	ArrayList<Moeda> moedas = new ArrayList<>();
		moedas.add(new Moeda(1));
		moedas.add(new Moeda(5));
		moedas.add(new Moeda(10));
		moedas.add(new Moeda(50));
		moedas.add(new Moeda(3));
		
		for(Moeda moeda: moedas) {
			System.out.printf(">>>>>>>>>>>> Moeda de %d inserida\n", moeda.getValor());
			slot1.processar(moeda);
		}
*/
		
		
		
		double p = 0;
		String produto = JOptionPane.showInputDialog("1- Refrigerante = R$1,00 \n2- Batata = R$2,50\n3- Sorvete = R$0,75");
		switch (produto) {
		case "1":
			p = 1.00;
			break;
		case "2":
			p = 2.50;
			break;
		case "3":
			p = 0.75;
			break;
		default:
			System.out.println("Produto nao cadastrado");
				
		}
		double adicionado = 0;
		if (p > 0) {
			while (p>adicionado) {
				System.out.printf("-- Total inserido: R$%.2f\n",adicionado);
				int valor =	Integer.parseInt(JOptionPane.showInputDialog("Coloque uma moeda (1, 5, 10, 50)"));
				System.out.printf(">>>>>>>>>>>> Moeda de %d inserida\n",valor );
				slot1.processar(new Moeda(valor));
				double novaadicao = valor;
				novaadicao = novaadicao/100;
				adicionado = adicionado + novaadicao;
			}
			double troco = adicionado - p;
			System.out.printf("Total a pagar:  R$%.2f\n",p);
			System.out.printf("Total pago:     R$%.2f\n",adicionado);
			System.out.printf("Troco:          R$%.2f",troco);
		}
		
		
	}

}
