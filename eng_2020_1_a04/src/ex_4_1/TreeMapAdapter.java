package ex_4_1;

import java.util.Map;
import java.util.TreeMap;

@SuppressWarnings({ "serial", "hiding" })
public class TreeMapAdapter<Object> extends TreeMap<Object, Object>  implements Map<Object, Object> {


  public TreeMapAdapter(Object[][] pares) {
    super();
    Object[] chaves = pares[0];
	Object[] colunas = pares[1];
    
	for (int i = 0; i < chaves.length; i++)
		put(chaves[i], colunas[i]);
  }
}