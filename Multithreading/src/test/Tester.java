package test;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

public class KoKo {
	synchronized void hoho(long n) {
		 for(int i = 1; i < 4; i++)
		 System.out.print(n + "-" + i + " ");
		 }
		 }

public class Test implements Runnable {
	 static KoKo pp2 = new KoKo();
	 public static void main(String[] args) {
	 new Thread(new Test()).start();
	 new Thread(new Test()).start()	; }
	 public void run() { pp2.hoho(Thread.currentThread().getId()); }
	 }