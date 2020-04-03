package ex_6_2;

import javax.swing.JOptionPane;

public class OrdenacaoTest {
	
	private static int NUM = 100000;
	private static int t = 10;
	
	private static int[] construirVetor() {
		int[] d = new int[t];
		for (int i = 0; i < d.length; i++)
			d[i] = (int) (Math.random() * NUM);
		return d;
	}

	private static void imprimirVetor(int a[]) {
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]+"\n");
		System.out.println("*************************");
	}

	public static void main(String args[]) {
		
		Ordenacao o;
		
		int[] bubble, selection, quick, insertion, teste;
	
		teste = construirVetor();
		imprimirVetor(teste);
		String estrategia = JOptionPane.showInputDialog(null, "Digite a estrategia de ordenacao:\nbubble\nselection\ninsertion\nquick");
		if("bubble".equals(estrategia)) {
			o = new BubbleSort();
			o.ordena(teste);
			imprimirVetor(teste);
		}
		else if ("selection".equals(estrategia)) {
			o = new SelectionSort();
			o.ordena(teste);
			imprimirVetor(teste);
		}
		else if ("insertion".equals(estrategia)) {
			o = new InsertionSort();
			o.ordena(teste);
			imprimirVetor(teste);
		}
		else if ("quick".equals(estrategia)) {
			o = new QuickSort();
			o.ordena(teste);
			imprimirVetor(teste);
		}
		else System.out.println("Estrategia invalida");
				
		/*
		bubble = construirVetor();
		o = new BubbleSort();
		imprimirVetor(bubble);
		o.ordena(bubble);
		imprimirVetor(bubble);
		
		selection = construirVetor();
		o = new SelectionSort();
		imprimirVetor(selection);
		o.ordena(selection);
		imprimirVetor(selection);
		
		insertion = construirVetor();
		o = new InsertionSort();
		imprimirVetor(insertion);
		o.ordena(insertion);
		imprimirVetor(insertion);
		
		quick = construirVetor();
		o = new QuickSort();
		imprimirVetor(quick);
		o.ordena(quick);
		imprimirVetor(quick);*/
		
		
		
	}
	
}
