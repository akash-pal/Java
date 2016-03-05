package Lic;

import java.util.Date;

public class Payment {
	private int recepitNo;
	private Date receiptDate;
	private double totalAmount;
	private int insurancePeriod;
	private double paymentLateness;
	private double paymentLeft;
	
	public Payment(int recepitNo, 
			Date receiptDate, double totalAmount,
			int insurancePeriod, double paymentLateness, double paymentLeft) {
		this.recepitNo = recepitNo;
		this.receiptDate = receiptDate;
		this.totalAmount = totalAmount;
		this.insurancePeriod = insurancePeriod;
		this.paymentLateness = paymentLateness;
		this.paymentLeft = paymentLeft;
	}

	public int getRecepitNo() {
		return recepitNo;
	}

	public void setRecepitNo(int recepitNo) {
		this.recepitNo = recepitNo;
	}

	public Date getReceiptDate() {
		return receiptDate;
	}

	public void setReceiptDate(Date receiptDate) {
		this.receiptDate = receiptDate;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public int getInsurancePeriod() {
		return insurancePeriod;
	}

	public void setInsurancePeriod(int insurancePeriod) {
		this.insurancePeriod = insurancePeriod;
	}

	public double getPaymentLateness() {
		return paymentLateness;
	}

	public void setPaymentLateness(double paymentLateness) {
		this.paymentLateness = paymentLateness;
	}

	public double getPaymentLeft() {
		return paymentLeft;
	}

	public void setPaymentLeft(double paymentLeft) {
		this.paymentLeft = paymentLeft;
	}

	public Payment() {
		
	}

}
