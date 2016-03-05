public class QuickSort {

	void quicksort(int array[], int left, int right) {
		if (left < right) {
			int q;
			q = partition(array, left, right);
			quicksort(array, left, q);
			quicksort(array, q + 1, right);
		}
	}

	static int partition(int array[], int left, int right) {
		int i, j, pivot, temp;
		pivot = array[left];
		i = left;
		j = right;
		while (true) {
			while (array[i] < pivot && array[i] != pivot)
				i++;
			while (array[j] > pivot && array[j] != pivot)
				j--;
			if (i < j) {
				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			} else {
				return j;
			}
		}
	}
	
	
}