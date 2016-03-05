package training;

import java.util.Arrays;

public class Student {

	private int studentId;
	private String studentName;
	private char gender;
	private Address address;
	private int phoneNumber;
	private int[] courseId;

	public Student() {

	}

	public Student(int studentId, String studentName, char gender,
			Address address, int phoneNumber, int[] courseId) {

		this.studentId = studentId;
		this.studentName = studentName;
		this.gender = gender;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.courseId = courseId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int[] getCourseId() {
		return courseId;
	}

	public void setCourseId(int[] courseId) {
		this.courseId = courseId;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName="
				+ studentName + ", gender=" + gender + ", address=" + address
				+ ", phoneNumber=" + phoneNumber + ", courseId="
				+ Arrays.toString(courseId) + "]";
	}

}
