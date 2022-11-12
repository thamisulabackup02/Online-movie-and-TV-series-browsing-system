package com.pricing;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/updatePricingServlet")
public class updatePricingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String idpricing_tb = request.getParameter("usid");
		String category = request.getParameter("category");
		String genres = request.getParameter("genres");
		String hdAvailable = request.getParameter("hdAvailable");
		String watchOnur = request.getParameter("watchOnur");
		String moviesOrTvshow = request.getParameter("moviesOrTvshow");
		String screens = request.getParameter("screens");
		
		
		
		boolean isTrue;
		
		isTrue = pricingDBUtil.updatepricing(idpricing_tb, category, genres, hdAvailable, watchOnur, moviesOrTvshow, screens);
		
		if(isTrue == true) {
			
			List<Pricing> prcDetails = pricingDBUtil.getPricingDetails(idpricing_tb);
			request.setAttribute("prcDetails", prcDetails);

			RequestDispatcher dis = request.getRequestDispatcher("usermonthlyPlan.jsp");
			dis.forward(request, response);
		}else {
			
			List<Pricing> prcDetails = pricingDBUtil.getPricingDetails(idpricing_tb);
			request.setAttribute("prcDetails", prcDetails);
			
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
	}

}