package logserv;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/loginservlet")
public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		
		String email_uname = request.getParameter("lname");
		
		
		
		String passwd = request.getParameter("lpass");
		
		if(email_uname.substring(0, 5).equals("admin")==false)
		{
			boolean isTrue ;
		
			isTrue = rmemberDBvalid.validate(email_uname, passwd);
		
			
		
		
			if(isTrue==true)
		{
			List <Regmember> cdetail = rmemberDBvalid.getCustomerDetails(email_uname);
			request.setAttribute("cdetail", cdetail);
			
			RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");
			dis.forward(request, response);
		}
		
		else if(isTrue==false){
			out.println("<script type='text/javascript'>");
			out.println("alert('Your username or Password is incorrect');");
			out.println("location = 'Login.jsp';");
			out.println("</script>");
		}
		
		
		
		
		}
		
		else {
			
			
			boolean isTrue ;
			
			isTrue = AdminDBvalid.validate(email_uname, passwd);
		
			
		
		
			if(isTrue==true)
		{
			
			
			RequestDispatcher dis = request.getRequestDispatcher("admin.jsp");
			dis.forward(request, response);
		}
		
		else if(isTrue==false){
			out.println("<script type='text/javascript'>");
			out.println("alert('Your username or Password is incorrect');");
			out.println("location = 'Login.jsp';");
			out.println("</script>");
		}
		
		
		
		
			
			
			}
	
		
		
		
		
		
		
	}

}
