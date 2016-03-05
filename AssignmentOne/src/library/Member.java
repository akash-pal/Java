package library;

public class Member {
	
	private int memberId;
	private String memberType;
	private String memberName;
	private Address memberAddress;
	
	
	
	
	public Member() {
		
	}
	public Member(int memberId, String memberType, String memberName,
			Address memberAddress) {
		this.memberId = memberId;
		this.memberType = memberType;
		this.memberName = memberName;
		this.memberAddress = memberAddress;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberType() {
		return memberType;
	}
	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public Address getMemberAddress() {
		return memberAddress;
	}
	public void setMemberAddress(Address memberAddress) {
		this.memberAddress = memberAddress;
	}
	
	
	
}
