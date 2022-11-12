package logserv;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import payment.Payment;



@WebServlet("/Adminviewpay")
public class Adminviewpay extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List <Payment> pdetails = AdminDBvalid.getPaymentDetails();
		request.setAttribute("pdetails", pdetails);
		
		
		
			RequestDispatcher dis = request.getRequestDispatcher("allpay.jsp");
			dis.forward(request, response);
	}

}
