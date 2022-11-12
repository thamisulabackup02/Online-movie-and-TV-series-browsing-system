package Comment;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class UpdateComServlet
 */
@WebServlet("/UpdateComServlet")
public class UpdateComServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("ucomEmail");
		String cheader = request.getParameter("ucomheader");
		String comment = request.getParameter("ucommentmsg");
		
		
		boolean check;
		check = CommentDButil.updatecomment(email, cheader, comment);
		
	
		
if(check== true)
{
	
	
	List<Comment>comdetail = CommentDButil.getcommentDetails(email);
	request.setAttribute("comdetail", comdetail);
		
	
	RequestDispatcher dis = request.getRequestDispatcher("commentdetail.jsp");
		dis.forward(request, response);
		
		
}
else {
	List<Comment>comdetail = CommentDButil.getcommentDetails(email);
	request.setAttribute("comdetail", comdetail);
		
	
	RequestDispatcher dis = request.getRequestDispatcher("commentdetail.jsp");
		dis.forward(request, response);
		
}
		
		
	}

}
