package logserv;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/adminviewregmem")
public class adminviewregmem extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List <Regmember> cdetails = AdminDBvalid.getCustomerDetails();
		request.setAttribute("cdetails", cdetails);
		
		RequestDispatcher dis = request.getRequestDispatcher("allregmember.jsp");
		dis.forward(request, response);
	}

}
