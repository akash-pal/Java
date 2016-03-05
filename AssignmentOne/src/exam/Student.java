package exam;

public class Student {

	private int rollNo;
	private String name;
	private int regNo;
	private int contactNo;
	
	//CONSTRUCTOR
	public Student(){
		
	}
	
	public Student(int rollNo, String name, int regNo, int contactNo){
		this.regNo = rollNo;
		this.name = name;
		this.regNo = regNo;
		this.contactNo = contactNo;
	}
	
	//GETTERS
	public int getRollNo() {
		return rollNo;
	}
	public String getName() {
		return name;
	}
	public int getRegNo() {
		return regNo;
	}
	public int getContactNo() {
		return contactNo;
	}
	
	
	//SETTERS
	
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	
	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}
	
	
}
