package Controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.MemberDAO;


@WebServlet("/JoinService")
public class JoinService extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//요청데이터 인코딩 지정방식
		request.setCharacterEncoding("euc-kr");
		
		//요청데이터 받아주기
	
		String C_id = request.getParameter("C_id");
		String C_pw = request.getParameter("C_pw");
		String C_name = request.getParameter("C_name");
		String C_address =  request.getParameter("C_address");
		String C_email = request.getParameter("C_email");
		
		MemberDAO dao = new MemberDAO();
		int cnt = dao.join(C_id, C_pw, C_name, C_address, C_email);
		
		if(cnt >0) {
			System.out.println("가입성공");
			
			//request 영역에 기억해야할 데이터 설정
			request.setAttribute("C_id", C_id);
			
			
			
		}else {
			System.out.println("가입실패");
			response.sendRedirect("main.jsp");
		}
		
	
	}

}
