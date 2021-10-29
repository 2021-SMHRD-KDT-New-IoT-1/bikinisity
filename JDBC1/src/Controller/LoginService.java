package Controller;

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
import javax.servlet.http.HttpSession;

import Model.MemberDAO;
import Model.MemberVO;

@WebServlet("/LoginService")
public class LoginService extends HttpServlet {
	//��ü - > ����Ʈ�ڵ�, (����ȭ)
	//����Ʈ�ڵ� -> ��ü (������ȭ)
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		String C_id =  request.getParameter("id");
		String C_pw = request.getParameter("id");
		MemberDAO dao = new MemberDAO();
		MemberVO vo = dao.login(C_id,C_pw);
		
		if(vo != null) {
		//���� ��ü ����
		HttpSession session = request.getSession();
		
		//���� �� ����
		session.setAttribute("member", vo);
		response.sendRedirect("main.jsp");
		}else {
			response.sendRedirect("main.jsp");
		}
		
		
	}



	}


