package Bank;

public class Bank {
	private int bankId;
	private String bankName;
	private String bankCity;

	public Bank() {

	}

	public Bank(int bankId, String bankName, String bankCity) {

		this.bankId = bankId;
		this.bankName = bankName;
		this.bankCity = bankCity;
	}

	public int getBankId() {
		return bankId;
	}

	public void setBankId(int bankId) {
		this.bankId = bankId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankCity() {
		return bankCity;
	}

	public void setBankCity(String bankCity) {
		this.bankCity = bankCity;
	}

	@Override
	public String toString() {
		return "Bank [bankId=" + bankId + ", bankName=" + bankName
				+ ", bankCity=" + bankCity + "]";
	}

}
