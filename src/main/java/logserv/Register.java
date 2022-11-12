package logserv;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
					String fname = request.getParameter("fname");
					String lname = request.getParameter("lname");
					String regemail = request.getParameter("regemail");
					String pwd = request.getParameter("regpass");
					String phn = request.getParameter("phone");
					
					int Phone = Integer.parseInt(phn);
				
					boolean isTrue;
					isTrue = rmemberDBvalid.registercustomer(fname, lname, regemail, pwd, Phone);
					
			if(isTrue== true)
			{
					RequestDispatcher dis = request.getRequestDispatcher("Login.jsp");
					dis.forward(request, response);
					
					
			}
			else {
				RequestDispatcher dis2 = request.getRequestDispatcher("validunsuc.jsp");
				dis2.forward(request, response);
			}

}
}