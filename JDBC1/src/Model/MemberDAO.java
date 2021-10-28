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
			//1. ����̹� �����ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
			String user = "campus_a_1_1025";
			String password = "shhrd1";
			
			//2. �����ͺ��̽� ���� ��ü(Connection)����
			conn = DriverManager.getConnection(url, user, password);
		}catch (Exception e) {

			e.printStackTrace();
			System.out.println("�������");
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
	

	//ȸ������ ���(�޼ҵ�)
	public int join(String C_name, String C_address, String C_id, String C_pw, String C_email) {

		//�޾ƿ� ���� DB ���̺� ����
		try {
			connection();
			
			//3.������  sql�� ����(������ ������ ���� �޶����� �κ��� ? �����ָ��)
			String sql = "insert into Fish_CUSTOMER values(?,?,?,?,?)";
			
			//4. sql�� ���� ��ü (preparedStatement)����
			pst = conn.prepareStatement(sql);
			
			
			
			//5. ���ε� ����(?) ä���
			
			
			pst.setString(1, C_name);
			pst.setString(2, C_address);
			pst.setString(3, C_id);
			pst.setString(4, C_pw);
			pst.setString(5, C_email);
			
			//6.sql�� ���� �� ��� ó��
			
			cnt = pst.executeUpdate();
		} catch (Exception e) {
			System.out.println("���� ����");
			e.printStackTrace();
		}finally {
			close();
			
		}
		return cnt;
	}
	
	//�α��� ���
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
				System.out.println("�α��μ���!");
				
//				String get_email = rs.getString("email");
//				String get_tel = rs.getString(2);
//				String get_address = rs.getString(3);
				
//				vo = new MemberVO(get_email, get_tel, get_address);
				String get_id = rs.getString("id");
				String get_pw = rs.getString("pw");
				
			}else {
				System.out.println("�α��� ����!");
			}
			
		} catch (Exception e) {
			System.out.println("�α��� ����");
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
	
	//�����޼ҵ�
	//����ڰ� �Է��� pw, tel, address
	//�� ���̺� ���� ����
	public int update(String C_NAME, String C_ADDRESS, String C_PW, String C_EAMIL) {
		try {
		connection();
		
		//3. sql���� ��ü (PreparedStatement) ��ü ����
		String sql = "UPDATE FISH_CUSTOMER SET C_NAME = ?, C_ADDRESS = ?, C_PW = ? WHERE C_EMAIL = ?";
		
		pst = conn.prepareStatement(sql);

		//4.���ε� ���� ä���
		pst.setString(1, C_NAME);
		pst.setString(2, C_ADDRESS);
		pst.setString(3, C_PW);
		pst.setString(4, C_EAMIL);
		
		cnt = pst.executeUpdate();
		
		//5. SQL�� ��� �� ó��
		//rs.next() -> true / false
		
	} catch (Exception e) {
		System.out.println("���� ����");
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
			
			//3. sql���� ��ü (PreparedStatement) ��ü ����
			String sql = "select C_EMAIL, tel, address from FISH_CUSTOMER";
			
			pst = conn.prepareStatement(sql);
			//5. SQL�� ��� �� ó��
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
			System.out.println("��ȸ ����");
			e.printStackTrace();
		}finally {
			
				close();
				
		}
		return al;
	}
	
	
	//id �ߺ� üũ �޼ҵ�
	
	public boolean idCheck(String C_EMAIL) {
			try {
			
			connection();
			
			//3. sql���� ��ü (PreparedStatement) ��ü ����
			String sql = "select C_EMAIL from FISH_CUSTOMER where C_EMAIL =?";
			
			pst = conn.prepareStatement(sql);

			//4.���ε� ���� ä���
			pst.setString(1, C_EMAIL);
			
			
			//5. SQL�� ��� �� ó��
			rs = pst.executeQuery();
			//rs.next() -> true / false
			if(rs.next()) {
				//�Է��� �̸����� ����� �� ������
				check = true;
				
			}else {
				//�Է��� �̸����� ����� �� ������
				check =false;
			}
			
		} catch (Exception e) {
			System.out.println("�α��� ����");
			e.printStackTrace();
		}finally {
			
				close();
				
		}
			return check;
		
	}
}
	

