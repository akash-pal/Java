package Lic;

import java.util.Date;

public class Customer {
	private int customerId;
	private String customerName;
	private String gender;
	private Address address;
	private Date dob;
	private double income;
	private String qualification;
	private String maritalStatus;
	
	public Customer(int customerId, String customerName, String gender,
			Address address, Date dob, double income, String qualification,
			String maritalStatus) {
		
		this.customerId = customerId;
		this.customerName = customerName;
		this.gender = gender;
		this.address = address;
		this.dob = dob;
		this.income = income;
		this.qualification = qualification;
		this.maritalStatus = maritalStatus;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public Customer() {
		
	}

}
