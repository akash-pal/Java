package mobileBillingSystem;

public class CustomerCare {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CustomerCare() {
		
	}

	public CustomerCare(int id, String name) {
		this.id = id;
		this.name = name;
	}

}
