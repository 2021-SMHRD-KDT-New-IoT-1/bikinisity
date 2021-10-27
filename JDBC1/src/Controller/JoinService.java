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
	
		//��û������ ���ڵ� �������
		request.setCharacterEncoding("euc-kr");
		
		//��û������ �޾��ֱ�
		String email = request.getParameter("email");
		String pw =  request.getParameter("pw");
		String tel = request.getParameter("tel");
		String address = request.getParameter("address");
		
		MemberDAO dao = new MemberDAO();
		int cnt = dao.join(email, pw, tel, address, address);
		
		if(cnt >0) {
			System.out.println("���Լ���");
			
			//forward ������� ������ �̵�
			RequestDispatcher rd = request.getRequestDispatcher("join_success.jsp");
			
			//request ������ ����ؾ��� ������ ����
			request.setAttribute("email", email);
			
			//������ �̵��� request, response ��ü����
			rd.forward(request, response);
			
			//response.sendRedirect("join_success.jsp?email="+email);
			//������Ʈ�� ������� ������ ���� -> �������� getParameter()��
			
		}else {
			System.out.println("���Խ���");
			response.sendRedirect("main.jsp");
		}
		
	
	}

}
