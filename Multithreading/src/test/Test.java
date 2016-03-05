package test;

public class Test {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		MyThread t1 = new MyThread();
		t.setName("t");
		t1.setName("t1");
		t.start();
		t1.start();
	}
}
