package AutomobileService;

public class ServiceStation {

	private int stationId;
	private String name;
	private String address;
	private String giveConfirmation;

	public ServiceStation() {
	}

	public ServiceStation(int stationId, String name, String address,
			String giveConfirmation) {
		this.stationId = stationId;
		this.name = name;
		this.address = address;
		this.giveConfirmation = giveConfirmation;
	}

	public int getStationId() {
		return stationId;
	}

	public void setStationId(int stationId) {
		this.stationId = stationId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGiveConfirmation() {
		return giveConfirmation;
	}

	public void setGiveConfirmation(String giveConfirmation) {
		this.giveConfirmation = giveConfirmation;
	}

	@Override
	public String toString() {
		return "ServiceStation [stationId=" + stationId + ", name=" + name
				+ ", address=" + address + ", giveConfirmation="
				+ giveConfirmation + "]";
	}

}
