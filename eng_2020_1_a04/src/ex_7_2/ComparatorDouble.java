package ex_7_2;

import java.util.Comparator;

public class ComparatorDouble implements Comparator<Double> {
	public int compare(Double d1, Double d2) {
		
		Double d11 = d1 - Math.floor(d1);
		Double d22 = d2 - Math.floor(d2);
		return d11.compareTo(d22);
	
	}
}
