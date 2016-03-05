package mobileBillingSystem;

public class Person {

	private String personName;
	private int personId;
	private String personAddress;
	
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonAddress() {
		return personAddress;
	}
	public void setPersonAddress(String personAddress) {
		this.personAddress = personAddress;
	}
	public Person(String personName, int personId, String personAddress) {
		this.personName = personName;
		this.personId = personId;
		this.personAddress = personAddress;
	}
	public Person(){
		
	}
	
}
