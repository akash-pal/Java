public class OddEven {

	private int lowerLimit;
	private int upperLimit;

	public OddEven() {
		super();
		lowerLimit = 0;
		upperLimit = 0;
	}

	public OddEven(int lowerLimit, int upperLimit) {
		super();
		this.lowerLimit = lowerLimit;
		this.upperLimit = upperLimit;
	}

	public int getLowerLimit() {
		return lowerLimit;
	}

	public void setLowerLimit(int lowerLimit) {
		this.lowerLimit = lowerLimit;
	}

	public int getUpperLimit() {
		return upperLimit;
	}

	public void setUpperLimit(int upperLimit) {
		this.upperLimit = upperLimit;
	}

	public void print() {
		int i;
		System.out.println("Even numbers");
		for (i = lowerLimit; i <= upperLimit; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println("\nOdd numbers");
		for (i = lowerLimit; i <= upperLimit; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}

}
