package ticketing;

import java.util.Arrays;
import java.util.Date;

public class Booking {

	private int bookingId;
	private int passengerId;
	private int noOfTickets;
	private int[] seatNo;
	private String Source;
	private String Destination;
	private Date bookingDate;
	private Date journeyDate;
	private double amount;

	public Booking() {

	}

	public Booking(int bookingId, int passengerId, int noOfTickets,
			int[] seatNo, String source, String destination, Date bookingDate,
			Date journeyDate, double amount) {

		this.bookingId = bookingId;
		this.passengerId = passengerId;
		this.noOfTickets = noOfTickets;
		this.seatNo = seatNo;
		Source = source;
		Destination = destination;
		this.bookingDate = bookingDate;
		this.journeyDate = journeyDate;
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

	public String getSource() {
		return Source;
	}

	public void setSource(String source) {
		Source = source;
	}

	public String getDestination() {
		return Destination;
	}

	public void setDestination(String destination) {
		Destination = destination;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public Date getJourneyDate() {
		return journeyDate;
	}

	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", passengerId="
				+ passengerId + ", noOfTickets=" + noOfTickets + ", seatNo="
				+ Arrays.toString(seatNo) + ", Source=" + Source
				+ ", Destination=" + Destination + ", bookingDate="
				+ bookingDate + ", journeyDate=" + journeyDate + ", amount="
				+ amount + "]";
	}
}
