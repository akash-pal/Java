public class Palindrome {
	private int n;

	public Palindrome() {
		super();
	}

	public Palindrome(int n) {

		this.n = n;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public void checkPalindrome() {
		int r = 0, temp = n;
		while (temp > 0) {
			r = 10 * r + temp % 10;
			temp = temp / 10;
		}

		if (r == n) {
			System.out.println(n + " is a palindrome number");
		} else {
			System.out.println(n + " is not a palindrome number");
		}
	}

}
