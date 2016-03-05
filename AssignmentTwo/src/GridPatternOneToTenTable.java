public class GridPatternOneToTenTable {

	public void printTable() {

		for (int i = 0; i <= 10; i++)
			System.out.print(i + "   ");

		System.out.println();
		for (int i = 1; i <= 10; i++) {

			System.out.print(i + " ");
			for (int j = 1; j <= 10; j++) {

				if (i * j < 10)
					System.out.print("00" + i * j + " ");
				else if (i * j < 100)
					System.out.print("0" + i * j + " ");
				else
					System.out.print(i * j + " ");

			}

			System.out.print("\n");
		}
	}
}
