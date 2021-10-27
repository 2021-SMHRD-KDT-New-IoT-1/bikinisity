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
		String email = request.getParameter("email");
		String pw =  request.getParameter("pw");
		String tel = request.getParameter("tel");
		String address = request.getParameter("address");
		
		MemberDAO dao = new MemberDAO();
		int cnt = dao.join(email, pw, tel, address, address);
		
		if(cnt >0) {
			System.out.println("가입성공");
			
			//forward 방식으로 페이지 이동
			RequestDispatcher rd = request.getRequestDispatcher("join_success.jsp");
			
			//request 영역에 기억해야할 데이터 설정
			request.setAttribute("email", email);
			
			//페이지 이동시 request, response 객체전달
			rd.forward(request, response);
			
			//response.sendRedirect("join_success.jsp?email="+email);
			//쿼리스트링 방식으로 데이터 전송 -> 받을때는 getParameter()로
			
		}else {
			System.out.println("가입실패");
			response.sendRedirect("main.jsp");
		}
		
	
	}

}
