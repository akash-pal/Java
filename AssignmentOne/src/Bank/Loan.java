package Bank;

public class Loan {
	private int loanNumber;
	private double balance;
	private int accountId;
	private int customerId;

	public Loan() {

	}

	public Loan(int loanNumber, double balance, int accountId, int customerId) {
		this.loanNumber = loanNumber;
		this.balance = balance;
		this.accountId = accountId;
		this.customerId = customerId;
	}

	public int getLoanNumber() {
		return loanNumber;
	}

	public void setLoanNumber(int loanNumber) {
		this.loanNumber = loanNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	@Override
	public String toString() {
		return "Loan [loanNumber=" + loanNumber + ", balance=" + balance
				+ ", accountId=" + accountId + ", customerId=" + customerId
				+ "]";
	}

}
