package ticketing;

import java.util.Arrays;
import java.util.Date;

public class Cancellation {

	private int bookingId;
	private int passengerId;
	private int noOfTickets;
	private int[] seatNo;
	private Date cancelDate;
	private double amount;
	
	public Cancellation() {
		super();
	}

	public Cancellation(int bookingId, int passengerId, int noOfTickets,
			int[] seatNo, Date cancelDate, double amount) {
		super();
		this.bookingId = bookingId;
		this.passengerId = passengerId;
		this.noOfTickets = noOfTickets;
		this.seatNo = seatNo;
		this.cancelDate = cancelDate;
		this.amount = amount;
	}


	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}

	public int getNoOfTickets() {
		return noOfTickets;
	}

	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}

	public int[] getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(int[] seatNo) {
		this.seatNo = seatNo;
	}

	public Date getCancelDate() {
		return cancelDate;
	}

	public void setCancelDate(Date cancelDate) {
		this.cancelDate = cancelDate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Cancellation [bookingId=" + bookingId + ", passengerId="
				+ passengerId + ", noOfTickets=" + noOfTickets + ", seatNo="
				+ Arrays.toString(seatNo) + ", cancelDate=" + cancelDate
				+ ", amount=" + amount + "]";
	}

}
