package Lic;

import java.util.Date;

public class Agent {
	private int agentCode;
	private String agentName;
	private Address address;
	private Date dob;
	private double experience;
	private String branch;

	public Agent() {

	}

	public Agent(int agentCode, String agentName, Address address, Date dob,
			double experience, String branch) {

		this.agentCode = agentCode;
		this.agentName = agentName;
		this.address = address;
		this.dob = dob;
		this.experience = experience;
		this.branch = branch;
	}

	public int getAgentCode() {
		return agentCode;
	}

	public void setAgentCode(int agentCode) {
		this.agentCode = agentCode;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
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

	public double getExperience() {
		return experience;
	}

	public void setExperience(double experience) {
		this.experience = experience;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

}
