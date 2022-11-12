package payment;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logserv.Regmember;
import logserv.rmemberDBvalid;


@WebServlet("/PaymentServlet")
public class PaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
		
		

		String payemail = request.getParameter("payEmail");
		
		
		
		String packagee = request.getParameter("packagee");
		
		

		String phonenumber = request.getParameter("Payphone");
		
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		
		boolean isTrue;
		isTrue = PaymentDButil.Insertpacakge(payemail, packagee,phonenumber);
		
if(isTrue== true)
{
	
	
	List <Payment> pdetail = PaymentDButil.getPaymentDetails(payemail);
	request.setAttribute("pdetail", pdetail);
	
	
	
		RequestDispatcher dis = request.getRequestDispatcher("paymentdetail.jsp");
		dis.forward(request, response);
		
		
}


		
		
		
		
else if(isTrue==false){
	out.println("<script type='text/javascript'>");
	out.println("alert('Payment failed! try again');");
	out.println("location = 'payment.jsp';");
	out.println("</script>");
}
		
		
		
		
		
	}

}
