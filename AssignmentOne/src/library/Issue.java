package library;

import java.util.Date;

public class Issue {
	
	private int issueId;
	private int[] bookId;
	private int memberId;
	private int noOfBooksIssued;
	private int maxBookLimit;
	private Date issueDate;
	private Date returnDate;
	private double lateFine;
	
	
	
	
	public Issue() {
		
	}
	public Issue(int issueId, int[] bookId, int memberId, int noOfBooksIssued,
			int maxBookLimit, Date issueDate, Date returnDate, double lateFine) {
		this.issueId = issueId;
		this.bookId = bookId;
		this.memberId = memberId;
		this.noOfBooksIssued = noOfBooksIssued;
		this.maxBookLimit = maxBookLimit;
		this.issueDate = issueDate;
		this.returnDate = returnDate;
		this.lateFine = lateFine;
	}
	public int getIssueId() {
		return issueId;
	}
	public void setIssueId(int issueId) {
		this.issueId = issueId;
	}
	public int[] getBookId() {
		return bookId;
	}
	public void setBookId(int[] bookId) {
		this.bookId = bookId;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public int getNoOfBooksIssued() {
		return noOfBooksIssued;
	}
	public void setNoOfBooksIssued(int noOfBooksIssued) {
		this.noOfBooksIssued = noOfBooksIssued;
	}
	public int getMaxBookLimit() {
		return maxBookLimit;
	}
	public void setMaxBookLimit(int maxBookLimit) {
		this.maxBookLimit = maxBookLimit;
	}
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	public double getLateFine() {
		return lateFine;
	}
	public void setLateFine(double lateFine) {
		this.lateFine = lateFine;
	}
	
	
	

}
