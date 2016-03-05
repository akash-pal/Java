package tasktracking;

public class EmployeeTasks {

	private int taskId;
	private int employeeId;

	// CONSTRUCTORS
	public EmployeeTasks() {

	}

	public EmployeeTasks(int taskId, int employeeId) {
		this.taskId = taskId;
		this.employeeId = employeeId;
	}

	// SETTERS
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	// GETTERS
	public int getTaskId() {
		return taskId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

}
