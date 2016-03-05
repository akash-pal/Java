package trading;

public class User {
	
	private int userId;
	private int userContact;
	private String userName;
	private String userEmail;
	private Address userAddress;
	public User() {
		
	}
	public User(int userId, int userContact, String userName, String userEmail,
			Address userAddress) {
		
		this.userId = userId;
		this.userContact = userContact;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userAddress = userAddress;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getUserContact() {
		return userContact;
	}
	public void setUserContact(int userContact) {
		this.userContact = userContact;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public Address getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(Address userAddress) {
		this.userAddress = userAddress;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userContact=" + userContact
				+ ", userName=" + userName + ", userEmail=" + userEmail
				+ ", userAddress=" + userAddress + "]";
	}
	
}
