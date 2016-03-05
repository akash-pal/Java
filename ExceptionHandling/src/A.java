//Called method handles exception

public class A {

	void test() {
		try {
			int a, b, res;
			a = 5;
			b = 10;
			res = 0;
			if (b > a) {
				throw new MyException("b is more than a");
			}
			res = a / b;
		} catch (MyException e) {
			e.printStackTrace();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}
}
