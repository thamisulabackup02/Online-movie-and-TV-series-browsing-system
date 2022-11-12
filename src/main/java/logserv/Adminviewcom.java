package logserv;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Comment.Comment;



@WebServlet("/Adminviewcom")
public class Adminviewcom extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
		
		
		List <Comment> comdetails = AdminDBvalid.getcommentDetails();
		request.setAttribute("comdetails", comdetails);
		
		
		
			RequestDispatcher dis = request.getRequestDispatcher("allcom.jsp");
			dis.forward(request, response);
		
		
		
		
		
		
		
		
		
	}

}
