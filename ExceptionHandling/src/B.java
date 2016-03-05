public class B{
	void test() throws MyException,ArithmeticException {
		int a, b, res;
		a = 5;
		b = 10;
		res = 0;
		if (b > a) {
			throw new MyException("b is more than a");
		}
		res = a / b;

	}
}
