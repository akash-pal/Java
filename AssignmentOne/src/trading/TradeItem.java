package trading;

public class TradeItem {
	private int itemId, categoryId;
	private double quantity;
	private String itemName, status;
	private double itemPrice;

	public TradeItem() {
		super();
	}

	public TradeItem(int itemId, int categoryId, double quantity,
			String itemName, String status, double itemPrice) {
		super();
		this.itemId = itemId;
		this.categoryId = categoryId;
		this.quantity = quantity;
		this.itemName = itemName;
		this.status = status;
		this.itemPrice = itemPrice;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	@Override
	public String toString() {
		return "TradeItem [itemId=" + itemId + ", categoryId=" + categoryId
				+ ", quantity=" + quantity + ", itemName=" + itemName
				+ ", status=" + status + ", itemPrice=" + itemPrice + "]";
	}

}
