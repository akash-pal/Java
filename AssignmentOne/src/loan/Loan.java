package loan;

import java.util.Date;

public class Loan {

	private int loanId;
	private int customerId;
	private String loanType;
	private int loanTenure;
	private double loanAmount;
	private double interestRate;
	private Date issueDate;

	public Loan() {
	}

	public Loan(int loanId, int customerId, String loanType, int loanTenure,
			double loanAmount, double interestRate, Date issueDate) {
		this.loanId = loanId;
		this.customerId = customerId;
		this.loanType = loanType;
		this.loanTenure = loanTenure;
		this.loanAmount = loanAmount;
		this.interestRate = interestRate;
		this.issueDate = issueDate;
	}

	public int getLoanId() {
		return loanId;
	}

	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public int getLoanTenure() {
		return loanTenure;
	}

	public void setLoanTenure(int loanTenure) {
		this.loanTenure = loanTenure;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	@Override
	public String toString() {
		return "Loan [loanId=" + loanId + ", customerId=" + customerId
				+ ", loanType=" + loanType + ", loanTenure=" + loanTenure
				+ ", loanAmount=" + loanAmount + ", interestRate="
				+ interestRate + ", issueDate=" + issueDate + "]";
	}

}
