package library;

public class Supplier {
	
	private int supplierId;
	private String supplierName;
	private Address supplierAddress;
	
	
	
	public Supplier() {
		
	}
	public Supplier(int supplierId, String supplierName, Address supplierAddress) {
		
		this.supplierId = supplierId;
		this.supplierName = supplierName;
		this.supplierAddress = supplierAddress;
	}
	public int getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public Address getSupplierAddress() {
		return supplierAddress;
	}
	public void setSupplierAddress(Address supplierAddress) {
		this.supplierAddress = supplierAddress;
	}
	
	
	
	
}
