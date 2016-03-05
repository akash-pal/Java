package loan;

import java.util.Date;

public class ReceivedEmi {
	private int receiptNo;
	private int customerId;
	private Date emiDate;
	private Date receiptDate;
	private double emiAmount;
	private double lateFineCharge;
	private double totalAmount;

	public ReceivedEmi() {

	}

	public ReceivedEmi(int receiptNo, int customerId, Date emiDate,
			Date receiptDate, double emiAmount, double lateFineCharge,
			double totalAmount) {
		this.receiptNo = receiptNo;
		this.customerId = customerId;
		this.emiDate = emiDate;
		this.receiptDate = receiptDate;
		this.emiAmount = emiAmount;
		this.lateFineCharge = lateFineCharge;
		this.totalAmount = totalAmount;
	}

	public int getReceiptNo() {
		return receiptNo;
	}

	public void setReceiptNo(int receiptNo) {
		this.receiptNo = receiptNo;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public Date getEmiDate() {
		return emiDate;
	}

	public void setEmiDate(Date emiDate) {
		this.emiDate = emiDate;
	}

	public Date getReceiptDate() {
		return receiptDate;
	}

	public void setReceiptDate(Date receiptDate) {
		this.receiptDate = receiptDate;
	}

	public double getEmiAmount() {
		return emiAmount;
	}

	public void setEmiAmount(double emiAmount) {
		this.emiAmount = emiAmount;
	}

	public double getLateFineCharge() {
		return lateFineCharge;
	}

	public void setLateFineCharge(double lateFineCharge) {
		this.lateFineCharge = lateFineCharge;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

}
