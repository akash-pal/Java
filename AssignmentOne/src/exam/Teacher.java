package exam;

public class Teacher {

	private int departmentNo;
	private int teacherId;
	private String name;
	private int contactNo;
	private String qualification;
	
	//CONSTRUCTOR
	public Teacher(){
		
	}
	
	public Teacher(int departmentNo, int teacherId, String name, int contactNo, String qualification){
		this.contactNo = contactNo;
		this.name = name;
		this.departmentNo = departmentNo;
		this.qualification = qualification;
		this.teacherId = teacherId;
	}
	//GETTERS
	public int getDepartmentNo() {
		return departmentNo;
	}
	
	public int getTeacherId() {
		return teacherId;
	}
	
	public String getName() {
		return name;
	}
	
	public int getContactNo() {
		return contactNo;
	}
	
	public String getQualification() {
		return qualification;
	}


	//SETTERS
	public void setDepartmentNo(int departmentNo) {
		this.departmentNo = departmentNo;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
	
	
}
