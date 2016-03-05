public class InsertionSort {

	private int[] array;

	public InsertionSort(int[] array) {
		super();
		this.array = array;
	}

	public void sort() {
		int i, j,key;
		for (i = 1; i < array.length; i++) {
			key = array[i];
			j = i - 1;
			while (j >= 0 && key < array[j]) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = key;

		}

		for (i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
	}

}
