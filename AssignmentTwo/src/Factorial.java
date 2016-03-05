
public class Factorial {
	private int number;

	
	public Factorial() {
		super();
	}


	public Factorial(int number) {
		super();
		this.number = number;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}
	
	public void fact()
	{
		int factorial=1;
		int n=number;
		while(n>0)
		{
			factorial = factorial * n;
			n--;
		}
		System.out.println("Factorial of " + number + " = " + factorial);
	}
}
