package Model;

public class MemberVO {
	//필드(속성)
	private String id;
	private String pw;
	//생성자
	public MemberVO(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	}
