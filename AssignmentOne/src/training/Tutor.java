package training;

import java.util.Arrays;

public class Tutor {

	private int tutorId;
	private String tutorName;
	private Address address;
	private int phoneNumber;
	private int[] courseId;

	public Tutor() {
		
	}

	public Tutor(int tutorId, String tutorName, Address address,
			int phoneNumber, int[] courseId) {
		
		this.tutorId = tutorId;
		this.tutorName = tutorName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.courseId = courseId;
	}

	public int getTutorId() {
		return tutorId;
	}

	public void setTutorId(int tutorId) {
		this.tutorId = tutorId;
	}

	public String getTutorName() {
		return tutorName;
	}

	public void setTutorName(String tutorName) {
		this.tutorName = tutorName;
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
		return "Tutor [tutorId=" + tutorId + ", tutorName=" + tutorName
				+ ", address=" + address + ", phoneNumber=" + phoneNumber
				+ ", courseId=" + Arrays.toString(courseId) + "]";
	}

}
