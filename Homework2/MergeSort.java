//Source: http://web.cs.iastate.edu/~smkautz/cs227s18/examples/week11/MergeSortAlt2.java
public class MergeSort {
	public static void mergeSort(int[] a){
		if (a.length > 1) {
			int i, mid = a.length / 2; //split array in 2 halves
			int[] half1 = new int[mid]; 
			int[] half2 = new int[a.length - mid];
			for (i = 0; i < mid; i++)
				half1[i] = a[i];
			for (; i < a.length; i++)
				half2[i - mid] = a[i];
			mergeSort(half1); //recursive call for first half of array to keep splitting
			mergeSort(half2); //recursive call for second half of array to keep splitting
			
			//sort and merge
			int j = 0, k = 0;
			for (i = 0; j < half1.length && k < half2.length; i++)
				if (half1[j] < half2[k]) {
					a[i] = half1[j];
					j++;
				} else {
					a[i] = half2[k];
					k++;
				}
			for (; j < half1.length; i++, j++)
				a[i] = half1[j];
			for (; k < half2.length; i++, k++)
				a[i] = half2[k];
		}
	}

	public static void main(String[] args) {
		int i;
		int[] A = { 5, 6, 7, 109, -26, 67, 79, 33, 10, 36 };
		mergeSort(A);
		for (i = 0; i < A.length; i++) {
			System.out.println(A[i]);
		} // System.out.println(A);}}
}
}