package employee;

public class SoftwareDeveloper extends Employee {
	private final double bonusRate = 20;

	@Override
	public double bonusSalary(double experience) {
		return bonusRate * experience;
	}
}
