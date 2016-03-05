package loan;

import java.util.Date;

public class Customer {
	private int customerId;
	private String name;
	private Address address;
	private int phoneNumber;
	private String gender;
	private Date dob;
	private int mobileNo;
	private String emailId;

	public Customer() {
		
	}

	public Customer(int customerId, String name, Address address,
			int phoneNumber, String gender, Date dob, int mobileNo,
			String emailId) {
		
		this.customerId = customerId;
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		this.dob = dob;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public int getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name
				+ ", address=" + address + ", phoneNumber=" + phoneNumber
				+ ", gender=" + gender + ", dob=" + dob + ", mobileNo="
				+ mobileNo + ", emailId=" + emailId + "]";
	}

}
