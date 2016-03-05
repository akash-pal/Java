
public class QuickSelect {
	public static int select(int[] array, int left, int right, int key) {
		int pivot = partition(array, left, right); 
		if (pivot == key) {
			return array[pivot];
		} else if (pivot > key) {
			return select(array, left, pivot - 1, key);
		} else {
			return select(array, pivot + 1, right, key);
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