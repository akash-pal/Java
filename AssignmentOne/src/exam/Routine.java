package exam;

import java.util.Date;


public class Routine {

	private Time examTime;
	private Date examDate;
	private int roomNo;
	private int examId;
	
	//CONSTRUCTOR
	public Routine(){
		
	}
	
	public Routine(Time examTime, Date examDate, int roomNo, int examId){
		this.examTime = examTime;
		this.examDate = examDate;
		this.roomNo = roomNo;
		this.examId = examId;
	}
	//SETTERS
	public void setExamTime(Time examTime) {
		this.examTime = examTime;
	}
	public void setExamDate(Date examDate) {
		this.examDate = examDate;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public void setExamId(int examId) {
		this.examId = examId;
	}
	
	//GETTERS
	public Time getExamTime() {
		return examTime;
	}
	public Date getExamDate() {
		return examDate;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public int getExamId() {
		return examId;
	}
	
	
	
	
	
}
