public class MatrixMultiplication {

	private int[][] arrayOne;
	private int[][] arrayTwo;
	private int[][] arrayThree;

	public MatrixMultiplication() {
		arrayOne = new int[5][5];
		arrayTwo = new int[5][5];
		arrayThree = new int[5][5];
	}

	public MatrixMultiplication(int[][] arrayOne, int[][] arrayTwo) {
		super();
		this.arrayOne = arrayOne;
		this.arrayTwo = arrayTwo;
		arrayThree = new int[arrayOne.length][arrayTwo[0].length];
	}

	public void multiply() {
		int i, j, k, sum = 0;
		int rowsInArrayOne = arrayOne.length;
		int columnsInArrayOne = arrayOne[0].length;

		int rowsInArrayTwo = arrayTwo.length;
		int columnsInArrayTwo = arrayTwo[0].length;

		if (columnsInArrayOne == rowsInArrayTwo) {
			for (i = 0; i < rowsInArrayOne; i++) {
				for (j = 0; j < columnsInArrayTwo; j++) {
					sum = 0;
					for (k = 0; k < columnsInArrayOne; k++) {
						sum = sum + (arrayOne[i][k] * arrayTwo[k][j]);
					}
					arrayThree[i][j] = sum;
				}
			}

			System.out.println("Final matrix after multiplication is:");

			for (i = 0; i < arrayThree.length; i++) {
				for (j = 0; j < arrayThree[0].length; j++) {
					System.out.print(arrayThree[i][j] + " ");
				}
				System.out.println();
			}

		}
		else
		{
			System.out.println("incompatible dimensions");
		}

	}

}
