public class SelectionSort {

	int[] array;

	public SelectionSort(int[] array) {
		super();
		this.array = array;
	}

	public void sort() {
		int i, j, temp, min;
		for (i = 0; i < array.length - 1; i++) {
			min = i;
			for (j = i + 1; j < array.length; j++) {
				if (array[min] > array[j]) {
					min = j;
				}
			}

			temp = array[min];
			array[min] = array[i];
			array[i] = temp;

		}

		System.out.println();
		for (i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
