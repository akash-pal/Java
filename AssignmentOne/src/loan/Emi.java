package loan;

public class Emi {

	private int customerId;
	private double emiAmount;
	private double interestAmount;
	private double totalAmount;

	public Emi() {

	}

	public Emi(int customerId, double emiAmount, double interestAmount,
			double totalAmount) {
		this.customerId = customerId;
		this.emiAmount = emiAmount;
		this.interestAmount = interestAmount;
		this.totalAmount = totalAmount;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public double getEmiAmount() {
		return emiAmount;
	}

	public void setEmiAmount(double emiAmount) {
		this.emiAmount = emiAmount;
	}

	public double getInterestAmount() {
		return interestAmount;
	}

	public void setInterestAmount(double interestAmount) {
		this.interestAmount = interestAmount;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Override
	public String toString() {
		return "Emi [customerId=" + customerId + ", emiAmount=" + emiAmount
				+ ", interestAmount=" + interestAmount + ", totalAmount="
				+ totalAmount + "]";
	}

}
