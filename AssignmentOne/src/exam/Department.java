package exam;

public class Department {

	private int departmentNo;
	private String departmentName;
	
	//COSNTRUCTOR
	public Department(){
		
	}
	
	public Department(int departmentNo, String departmentName){
		this.departmentName = departmentName;
		this.departmentNo = departmentNo;
	}

	//SETTERS
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public void setDepartmentNo(int departmentNo) {
		this.departmentNo = departmentNo;
	}
	
	//GETTERS
	public String getDepartmentName() {
		return departmentName;
	}
	
	public int getDepartmentNo() {
		return departmentNo;
	}
	
	
	
}
