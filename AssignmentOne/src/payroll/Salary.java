package payroll;

public class Salary {
	
	private int employeeId;
	private double basic;
	private double hra;
	private double da;
	private double incentive;
	private double ta;
	private double medicalAllowance;
	public Salary() {
		
	}
	public Salary(int employeeId, double basic, double hra, double da,
			double incentive, double ta, double medicalAllowance) {
	
		this.employeeId = employeeId;
		this.basic = basic;
		this.hra = hra;
		this.da = da;
		this.incentive = incentive;
		this.ta = ta;
		this.medicalAllowance = medicalAllowance;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public double getDa() {
		return da;
	}
	public void setDa(double da) {
		this.da = da;
	}
	public double getIncentive() {
		return incentive;
	}
	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}
	public double getTa() {
		return ta;
	}
	public void setTa(double ta) {
		this.ta = ta;
	}
	public double getMedicalAllowance() {
		return medicalAllowance;
	}
	public void setMedicalAllowance(double medicalAllowance) {
		this.medicalAllowance = medicalAllowance;
	}
	@Override
	public String toString() {
		return "Salary [employeeId=" + employeeId + ", basic=" + basic
				+ ", hra=" + hra + ", da=" + da + ", incentive=" + incentive
				+ ", ta=" + ta + ", medicalAllowance=" + medicalAllowance + "]";
	}
	
}
