public class BubbleSort {

	int[] array;

	public BubbleSort(int[] array) {
		super();
		this.array = array;
	}

	public void sort() {
		int i, j, temp;
		for (i = 0; i < array.length; i++) {
			for (j = i; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		for (i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

}
