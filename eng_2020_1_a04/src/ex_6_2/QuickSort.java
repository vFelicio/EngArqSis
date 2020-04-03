package ex_6_2;

public class QuickSort implements Ordenacao {

	@Override
	public void ordena(int[] v) {
        int p = 0;
        int r = v.length - 1;
		quicksort(v, p, r);
		}
	
	private int separa(int v[], int p, int r) {
			int c = v [ p ], i = p + 1, j = r, aux;
			while ( i<=j ) {
			while (i <= r && v [ i ] <= c)
			i++;
			while (c < v [ j ])
			j--;
			if (i < j){
			aux = v [ i ];
			v [ i ] = v [ j ];
			v [ j ] = aux;
			i++;
			j--;
			}
			}
			v [ p ] = v [ j ];
			v [ j ] = c;
			return j;
			}
		/*
		* Quicksort - principal (chama o metodo separa)
		*/
		public void quicksort(int v[], int p, int r) {
		int j;
		if (p < r) {
		j = separa(v, p, r);
		quicksort(v, p, j - 1);
		quicksort(v, j + 1, r);
		}
		}

}
