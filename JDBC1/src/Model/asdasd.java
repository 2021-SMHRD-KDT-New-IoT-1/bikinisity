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
			// 2. OracleDriver.class 동적 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 3. Oracle로 가서 DBid, DBpw를 인증
			String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
			String user = "campus_a_1_1025";
			String password = "smhrd1";
			Connection conn = DriverManager.getConnection(url, user, password);

			if (conn != null) {
				System.out.println("연결 성공");
			} else {
				System.out.println("연결 실패");
			}

			// 4. SQL문 준비
			String sql = "SELECT * FROM Fish_Customer where C_id = ? and C_pw=?";
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, C_id);
			psmt.setString(2, C_pw);
			// 5. SQL문 명령 후 처리
			ResultSet rs = psmt.executeQuery();

			if (rs.next()) {
				System.out.println("로그인성공");
			} else {
				System.out.println("로그인실패");
			}

		} catch (Exception e) {
			System.out.println("실패");
			e.printStackTrace();
		}
	} 
}
