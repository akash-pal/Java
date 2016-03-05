public class Fibonacci {
	private int count;

	public Fibonacci() {
	}

	public Fibonacci(int count) {
		this.count = count;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void printFibonacci() {
		int a = 0;
		int b = 1;
		while (count > 0) {
			System.out.print(a + " ");
			int c = a + b;
			a = b;
			b = c;
			count--;
		}

		System.out.println();

	}

}
