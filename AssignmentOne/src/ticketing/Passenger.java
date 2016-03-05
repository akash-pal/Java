package ticketing;

import java.util.Date;

public class Passenger {

	private int passengerId;
	private String passengerName;
	private Address address;
	private int phoneNo;
	private Date dob;

	public Passenger() {

	}

	public Passenger(int passengerId, String passengerName, Address address,
			int phoneNo, Date dob) {

		this.passengerId = passengerId;
		this.passengerName = passengerName;
		this.address = address;
		this.phoneNo = phoneNo;
		this.dob = dob;
	}

	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
}
