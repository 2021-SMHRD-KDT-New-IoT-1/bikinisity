package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.MemberDAO;
import Model.MemberVO;

@WebServlet("/UpdateService")
public class UpdateService extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("euc-kr");//��û������ ���ڵ� ����� �ѱ���� 
		
		
		HttpSession session = request.getSession();// ���� ��ü ����
		MemberVO vo = (MemberVO)session.getAttribute("member"); //���� �α����� �������(������) ����
		String email = vo.getEmail(); //���� �α����� ������� �̸���
		//������ ����� ���� 
		String pw = request.getParameter("pw");
		String tel = request.getParameter("tel");
		String address = request.getParameter("address");
		
		MemberDAO dao = new MemberDAO();
		int cnt = dao.update(pw, tel, address, email);
		
		//dao ��� ȣ�� -> �������θ� �Ǵ��� �� �ִ� �� ��ȯ
		//���������� ��쿡�� �ܼ� -> "��������"
		//���������� ��쿡�� �ܼ� -> "��������"
		if(cnt>0) {
	         System.out.println("��������");
	         
	         MemberVO vo2 = new MemberVO(email, tel, address);

	        session.setAttribute("member", vo2);
	         RequestDispatcher rd = request.getRequestDispatcher("main.jsp");

	         request.setAttribute("email", email);

	         rd.forward(request, response);

	      }
	      else {
	         System.out.println("��������");
	         response.sendRedirect("update.jsp");
	      }
	}

}
