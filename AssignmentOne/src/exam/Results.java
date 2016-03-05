package exam;

import java.util.Date;


public class Results {

	private int rollNo;
	private int examId;
	private Date datePublished;
	private String grade;
	private int subId;
	
	
	//CONSTRUCTOR
	public Results(){
		
	}
	
	public Results(int rollNo, int examId, Date datePublished, String grade, int subId){
		this.rollNo = rollNo;
		this.examId = examId;
		this.datePublished = datePublished;
		this.grade = grade;
		this.subId = subId;
	}
	//SETTER
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public void setExamId(int examId) {
		this.examId = examId;
	}
	
	public void setDatePublished(Date datePublished) {
		this.datePublished = datePublished;
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public void setSubId(int subId) {
		this.subId = subId;
	}
	
	//GETTER
	public int getRollNo() {
		return rollNo;
	}
	
	public int getExamId() {
		return examId;
	}
	
	public Date getDatePublished() {
		return datePublished;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public int getSubId() {
		return subId;
	}
	
	
	
}
