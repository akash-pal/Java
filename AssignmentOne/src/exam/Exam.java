package exam;

public class Exam {

	private int sem;
	private int year;
	private int examId;
	private int subjectId;
	private int deptId;
	
	//CONSTRUCTOR
	public Exam(){
		
	}
	public Exam(int sem, int year, int examId, int subjectId, int deptId){
		this.sem = sem;
		this.year = year;
		this.examId = examId;
		this.subjectId = subjectId;
		this.deptId = deptId;
	}
	//GETTERS
	public int getSem() {
		return sem;
	}
	
	public int getYear() {
		return year;
	}
	
	public int getExamId() {
		return examId;
	}
	
	public int getSubjectId() {
		return subjectId;
	}
	
	public int getDeptId() {
		return deptId;
	}

	
	//SETTERS
	public void setSem(int sem) {
		this.sem = sem;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setExamId(int examId) {
		this.examId = examId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	
	
	
	
}
