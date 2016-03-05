package test;

public class MyThread extends Thread {

	String s=null;
	@Override
	public void run() {
		
		
			System.out.println(Thread.currentThread().getName());
			System.out.println(s.length());
	
	}
}
