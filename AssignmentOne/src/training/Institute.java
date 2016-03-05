package training;

public class Institute {

	private int instituteCode;
	private String instituteName;
	private String instituteDescription;
	private Address address;

	public Institute() {
		
	}

	public Institute(int instituteCode, String instituteName,
			String instituteDescription, Address address) {
		
		this.instituteCode = instituteCode;
		this.instituteName = instituteName;
		this.instituteDescription = instituteDescription;
		this.address = address;
	}

	public int getInstituteCode() {
		return instituteCode;
	}

	public void setInstituteCode(int instituteCode) {
		this.instituteCode = instituteCode;
	}

	public String getInstituteName() {
		return instituteName;
	}

	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	public String getInstituteDescription() {
		return instituteDescription;
	}

	public void setInstituteDescription(String instituteDescription) {
		this.instituteDescription = instituteDescription;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Institute [instituteCode=" + instituteCode + ", instituteName="
				+ instituteName + ", instituteDescription="
				+ instituteDescription + ", address=" + address + "]";
	}

}
