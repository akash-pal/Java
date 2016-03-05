public class QuadraticEquation {

	private int quadraticCofficient;
	private int linearCofficient;
	private int constant;

	public QuadraticEquation() {
		super();
		quadraticCofficient = 0;
		linearCofficient = 0;
		constant = 0;
	}

	public QuadraticEquation(int quadraticCofficient, int linearCofficient,
			int constant) {
		super();
		this.quadraticCofficient = quadraticCofficient;
		this.linearCofficient = linearCofficient;
		this.constant = constant;
	}

	public int getQuadraticCofficient() {
		return quadraticCofficient;
	}

	public void setQuadraticCofficient(int quadraticCofficient) {
		this.quadraticCofficient = quadraticCofficient;
	}

	public int getLinearCofficient() {
		return linearCofficient;
	}

	public void setLinearCofficient(int linearCofficient) {
		this.linearCofficient = linearCofficient;
	}

	public int getConstant() {
		return constant;
	}

	public void setConstant(int constant) {
		this.constant = constant;
	}

	public void findRoots() {

		double discriminant = Math.pow(linearCofficient, 2) - 4
				* quadraticCofficient * constant;

		if (discriminant > 0) {
			double realRootOne = (-linearCofficient + Math.sqrt(discriminant))
					/ (2 * quadraticCofficient);
			double realRootTwo = (-linearCofficient - Math.sqrt(discriminant))
					/ (2 * quadraticCofficient);

			System.out.println("The two real roots are " + realRootOne
					+ " and " + realRootTwo);
		} else if (discriminant == 0) {
			double realRoot = (-linearCofficient) / (2 * quadraticCofficient);
			System.out.println("The one real root is " + realRoot);
		} else {
			System.out.println("The roots are imiginary");
		}
	}

}
