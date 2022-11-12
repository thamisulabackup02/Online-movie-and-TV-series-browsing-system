package Comment;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/CommentServlet")
public class CommentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		
		
		
		String comemail = request.getParameter("comEmail");
		
		
		
		String header = request.getParameter("comheader");
		
		

		String comment = request.getParameter("commentmsg");
		
		
		

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		
		
		boolean isTrue;
		isTrue = CommentDButil.Insertcomment(comemail, header,comment);
		
if(isTrue== true)
{
	
	
	List <Comment> comdetail = CommentDButil.getcommentDetails(comemail);
	request.setAttribute("comdetail", comdetail);
	
	
	
		RequestDispatcher dis = request.getRequestDispatcher("commentdetail.jsp");
		dis.forward(request, response);
		
		
}





	else if(isTrue==false){
		out.println("<script type='text/javascript'>");
		out.println("alert('Comment Not Send try again');");
		out.println("location = 'validunsuc.jsp';");
		out.println("</script>");
	}
















		
	}

}
