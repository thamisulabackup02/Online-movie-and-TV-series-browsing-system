package payment;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logserv.Regmember;
import logserv.rmemberDBvalid;


@WebServlet("/UpdatePayServlet")
public class UpdatePayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String email = request.getParameter("upayEmail");
		String packagee = request.getParameter("upackagee");
		String phone = request.getParameter("uPayphone");
		
		
		
		boolean isTrue;
		isTrue = PaymentDButil.updatepayment(email,packagee,phone);
		
if(isTrue== true)
{
	
	
	List<Payment> pdetail = PaymentDButil.getPaymentDetails(email);
	request.setAttribute("pdetail", pdetail);
		
	
	RequestDispatcher dis = request.getRequestDispatcher("paymentdetail.jsp");
		dis.forward(request, response);
		
		
}
else {
	List<Payment> pdetail = PaymentDButil.getPaymentDetails(email);
	request.setAttribute("pdetail", pdetail);
		
	
	RequestDispatcher dis = request.getRequestDispatcher("paymentdetail.jsp");
		dis.forward(request, response);
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
