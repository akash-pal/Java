package test;

/*interface Foldable {
 public void fold() throws Exception ;

 }


 class Paper implements Foldable {
 public void fold() { // line 6
 System.out.print("Fold");
 }
 }


 public class Tester {
 public static void main(String args []) {
 Foldable obj1 = new Paper();
 obj1.fold(); // line 8
 Paper obj2 = new Paper(); // line 10
 obj2.fold();
 }
 }
 */
/*import java.io.IOException;

 class AirPlane {
 public AirPlane() throws IOException, RuntimeException {
 System.out.println("AirPlane");
 }
 }

 class AirJet extends AirPlane {

 public AirJet() throws IOException, RuntimeException {
 super();
 // TODO Auto-generated constructor stub
 }


 } // line 7

 public class Tester {
 public static void main(String args[]) throws IOException { // line 10
 new AirPlane(); // line 11
 }
 }
 */
/*
 import java.io.IOException;

 class Father {
 public Father() throws IOException {
 System.out.print("Father");
 throw new IOException();
 //System.out.println("F");
 }
 }

 class Son extends Father {
 public Son() throws IOException {
 super();
 System.out.print("Son");

 }
 }

 public class Tester {
 public static void main(String[] args) {
 try {
 new Son();
 System.out.println("Son");
 } catch (IOException e) {
 System.out.print(" Inside catch");
 }
 System.out.println("Outside");
 }
 }

 */

class Tester {
	public static void main(String[] args) throws RuntimeException {
		/*
		 * int x=0; System.out.println(7/x);
		 */
		int i = 1;
		switch (i) {
		case 1:
			break;
		default:
			break;
		case 2:
			break;
		}

	}
}