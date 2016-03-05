package loan;

public class LoanApplication {
	private int applicationId;
	private String loanType;
	private double loanAmount;
	private double monthlyIncome;

	public LoanApplication() {
		
	}

	public LoanApplication(int applicationId, String loanType,
			double loanAmount, double monthlyIncome) {
	
		this.applicationId = applicationId;
		this.loanType = loanType;
		this.loanAmount = loanAmount;
		this.monthlyIncome = monthlyIncome;
	}

	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public double getMonthlyIncome() {
		return monthlyIncome;
	}

	public void setMonthlyIncome(double monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}

	@Override
	public String toString() {
		return "LoanApplication [applicationId=" + applicationId
				+ ", loanType=" + loanType + ", loanAmount=" + loanAmount
				+ ", monthlyIncome=" + monthlyIncome + "]";
	}

}
