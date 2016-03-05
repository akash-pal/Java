package exam;

public class Enrolled {

	private int rollNo;
	private int subjectId;
	private int examId;
	
	//CONSTRUCTOR
	public Enrolled(){
		
	}
	
	public Enrolled(int rollNo, int subjectId, int examId){
		this.rollNo = rollNo;
		this.subjectId = subjectId;
		this.examId = examId;
	}
	//SETTERS
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	
	public void setExamId(int examId) {
		this.examId = examId;
	}
	
	//GETTER
	public int getRollNo() {
		return rollNo;
	}
	
	public int getSubjectId() {
		return subjectId;
	}
	
	public int getExamId() {
		return examId;
	}
	
	
	
}
