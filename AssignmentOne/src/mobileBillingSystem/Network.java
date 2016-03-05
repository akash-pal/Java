package mobileBillingSystem;

public class Network {
	
	private int networkId;
	private String area;
	private String location;

	public int getNetworkId() {
		return networkId;
	}

	public void setNetworkId(int networkId) {
		this.networkId = networkId;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Network() {
		
	}

	public Network(int networkId, String area, String location) {
		this.networkId = networkId;
		this.area = area;
		this.location = location;
	}

}
