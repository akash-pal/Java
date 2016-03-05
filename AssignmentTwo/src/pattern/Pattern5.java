package pattern;

import java.util.Scanner;

public class Pattern5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = in.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" " + j);
			}
			int sum = 0;
			for (int j = 1; j <= i; j++) {
				if (i != 1)
					sum = sum + j;
			}
			if (i != 1)
				System.out.print(" " + sum);
			System.out.println();
		}
		in.close();
	}
}
