package com.pricing;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/pricinginsertServlet")
public class pricinginsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String category = request.getParameter("category");
		String genres = request.getParameter("genres");
		String hdAvailable = request.getParameter("hdAvailable");
		String watchOnur = request.getParameter("watchOnur");
		String moviesOrTvshow = request.getParameter("moviesOrTvshow");
		String screens = request.getParameter("screens");
		
		boolean isTrue;
		
		isTrue = pricingDBUtil.insertPricing(category, genres, hdAvailable, watchOnur,moviesOrTvshow, screens);
		
		if(isTrue == true) {
			RequestDispatcher dis =request.getRequestDispatcher("success.jsp");
			dis.forward(request, response);
		} else {
			RequestDispatcher dis2 =request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
	}
 
}
