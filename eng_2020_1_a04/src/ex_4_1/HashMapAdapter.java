package ex_4_1;

import java.util.HashMap;

@SuppressWarnings({ "serial", "rawtypes" })
public class HashMapAdapter extends HashMap {

	@SuppressWarnings("unchecked")
	public HashMapAdapter(Object[][] pares) {
		if (pares.length == 2 && pares[0].length == pares[1].length) {
			
		Object[] chaves = pares[0];
		Object[] colunas = pares[1];

		for (int i = 0; i < chaves.length; i++)
			put(chaves[i], colunas[i]);
		} else System.out.println("Verifique o numero de objetos e o tamanho deles");
	}
}