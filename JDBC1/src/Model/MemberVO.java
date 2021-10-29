package Model;

public class MemberVO {
	//鞘靛(加己)
	private String C_id;
	private String C_pw;
	private String C_name;
	private String C_address;
	private String C_email;
	
	
	public String getC_id() {
		return C_id;
	}
	public void setC_id(String c_id) {
		C_id = c_id;
	}
	public String getC_pw() {
		return C_pw;
	}
	public void setC_pw(String c_pw) {
		C_pw = c_pw;
	}
	public String getC_name() {
		return C_name;
	}
	public void setC_name(String c_name) {
		C_name = c_name;
	}
	public String getC_address() {
		return C_address;
	}
	public void setC_address(String c_address) {
		C_address = c_address;
	}
	public String getC_email() {
		return C_email;
	}
	public void setC_email(String c_email) {
		C_email = c_email;
	}
	//积己磊
	public MemberVO(String c_id, String c_pw, String c_name, String c_address, String c_email) {
		super();
		C_id = c_id;
		C_pw = c_pw;
		C_name = c_name;
		C_address = c_address;
		C_email = c_email;
	}
	
	 
	
}
