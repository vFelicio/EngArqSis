package ex_7_2;

import java.util.Arrays;

public class TestComparator {
	
	private static int tamanho = 5;

	
	private static Double[] construirVetor() {
		Double[] d = new Double[tamanho];
		for (int i = 0; i < d.length; i++)
			d[i] = Math.random() * tamanho;
		return d;
	}

	
	public static void main(String[] args) throws Exception {

		Double[] vetor = construirVetor();
		Arrays.sort(vetor, new ComparatorDouble());
		System.out.println(Arrays.toString(vetor));
	}
}
