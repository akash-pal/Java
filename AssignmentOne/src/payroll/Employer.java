package payroll;

public class Employer {

	private int employerId;
	private String employerName;
	private String designation;
	private String department;

	public Employer() {
		
	}

	public Employer(int employerId, String employerName, String designation,
			String department) {
		
		this.employerId = employerId;
		this.employerName = employerName;
		this.designation = designation;
		this.department = department;
	}

	public int getEmployerId() {
		return employerId;
	}

	public void setEmployerId(int employerId) {
		this.employerId = employerId;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employer [employerId=" + employerId + ", employerName="
				+ employerName + ", designation=" + designation
				+ ", department=" + department + "]";
	}

}
