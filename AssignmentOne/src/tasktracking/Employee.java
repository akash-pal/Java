package tasktracking;

public class Employee {

	private int employeeId;
	private String employeeName;
	private int phoneNo;
	private Address address;
	private String employeeManager;

	// CONSTRUCTORS
	public Employee() {

	}

	public Employee(int employeeId, String employeeName, int phoneNo,
			Address address, String employeeManager) {

		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.phoneNo = phoneNo;
		this.address = address;
		this.employeeManager = employeeManager;
	}

	// SETTERS
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setEmployeeManager(String employeeManager) {
		this.employeeManager = employeeManager;
	}

	// GETTERS
	public int getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public Address getAddress() {
		return address;
	}

	public String getEmployeeManager() {
		return employeeManager;
	}

}
