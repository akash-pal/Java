import employee.Employee;
import employee.JuniorSoftwareDeveloper;
import employee.ProjectTrainee;
import employee.SoftwareDeveloper;

public class Client {

	public static void main(String[] args) {

		int array[] = { 7,8,9,10 };

		System.out.println("\nPALINDROME");
		Palindrome p = new Palindrome(12321);
		p.checkPalindrome();

		System.out.println("\nARMSTRONG");
		Armstrong armstrong = new Armstrong(54748);
		armstrong.checkArmstrong();

		System.out.println("\nFIBONACCI SERIES");
		Fibonacci fibonacci = new Fibonacci(20);
		fibonacci.printFibonacci();

		System.out.println("\nDECIMAL TO BINARY CONVERSION AND VICE VERSA");
		Conversion conversion = new Conversion();
		conversion.decimalToBinary(2525);
		conversion.binaryToDecimal(0111);

		System.out.println("\nBUBBLE SORT");
		BubbleSort bubbleSort = new BubbleSort(array);
		bubbleSort.sort();

		System.out.println("\nSELECTION SORT");
		SelectionSort selectionSort = new SelectionSort(array);
		selectionSort.sort();

		System.out.println("\nINSERTION SORT");
		InsertionSort insertionSort = new InsertionSort(array);
		insertionSort.sort();

		System.out.println("\nQUICK SORT");
		QuickSort quickSort = new QuickSort();
		quickSort.quicksort(array, 0, array.length - 1);
		for (int j = 0; j < array.length; j++) {
			System.out.println(array[j]);
		}

		System.out.println("\nSWAPPING TWO NUMBERS");
		Swapping swapping = new Swapping(10, 20);
		swapping.swap();

		System.out.println("\nBINARY SEARCH");
		BinarySearch binarySearch = new BinarySearch(array);
		binarySearch.search(0, array.length - 1, 90);

		System.out.println("\nSEQUENTIAL SEARCH");
		SequentialSearch sequentialSearch = new SequentialSearch(array);
		sequentialSearch.search(3);

		System.out.println("\nQUADRATIC EQUATION");
		QuadraticEquation quadraticEquation = new QuadraticEquation(1, 2, 5);
		quadraticEquation.findRoots();

		System.out.println("\nPRINT 1 TO 100 IN GRID PATTERN");
		GridPatternOneToHundred gridPatternOneToHundred = new GridPatternOneToHundred();
		gridPatternOneToHundred.print();

		System.out.println();

		System.out.println("\nPRINT 1 TO 10's TABLE");
		GridPatternOneToTenTable gridPatternOneToTenTable = new GridPatternOneToTenTable();
		gridPatternOneToTenTable.printTable();

		System.out.println("\nMATRIX MULTIPLICATION");
		int[][] arrayOne = { { 1, 3, 4 }, { 2, 5, 6 } };
		int[][] arrayTwo = { { 1, 5, 6 }, { 2, 5, 4 }, { 1, 1, 1 } };
		MatrixMultiplication matrixMultiplication = new MatrixMultiplication(
				arrayOne, arrayTwo);
		matrixMultiplication.multiply();

		System.out
				.println("\nBONUS SALARY BASED ON DESIGNATION AND EXPERIENCE(MONTHS)");
		Employee e;
		e = new ProjectTrainee();
		System.out.println(e.bonusSalary(3));

		e = new JuniorSoftwareDeveloper();
		System.out.println(e.bonusSalary(20));

		e = new SoftwareDeveloper();
		System.out.println(e.bonusSalary(40));

		System.out.println("\nODD EVEN NUMBERS IN A RANGE");
		OddEven oddEven = new OddEven(10, 25);
		oddEven.print();

		System.out.println("\n\nPRINT THRD LARGENT ELEMENT IN ARRAY");
		int k=3;
		System.out.println(QuickSelect.select(array, 0, array.length - 1, array.length - k)); //kth largest
		
		System.out.println("\nFACTORIAL");
		Factorial factorial = new Factorial(1);
		factorial.fact();

		
		System.out.println("\nSTACK");
		Stack stack = new Stack(3);
		System.out.println("PUSH");
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);

		System.out.println("POP");
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();

		System.out.println("\nQUEUE");
		Queue queue = new Queue(3);
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		queue.enqueue(6);
		queue.enqueue(7);

		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		
        //Pattern no diamond,8,7,6,5,18,17,15,14,13		
		/*
		Enter a number
		5
			    *
			   ***
			  *****
			 *******
			*********
			 *******
			  *****
			   ***
			    *
		Enter a number
		5
		**********
		****  ****
		***    ***
		**      **
		*        *
		*        *
		**      **
		***    ***
		****  ****
		**********
		
		Enter a number
		5
		*****23456
		****  3456
		***    456
		**      56
		*        6
		
		Enter a number
		5
		    1
		   121
		  12321
		 1234321
		123454321
		
		Enter a number
		5
		 1 1
		 1 2 3
		 1 2 3 6
		 1 2 3 4 10
		 1 2 3 4 5 15
		 
		Enter a number
		5
		1 A A A A A 
		2 2 B B B B 
		3 3 3 C C C 
		4 4 4 4 D D 
		5 5 5 5 5 E 

 		Enter a number
		5
		**********
		****  ****
		***    ***
		**      **
		*        *
		 *******
		  *****
		   ***
		    *
		 
		 Enter a number
		 5
		 1
		 0 1
		 1 0 1
		 0 1 0 1
		 1 0 1 0 1
		 
		 Enter a number
		 5
		 1
		 2 6
		 3 7 10
		 4 8 11 13
		 5 9 12 14 15
		 
		 Enter a number
		 5
		 A
		 B C
		 D E F
		 G H I J
		 K L M N O
		 */

	}

}
