package pizza;

import java.util.Date;

public class Payment {

	private int customerId;
	private double amount;
	private int creditCardNo;
	private Date payDate;

	public Payment() {

	}

	public Payment(int customerId, double amount, int creditCardNo, Date payDate) {

		this.customerId = customerId;
		this.amount = amount;
		this.creditCardNo = creditCardNo;
		this.payDate = payDate;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getCreditCardNo() {
		return creditCardNo;
	}

	public void setCreditCardNo(int creditCardNo) {
		this.creditCardNo = creditCardNo;
	}

	public Date getPayDate() {
		return payDate;
	}

	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}

	@Override
	public String toString() {
		return "Payment [customerId=" + customerId + ", amount=" + amount
				+ ", creditCardNo=" + creditCardNo + ", payDate=" + payDate
				+ "]";
	}

}
