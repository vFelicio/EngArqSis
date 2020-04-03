package ex_4_1;

import java.util.Iterator;
import java.util.Map;

public class MapTest {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		Object[][] pares = new String[][] { { "Janeiro", "Marco", "Maio", "Julho", "Setembro" }, { "01", "03", "05", "07", "09" } };

		Map mapaH = new HashMapAdapter(pares);

        System.out.println("Utilizando HashMapAdapter: \n");
		for (Iterator it = mapaH.entrySet().iterator(); it.hasNext();) {
			Map.Entry entry = (Map.Entry) it.next();
			System.out.println(entry.getKey() + " -- " + entry.getValue());
		}
		
		
		Map mapaT = new TreeMapAdapter(pares);
		System.out.println("\nUtilizando TreeMapAdapter: \n");
		for (Iterator it = mapaT.entrySet().iterator(); it.hasNext();) {
			Map.Entry entry = (Map.Entry) it.next();
			System.out.println(entry.getKey() + " -- " + entry.getValue());
		}
	}
}
