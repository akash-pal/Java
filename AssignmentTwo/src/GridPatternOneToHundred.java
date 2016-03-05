public class GridPatternOneToHundred {

	public void print() {
		for (int counter = 1; counter <= 100; counter++) {
			if (counter % 10 == 1) {
				System.out.println(" ");
			}
			if (counter < 10)
				System.out.print("0" + counter + " ");
			else
				System.out.print(counter + " ");
		}
	}

}
