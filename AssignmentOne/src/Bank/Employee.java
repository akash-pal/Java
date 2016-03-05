package Bank;

import java.util.Date;

public class Employee {
	private int employeeId;
	private String employeeName;
	private Date startDate;
	private String managerName;
	private Address employeeAddress;
	private Bank bank;

	public Employee() {

	}

	public Employee(int employeeId, String employeeName, Date startDate,
			String managerName, Address employeeAddress) {

		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.startDate = startDate;
		this.managerName = managerName;
		this.employeeAddress = employeeAddress;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public Address getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(Address employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName="
				+ employeeName + ", startDate=" + startDate + ", managerName="
				+ managerName + ", employeeAddress=" + employeeAddress
				+ ", bank=" + bank + "]";
	}

}
