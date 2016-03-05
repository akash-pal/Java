package pattern;

import java.util.Scanner;

public class Pattern7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = in.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print("*");
			}

			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <= n; j++) {
				System.out.print(j + 1);

			}
			System.out.println();
		}
		in.close();

	}
}
