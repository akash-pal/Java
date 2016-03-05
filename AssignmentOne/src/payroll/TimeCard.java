package payroll;

import java.util.Date;

public class TimeCard {

	private int timeCardId;
	private int employeeId;
	private Time timeIn;
	private Time timeOut;
	private Date date;

	public TimeCard() {

	}

	public TimeCard(int employeeId, int timeCardId, Time timeIn, Time timeOut,
			double paymentDay, Date date) {
		this.employeeId = employeeId;
		this.timeCardId = timeCardId;
		this.timeIn = timeIn;
		this.timeOut = timeOut;
		this.date = date;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getTimeCardId() {
		return timeCardId;
	}

	public void setTimeCardId(int timeCardId) {
		this.timeCardId = timeCardId;
	}

	public Time getTimeIn() {
		return timeIn;
	}

	public void setTimeIn(Time timeIn) {
		this.timeIn = timeIn;
	}

	public Time getTimeOut() {
		return timeOut;
	}

	public void setTimeOut(Time timeOut) {
		this.timeOut = timeOut;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
