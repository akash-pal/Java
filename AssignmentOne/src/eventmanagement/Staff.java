package eventmanagement;

import java.util.Date;


public class Staff {

	
	private String name;
	private String address;
	private int noOfClients;
	private int staffId;
	private Date dateOfBirth;
	
	//CONSTRUCTOR
	
	public Staff(){
		
	}
	
	public Staff(String name, String address, int noOfClients, int staffId, Date dateOfBirth){
		this.name = name;
		this.address = address;
		this.noOfClients = noOfClients;
		this.staffId = staffId;
		this.dateOfBirth = dateOfBirth;
		
	}
	
	//GETTERS
	public String getName() {
		return name;
	}
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	
	public int getStaffId() {
		return staffId;
	}
	
	public int getNoOfClients() {
		return noOfClients;
	}
	
	public String getAddress() {
		return address;
	}
	
	//SETTERS
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setNoOfClients(int noOfClients) {
		this.noOfClients = noOfClients;
	}
	
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
}
