public class Armstrong {
	private int number;

	public Armstrong() {
		super();
	}

	public Armstrong(int number) {
		super();
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void checkArmstrong() {
		int count = 0, n = number, r, sum = 0;

		while (n > 0) {
			n = n / 10;
			count++;
		}
		n = number;
		while (n > 0) {
			r = n % 10;
			sum = (int) (sum + Math.pow(r, count));
			n = n / 10;
		}
		if (sum == number) {
			System.out.println(number + " is an armstrong number");
		} else {
			System.out.println(number + " is not an armstrong number");
		}

	}
}
