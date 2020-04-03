package ex_6_2;

public class SelectionSort implements Ordenacao {

	@Override
	public void ordena(int[] v) {
		int i, j, min, x;
		for (i = 0; i < v.length - 1; ++i) {
		min = i;
		for (j = i + 1; j < v.length; ++j) {
		if (v[j] < v[min])
		min = j;
		}
		x = v[i];
		v[i] = v[min];
		v[min] = x;
		}
		
	}

}
