package trading;

import java.util.Date;

public class Bill {

	private int billId, customerId;
	private Date billDate;
	private double discount, amount;
	private String status;

	public Bill() {
		super();
	}

	public Bill(int billId, int customerId, Date billDate, double discount,
			double amount, String status) {
		super();
		this.billId = billId;
		this.customerId = customerId;
		this.billDate = billDate;
		this.discount = discount;
		this.amount = amount;
		this.status = status;
	}

	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public Date getBillDate() {
		return billDate;
	}

	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Bill [billId=" + billId + ", customerId=" + customerId
				+ ", billDate=" + billDate + ", discount=" + discount
				+ ", amount=" + amount + ", status=" + status + "]";
	}

}
