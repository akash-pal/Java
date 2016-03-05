package ticketing;

import java.util.Date;

public class Payment {

	private int paymentId;
	private int passengerId;
	private double amount;
	private int creditCardNo;
	private Date payDate;

	public Payment() {
	}

	public Payment(int paymentId, int passengerId, double amount,
			int creditCardNo, Date payDate) {
		this.paymentId = paymentId;
		this.passengerId = passengerId;
		this.amount = amount;
		this.creditCardNo = creditCardNo;
		this.payDate = payDate;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
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
		return "Payment [paymentId=" + paymentId + ", passengerId="
				+ passengerId + ", amount=" + amount + ", creditCardNo="
				+ creditCardNo + ", payDate=" + payDate + "]";
	}

}
