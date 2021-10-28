package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

public class MemberDAO {
	Connection conn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	int cnt = 0;
	MemberVO vo = null;
	ArrayList<MemberVO> al =  null;
	boolean check = false;
	int C_q_num = 0 ;
	public void connection() {
		try {
			//1. 드라이버 동적로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
			String user = "campus_a_1_1025";
			String password = "shhrd1";
			
			//2. 데이터베이스 연결 객체(Connection)생성
			conn = DriverManager.getConnection(url, user, password);
		}catch (Exception e) {

			e.printStackTrace();
			System.out.println("연결실패");
		}
	}
	public void close() {
		try {
			if(rs != null) {
				rs.close();
			}
			if(pst != null) {
				pst.close();
			}
			if(conn != null) {
				conn.close();
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		
		
	}
	

	//회원가입 기능(메소드)
	public int join(String C_name, String C_address, String C_id, String C_pw, String C_email) {

		//받아온 값을 DB 테이블에 삽입
		try {
			connection();
			
			//3.실행할  sql문 정의(실행할 때마다 값이 달라지는 부분은 ? 적어주면됨)
			String sql = "insert into Fish_CUSTOMER values(?,?,?,?,?)";
			
			//4. sql문 실행 객체 (preparedStatement)생성
			pst = conn.prepareStatement(sql);
			
			
			
			//5. 바인드 변수(?) 채우기
			
			
			pst.setString(1, C_name);
			pst.setString(2, C_address);
			pst.setString(3, C_id);
			pst.setString(4, C_pw);
			pst.setString(5, C_email);
			
			//6.sql문 실행 후 결과 처리
			
			cnt = pst.executeUpdate();
		} catch (Exception e) {
			System.out.println("가입 실패");
			e.printStackTrace();
		}finally {
			close();
			
		}
		return cnt;
	}
	
	//로그인 기능
	public MemberVO login(String C_id, String C_PW) {
		
		try {
			
			connection();
			
			String sql = "select * from FISH_CUSTOMER where C_id =? and C_PW = ?";
			
			pst = conn.prepareStatement(sql);

			pst.setString(1, C_id);
			pst.setString(2, C_PW);
			
			
			rs = pst.executeQuery();
			//rs.next() -> true / false
			if(rs.next()) {
				System.out.println("로그인성공!");
				
//				String get_email = rs.getString("email");
//				String get_tel = rs.getString(2);
//				String get_address = rs.getString(3);
				
//				vo = new MemberVO(get_email, get_tel, get_address);
				String get_id = rs.getString("id");
				String get_pw = rs.getString("pw");
				
			}else {
				System.out.println("로그인 실패!");
			}
			
		} catch (Exception e) {
			System.out.println("로그인 실패");
			e.printStackTrace();
		}finally {
			try {
				close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return vo;
	}
	
	//수정메소드
	//사용자가 입력한 pw, tel, address
	//로 테이블에 값을 수정
	public int update(String C_NAME, String C_ADDRESS, String C_PW, String C_EAMIL) {
		try {
		connection();
		
		//3. sql실행 객체 (PreparedStatement) 객체 생성
		String sql = "UPDATE FISH_CUSTOMER SET C_NAME = ?, C_ADDRESS = ?, C_PW = ? WHERE C_EMAIL = ?";
		
		pst = conn.prepareStatement(sql);

		//4.바인드 변수 채우기
		pst.setString(1, C_NAME);
		pst.setString(2, C_ADDRESS);
		pst.setString(3, C_PW);
		pst.setString(4, C_EAMIL);
		
		cnt = pst.executeUpdate();
		
		//5. SQL문 명령 후 처리
		//rs.next() -> true / false
		
	} catch (Exception e) {
		System.out.println("수정 실패");
		e.printStackTrace();
	}finally {
		close();
	}
	return cnt;
}
	
	public ArrayList<MemberVO> selectAll() {
		
		al = new ArrayList<MemberVO>();
		
		try {
			
			connection();
			
			//3. sql실행 객체 (PreparedStatement) 객체 생성
			String sql = "select C_EMAIL, tel, address from FISH_CUSTOMER";
			
			pst = conn.prepareStatement(sql);
			//5. SQL문 명령 후 처리
			rs = pst.executeQuery();
			//rs.next() -> true / false
			while(rs.next()) {
				
				String get_email = rs.getString("email");
				String get_tel = rs.getString(2);
				String get_address = rs.getString(3);
				
				vo = new MemberVO(get_email, get_tel, get_address);
				
				al.add(vo);
			}
			
		} catch (Exception e) {
			System.out.println("조회 실패");
			e.printStackTrace();
		}finally {
			
				close();
				
		}
		return al;
	}
	
	
	//id 중복 체크 메소드
	
	public boolean idCheck(String C_EMAIL) {
			try {
			
			connection();
			
			//3. sql실행 객체 (PreparedStatement) 객체 생성
			String sql = "select C_EMAIL from FISH_CUSTOMER where C_EMAIL =?";
			
			pst = conn.prepareStatement(sql);

			//4.바인드 변수 채우기
			pst.setString(1, C_EMAIL);
			
			
			//5. SQL문 명령 후 처리
			rs = pst.executeQuery();
			//rs.next() -> true / false
			if(rs.next()) {
				//입력한 이메일을 사용할 수 없을때
				check = true;
				
			}else {
				//입력한 이메일을 사용할 수 있을때
				check =false;
			}
			
		} catch (Exception e) {
			System.out.println("로그인 실패");
			e.printStackTrace();
		}finally {
			
				close();
				
		}
			return check;
		
	}
}
	

