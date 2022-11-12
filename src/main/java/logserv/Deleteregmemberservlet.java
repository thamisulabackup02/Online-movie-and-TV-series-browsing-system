package logserv;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Deleteregmemberservlet")
public class Deleteregmemberservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			String i = request.getParameter("dcustid");
			int did = Integer.parseInt(i);
			
			boolean isTrue = rmemberDBvalid.deleteCustomer(did);
		
		
			if(isTrue ==true) {
				RequestDispatcher dis = request.getRequestDispatcher("register.jsp");
				dis.forward(request, response);
			}
			else {
				
				List<Regmember> cdetail = rmemberDBvalid.getCustomerDetails(did);
				request.setAttribute("cdetail",cdetail);
				
				RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");
				dis.forward(request, response);
			}
			
			
			
			
			
	}

}
