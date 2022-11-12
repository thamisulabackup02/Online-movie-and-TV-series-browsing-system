package com.pricing;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/deletePricingServlet")
public class deletePricingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String pricing_id = request.getParameter("usid");
		boolean isTrue;
		
		isTrue = pricingDBUtil.deletepricing(pricing_id);
		
		if(isTrue == true) {
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("pricinginsert.jsp");
			dispatcher.forward(request, response);
		}
		else {
			
			List<Pricing> prcDetails = pricingDBUtil.getPricingDetails(pricing_id);
			request.setAttribute("prcDetails", prcDetails);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("usermonthlyPlan.jsp");
			dispatcher.forward(request, response);
		}
		
	}

}
