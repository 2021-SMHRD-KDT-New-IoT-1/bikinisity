package Model;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Join extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("euc-kr");

		java.sql.Connection conn =null;
		PreparedStatement psmt = null;
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String id =  request.getParameter("id");
		String pw = request.getParameter("pw");
		String email = request.getParameter("email");
		
		try {
			//1. ����̹� �����ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
			String user = "campus_a_1_1025";
			String password = "shhrd1";
			
			//2. �����ͺ��̽� ���� ��ü(Connection)����
			conn = DriverManager.getConnection(url, user, password);
			
			
			if (conn != null) {
				System.out.println("���Ἲ��");
			}else {
				System.out.println("�������");
			}
			//4.SQL�� �غ�
			String sql = "insert into JDBC_member values(?,?,?,?,?)";
			
			psmt = conn.prepareStatement(sql);
			psmt.setString(1,name);
			psmt.setString(2, address);
			psmt.setString(3, id);
			psmt.setString(4, pw);
			psmt.setString(5, email);
			
			//5. SQL�� ��� �� ó��
			int cnt = psmt.executeUpdate();
			
			if (cnt > 0) {
				response.sendRedirect("join.jsp");
			}else {
				
			}
		} catch (Exception e) {

		e.printStackTrace();
		}finally {
			//1. ��������
			//2. ����ó��
			try {
				if(psmt != null) {
					psmt.close();
					
				}if (conn != null) {
					
					conn.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}


		}
	}
}
