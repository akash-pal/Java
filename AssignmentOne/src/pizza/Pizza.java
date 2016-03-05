package pizza;

public class Pizza {
	private int pizzaId;
	private String pizzaName;
	private int size;
	private String ingedients;
	private double price;

	public Pizza() {

	}

	public Pizza(int pizzaId, String pizzaName, int size, String ingedients,
			double price) {

		this.pizzaId = pizzaId;
		this.pizzaName = pizzaName;
		this.size = size;
		this.ingedients = ingedients;
		this.price = price;
	}

	public int getPizzaId() {
		return pizzaId;
	}

	public void setPizzaId(int pizzaId) {
		this.pizzaId = pizzaId;
	}

	public String getPizzaName() {
		return pizzaName;
	}

	public void setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getIngedients() {
		return ingedients;
	}

	public void setIngedients(String ingedients) {
		this.ingedients = ingedients;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pizza [pizzaId=" + pizzaId + ", pizzaName=" + pizzaName
				+ ", size=" + size + ", ingedients=" + ingedients + ", price="
				+ price + "]";
	}

}
