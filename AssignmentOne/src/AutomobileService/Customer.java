package AutomobileService;

public class Customer {

	private int customerId;
	private String customerName;
	private String vehicleName;
	private int vehicleNo;

	public Customer() {
	
	}

	public Customer(int customerId, String customerName, String vehicleName,
			int vehicleNo) {
		
		this.customerId = customerId;
		this.customerName = customerName;
		this.vehicleName = vehicleName;
		this.vehicleNo = vehicleNo;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public int getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(int vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName="
				+ customerName + ", vehicleName=" + vehicleName
				+ ", vehicleNo=" + vehicleNo + "]";
	}

}
