package employee;

public class JuniorSoftwareDeveloper extends Employee {
	private final double bonusRate = 15;

	@Override
	public double bonusSalary(double experience) {
		return bonusRate * experience;
	}
}
