
public class Swapping {

	private int firstNumber;
	private int secondNumber;
	public Swapping() {
		super();
		firstNumber=0;
		secondNumber=0;
	}
	public Swapping(int firstNumber, int secondNumber) {
		super();
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}
	public int getFirstNumber() {
		return firstNumber;
	}
	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}
	public int getSecondNumber() {
		return secondNumber;
	}
	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}
	
	public void swap()
	{
		System.out.println("Before swapping");
		System.out.println("First Number= "+ firstNumber +" Second Number= "+secondNumber);
		
		firstNumber = firstNumber + secondNumber;
		secondNumber = firstNumber - secondNumber;
		firstNumber = firstNumber - secondNumber;
		
		System.out.println("After swapping");
		System.out.println("First Number= "+ firstNumber +" Second Number= "+secondNumber);
	}
	
	
}
