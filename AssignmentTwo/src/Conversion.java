public class Conversion {


	public void decimalToBinary(int number) {

		int[] binary = new int[10000];
		int count = 0, remainder;
		while (number > 0) {
			remainder = number % 2;
			binary[count++] = remainder;
			number = number / 2;
		}
		System.out.println();
		for (int i = count - 1; i >= 0; i--) {
			System.out.print(binary[i] + " ");
		}
		System.out.println();
	}

	public void binaryToDecimal(int number) {
		
		int[] decimal = new int[10];
		int count = 0, remainder;
		while (number > 0) {
			remainder = number % 10;
			decimal[count++] = remainder;
			number = number / 10;

		}

		int sum = 0;
		System.out.println();
		for (int i = 0; i < count; i++) {
			sum = (int) (sum + decimal[i] * Math.pow(2, i));
		}
		System.out.println(sum);
	}

}
