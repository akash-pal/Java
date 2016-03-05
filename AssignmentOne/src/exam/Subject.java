package exam;

public class Subject {

	private int examId;
	private String name;
	
	//CONSTRUCTOR
	public Subject(){
		
	}
	
	public Subject(int examId, String name){
		this.examId = examId;
		this.name = name;
	}
	//SETTER
	public void setExamId(int examId) {
		this.examId = examId;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//GETTER
	public int getExamId() {
		return examId;
	}
	public String getName() {
		return name;
	}
	
	
}
