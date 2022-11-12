package Comment;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/DeleteComServlet")
public class DeleteComServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
		
		
		String email = request.getParameter("dcomEmail");
		
		boolean isTrue;
		
		
		isTrue = CommentDButil.deletecomment(email);
		
		if(isTrue ==true) {
			RequestDispatcher dis = request.getRequestDispatcher("comment.jsp");
			dis.forward(request, response);
		}
		else {
			
			List<Comment> comdetail = CommentDButil.getcommentDetails(email);
			request.setAttribute("comdetail",comdetail);
			
			RequestDispatcher dis = request.getRequestDispatcher("commentdetail.jsp");
			dis.forward(request, response);
		}
		
}

		
		
		
		
		
		
		
		
		
		
		

		
		
		
	

}
