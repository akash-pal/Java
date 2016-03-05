package mobileBillingSystem;

public class BillingSystem {
	
	private int id;
	private int price;
	private String contents;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public BillingSystem() {
		
	}

	public BillingSystem(int id, int price, String contents) {
		this.id = id;
		this.price = price;
		this.contents = contents;
	}

}
