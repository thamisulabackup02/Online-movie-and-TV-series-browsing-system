package logserv;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Updateregemembersevlet")
public class Updateregemembersevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String i = request.getParameter("ucustid");
		String fname = request.getParameter("ufiname");
		String lname = request.getParameter("ulaname");
		String email = request.getParameter("ueml");
		String password = request.getParameter("upaswd");
		String p = request.getParameter("upnum");
		
		
		int Phone = Integer.parseInt(p);
		int id = Integer.parseInt(i);
		
		
		
		boolean isTrue;
		isTrue = rmemberDBvalid.updateregmember(id,fname, lname,email, password, Phone);
		
if(isTrue== true)
{
	
	
	List<Regmember> cdetail = rmemberDBvalid.getCustomerDetails(id);
	request.setAttribute("cdetail", cdetail);
		
	
	RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");
		dis.forward(request, response);
		
		
}
else {
	List<Regmember> cdetail = rmemberDBvalid.getCustomerDetails(id);
	request.setAttribute("cdetail", cdetail);
		
	
	RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");
		dis.forward(request, response);
}

		
		
		
		
		
		
	}

}
