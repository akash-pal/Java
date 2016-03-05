package Bank;

public class Customer {
	private int customerId;
	private String customerName;
	private Address customerAddress;
	private Account account;
	private Loan loan;

	public Customer() {

	}

	public Customer(int customerId, String customerName,
			Address customerAddress, Account account, Loan loan) {

		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.account = account;
		this.loan = loan;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Address getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Loan getLoan() {
		return loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName="
				+ customerName + ", customerAddress=" + customerAddress
				+ ", account=" + account + ", loan=" + loan + "]";
	}

}
