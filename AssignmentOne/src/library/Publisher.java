package library;

public class Publisher {

	private int publisherId;
	private String publisherName;
	private Address publisherAddress;

	public Publisher() {

	}

	public Publisher(int publisherId, String publisherName,
			Address publisherAddress) {

		this.publisherId = publisherId;
		this.publisherName = publisherName;
		this.publisherAddress = publisherAddress;
	}

	public int getPublisherId() {
		return publisherId;
	}

	public void setPublisherId(int publisherId) {
		this.publisherId = publisherId;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	public Address getPublisherAddress() {
		return publisherAddress;
	}

	public void setPublisherAddress(Address publisherAddress) {
		this.publisherAddress = publisherAddress;
	}

	@Override
	public String toString() {
		return "Publisher [publisherId=" + publisherId + ", publisherName="
				+ publisherName + ", publisherAddress=" + publisherAddress
				+ "]";
	}

}
