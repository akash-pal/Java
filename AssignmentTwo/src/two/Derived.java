package two;



public class Derived extends Base {

	public final void method(int x) { // line 1
		System.out.print("Derived");
	}

	/*public static void main(String[] args) {
		Base b = new Derived();
		b.method(3);
	}*/

}