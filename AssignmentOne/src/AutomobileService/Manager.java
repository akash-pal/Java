package AutomobileService;

public class Manager {

	private int managerId;
	private String role;

	public Manager() {
		super();
	}

	public Manager(int managerId, String role) {
		super();
		this.managerId = managerId;
		this.role = role;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + ", role=" + role + "]";
	}

}
