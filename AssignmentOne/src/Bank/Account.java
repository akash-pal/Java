package Bank;

import java.util.Date;

public class Account {
	private int accountNumber;
	private double balance;
	private String accountType;
	private Date accessDate;
	private Bank bank;

	public Account() {

	}

	public Account(int accountNumber, double balance, String accountType,
			Date accessDate, Bank bank) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accountType = accountType;
		this.accessDate = accessDate;
		this.bank = bank;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Date getAccessDate() {
		return accessDate;
	}

	public void setAccessDate(Date accessDate) {
		this.accessDate = accessDate;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", balance="
				+ balance + ", accountType=" + accountType + ", accessDate="
				+ accessDate + ", bank=" + bank + "]";
	}

}
