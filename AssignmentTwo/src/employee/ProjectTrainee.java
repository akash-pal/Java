package employee;

public class ProjectTrainee extends Employee {

	private final double bonusRate=10;
	
	@Override
	public double bonusSalary(double experience) {
		return bonusRate * experience;
	}
}
