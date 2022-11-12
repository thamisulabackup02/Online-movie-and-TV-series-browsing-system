package moviee;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/movread")
public class movread extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
		String get1 = request.getParameter("1");
		
		if(get1!=null) {
			String mov1 = get1.substring(0,1);
			int i1=Integer.parseInt(mov1);
		
		
		
		
		

			String s = String.valueOf(i1);
	
			List<movie> mdetail =   Moviedbvalid.getCustomerDetails(1);
			request.setAttribute("mdetail", mdetail);
	
	
	
	
	
			RequestDispatcher dis = request.getRequestDispatcher("1.jsp");
			dis.forward(request, response);
	
	
		
		
		
		
		
		}
		
		else {
		
		String get2 = request.getParameter("2");
		
		if(get2!=null) {
		String mov2 = get2.substring(0,1);
		int i2=Integer.parseInt(mov2);
		
		

		String s = String.valueOf(i2);
	
	List<movie> m1detail =   Moviedbvalid.getCustomerDetails(2);
	request.setAttribute("m1detail", m1detail);
	
	
	
	
	
	RequestDispatcher dis = request.getRequestDispatcher("2.jsp");
	dis.forward(request, response);
		
	
		
		
	
		}
		 {
			
			String get3 = request.getParameter("3");
			
			if(get3!=null) {
			String mov3 = get3.substring(0,1);
			int i3=Integer.parseInt(mov3);
			
			

			String s = String.valueOf(i3);
		
		List<movie> m2detail =   Moviedbvalid.getCustomerDetails(3);
		request.setAttribute("m2detail", m2detail);
		
		
		RequestDispatcher dis = request.getRequestDispatcher("3.jsp");
		dis.forward(request, response);
			
		
			}
		
		
		
		
	}
		 {
				
				String get4 = request.getParameter("4");
				
				if(get4!=null) {
				String mov4 = get4.substring(0,1);
				int i4=Integer.parseInt(mov4);
				
				

				String s = String.valueOf(i4);
			
			List<movie> m3detail =   Moviedbvalid.getCustomerDetails(4);
			request.setAttribute("m3detail", m3detail);
			
			
			RequestDispatcher dis = request.getRequestDispatcher("4.jsp");
			dis.forward(request, response);
				
			
				}
			
			
			
			
		}
		 
		 
		 {
				
				String get5 = request.getParameter("5");
				
				if(get5!=null) {
				String mov5 = get5.substring(0,1);
				int i5=Integer.parseInt(mov5);
				
				

				String s = String.valueOf(i5);
			
			List<movie> m4detail =   Moviedbvalid.getCustomerDetails(5);
			request.setAttribute("m4detail", m4detail);
			
			
			RequestDispatcher dis = request.getRequestDispatcher("5.jsp");
			dis.forward(request, response);
				
			
				}
			
			
			
			
		}
		 
		 
		 
		 
		 

}
	}
}
