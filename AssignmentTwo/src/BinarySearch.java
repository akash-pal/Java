public class BinarySearch {

	private int array[];

	public BinarySearch(int[] array) {
		super();
		this.array = array;
	}

	public void search(int beg, int end, int element) {

		if (beg <= end) {
			int mid = (beg + end) / 2;
			if (array[mid] == element) {
				System.out.println(element + " is at position " + (mid + 1));
			} else if (array[mid] < element) {
				search(mid + 1, end, element);
			} else {
				search(beg, mid - 1, element);
			}
		} else {
			System.out.println("The element is not present");
		}

	}

}
