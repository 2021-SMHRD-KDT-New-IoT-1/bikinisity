package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

@WebServlet("/LogoutService")
public class LogoutService extends HttpServlet {

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
		//세션 삭제 (현재 로그인한 사용자의 정보 삭제)
		
		HttpSession session = request.getSession();
		
		session.removeAttribute("member");
		
		response.sendRedirect("main.jsp");
		
	}

}
