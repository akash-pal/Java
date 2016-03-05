package Lic;

import java.util.Date;

public class Policy {
	private int policyHolderNo;
	private String productname;
	private double sumAssured;
	private int agentCode;
	private Date contractDate;
	private int paymentYear;
	
	public Policy(int policyHolderNo, String productname, double sumAssured,
			int agentCode, Date contractDate, int paymentYear) {
		this.policyHolderNo = policyHolderNo;
		this.productname = productname;
		this.sumAssured = sumAssured;
		this.agentCode = agentCode;
		this.contractDate = contractDate;
		this.paymentYear = paymentYear;
	}

	public int getPolicyHolderNo() {
		return policyHolderNo;
	}

	public void setPolicyHolderNo(int policyHolderNo) {
		this.policyHolderNo = policyHolderNo;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public double getSumAssured() {
		return sumAssured;
	}

	public void setSumAssured(double sumAssured) {
		this.sumAssured = sumAssured;
	}

	public int getAgentCode() {
		return agentCode;
	}

	public void setAgentCode(int agentCode) {
		this.agentCode = agentCode;
	}

	public Date getContractDate() {
		return contractDate;
	}

	public void setContractDate(Date contractDate) {
		this.contractDate = contractDate;
	}

	public int getPaymentYear() {
		return paymentYear;
	}

	public void setPaymentYear(int paymentYear) {
		this.paymentYear = paymentYear;
	}

	public Policy() {
		
	}

}
