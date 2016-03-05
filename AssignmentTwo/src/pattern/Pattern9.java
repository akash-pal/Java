package pattern;

import java.util.Scanner;

public class Pattern9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n = in.nextInt();
		System.out.println("Pattern is");
		for (int i = 1; i <= n; i++) {
			int a = 7;
			for (int j = 1; j <= i; j++) {
				System.out.print(a + " ");
				a++;
			}
			System.out.print("$");
			System.out.println();
		}

		for (int i = 1; i <= n - 1; i++) {
			System.out.print("*" + " ");
			int a = 7 + i;
			for (int j = n - 1; j >= i; j--) {
				System.out.print(a + " ");
				a++;
			}

			System.out.println();
		}
		in.close();
	}
}