package Model;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/asdasd")
public class asdasd extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String C_id = "123";
		String C_pw = "123";

		try {
			// 2. OracleDriver.class ���� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 3. Oracle�� ���� DBid, DBpw�� ����
			String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
			String user = "campus_a_1_1025";
			String password = "smhrd1";
			Connection conn = DriverManager.getConnection(url, user, password);

			if (conn != null) {
				System.out.println("���� ����");
			} else {
				System.out.println("���� ����");
			}

			// 4. SQL�� �غ�
			String sql = "SELECT * FROM Fish_Customer where C_id = ? and C_pw=?";
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, C_id);
			psmt.setString(2, C_pw);
			// 5. SQL�� ��� �� ó��
			ResultSet rs = psmt.executeQuery();

			if (rs.next()) {
				System.out.println("�α��μ���");
			} else {
				System.out.println("�α��ν���");
			}

		} catch (Exception e) {
			System.out.println("����");
			e.printStackTrace();
		}
	} 
}
