package Model;

public class MemberVO {
	//�ʵ�(�Ӽ�)
	private String email;
	private String tel;
	private String address;
	//������
	public MemberVO(String email, String tel, String address) {
	
		this.email = email;
		this.tel = tel;
		this.address = address;
	}
	//�޼ҵ�(get)
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
