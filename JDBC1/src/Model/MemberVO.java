package Model;

public class MemberVO {
	//鞘靛(加己)
	private String email;
	private String tel;
	private String address;
	//积己磊
	public MemberVO(String email, String tel, String address) {
	
		this.email = email;
		this.tel = tel;
		this.address = address;
	}
	//皋家靛(get)
	public String getEmail() {
		return email;
	}
	public String getTel() {
		return tel;
	}
	public String getAddress() {
		return address;
	}
	

}
