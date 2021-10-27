package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/IdCheckService")
public class IdCheckService extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		
		System.out.println(email);
		
		Model.MemberDAO dao = new Model.MemberDAO();
		boolean check = dao.idCheck(email);
		
		//출력 스트림(통로)
		PrintWriter out = response.getWriter();
		
		out.print(check);
	}

}
