package eventmanagement;

import java.util.Date;


public class Event {

	private int eventId;
	private String eventTitle;
	private Date startDate;
	private Date endDate;
	private double amount;
	private int eventManager;
	
	//CONSTRUCTOR
	public Event(){
		
	}
	
	public Event(int id, String title, Date sDate, Date eDate, double amnt, int manager){
		eventId = id;
		eventTitle = title;
		startDate = sDate;
		endDate = eDate;
		amount = amnt;
		eventManager = manager;
	}
	//GETTER
	public int getEventId() {
		return eventId;
	}
	
	public int getEventManager() {
		return eventManager;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public String getEventTitle() {
		return eventTitle;
	}
	
	public Date getEndDate() {
		return endDate;
	}
	
	public Date getStartDate() {
		return startDate;
	}
	
	//SETTERS
	public void setEventTitle(String eventTitle) {
		this.eventTitle = eventTitle;
	}
	
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public void setEventManager(int eventManager) {
		this.eventManager = eventManager;
	}
	
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
}
