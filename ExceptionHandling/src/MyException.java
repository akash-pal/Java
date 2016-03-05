@SuppressWarnings("serial")
public class MyException extends Exception {

	public MyException() {
		super("default message");
	}

	public MyException(String s) {
		super(s);
	}

}
