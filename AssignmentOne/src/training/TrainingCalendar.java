package training;

import java.util.Date;

public class TrainingCalendar {
	private int calenderId;
	private int courseId;
	private Date startDate;
	private Date endDate;

	public TrainingCalendar() {

	}

	public TrainingCalendar(int calenderId, int courseId, Date startDate,
			Date endDate) {

		this.calenderId = calenderId;
		this.courseId = courseId;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public int getCalenderId() {
		return calenderId;
	}

	public void setCalenderId(int calenderId) {
		this.calenderId = calenderId;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "TrainingCalendar [calenderId=" + calenderId + ", courseId="
				+ courseId + ", startDate=" + startDate + ", endDate="
				+ endDate + "]";
	}

}
