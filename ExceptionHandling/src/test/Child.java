package test;


public class Child extends Parent {

	public void display() {
		System.out.println(7 / 0);
		System.out.println("");
	}

	public static void main(String[] args) {
		new Child().display();
	}

}
