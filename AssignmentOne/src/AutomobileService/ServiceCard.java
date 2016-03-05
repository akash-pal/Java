package AutomobileService;

import java.util.Date;

public class ServiceCard {

	private int jobId;
	private Date timeIn;
	private Date timeOut;
	private float spareTotal;
	private float serviceTotal;
	private float totalPay;

	public ServiceCard() {
	}

	public ServiceCard(int jobId, Date timeIn, Date timeOut, float spareTotal,
			float serviceTotal, float totalPay) {
		this.jobId = jobId;
		this.timeIn = timeIn;
		this.timeOut = timeOut;
		this.spareTotal = spareTotal;
		this.serviceTotal = serviceTotal;
		this.totalPay = totalPay;
	}

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public Date getTimeIn() {
		return timeIn;
	}

	public void setTimeIn(Date timeIn) {
		this.timeIn = timeIn;
	}

	public Date getTimeOut() {
		return timeOut;
	}

	public void setTimeOut(Date timeOut) {
		this.timeOut = timeOut;
	}

	public float getSpareTotal() {
		return spareTotal;
	}

	public void setSpareTotal(float spareTotal) {
		this.spareTotal = spareTotal;
	}

	public float getServiceTotal() {
		return serviceTotal;
	}

	public void setServiceTotal(float serviceTotal) {
		this.serviceTotal = serviceTotal;
	}

	public float getTotalPay() {
		return totalPay;
	}

	public void setTotalPay(float totalPay) {
		this.totalPay = totalPay;
	}

	@Override
	public String toString() {
		return "ServiceCard [jobId=" + jobId + ", timeIn=" + timeIn
				+ ", timeOut=" + timeOut + ", spareTotal=" + spareTotal
				+ ", serviceTotal=" + serviceTotal + ", totalPay=" + totalPay
				+ "]";
	}

}
