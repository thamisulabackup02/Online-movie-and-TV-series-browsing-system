package com.pricing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class pricingDBUtil {
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static List<Pricing> validate(String idpricing_tb ){    
		
	ArrayList<Pricing> prc= new ArrayList<>();
			
	//validate
	try {
		con= DBConnect.getConnection();
		stmt = con.createStatement();
		String sql = "select * from pricing_tb where idpricing_tb='"+idpricing_tb+"'";
		rs =stmt.executeQuery(sql);
		
		if(rs.next()) {
			int pricing_id = rs.getInt(1);
			String category = rs.getString(2);
			String genres = rs.getString(3);
			String hdAvailable = rs.getString(4);
			String watchOnur = rs.getString(5);
			String moviesOrTvshow = rs.getString(6);
			int screens = rs.getInt(7);
			Pricing p = new Pricing(pricing_id, category, genres, hdAvailable, watchOnur,moviesOrTvshow, screens  );
			prc.add(p);
		}
		
	}
	catch (Exception e) {
		e.printStackTrace();
	}

    return prc;
	}
	
	public static boolean insertPricing(String category, String genres, String hdAvailable, String watchOnur, String moviesOrTvshow, String screens) {
		
		boolean isSuccess = false;
	
		
		try {
			con= DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "insert into pricing_tb values (0,'"+category+"','"+genres+"','"+hdAvailable+"','"+watchOnur+"','"+moviesOrTvshow+"','"+screens+"')";
			int rs=stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;		
	}
	
	public static boolean updatepricing(String pricing_id, String category, String genres, String hdAvailable, String watchOnur, String moviesOrTvshow, String screens){
		
		try {
			con= DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "update pricing_tb set category='"+category+"',genres='"+genres+"',hdAvailable='"+hdAvailable+"',watchOnur='"+watchOnur+"',moviesOrTvshow='"+moviesOrTvshow+"',screens='"+screens+"'"+ "where idpricing_tb='"+pricing_id+"'";
			int rs=stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	public static List<Pricing> getPricingDetails(String pricing_id){
		
		int convertedpricing_id = Integer.parseInt(pricing_id);
		ArrayList<Pricing> prc = new ArrayList<>();
		
		try {
			con= DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from pricing_tb where idpricing_tb='"+convertedpricing_id+"'";
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				int idpricing_tb = rs.getInt(1);
				String category = rs.getString(2);
				String genres = rs.getString(3);
				String hdAvailable = rs.getString(4);
				String watchOnur = rs.getString(5);
				String moviesOrTvshow = rs.getString(6);
				int screens = rs.getInt(7);
				
				Pricing p = new Pricing(idpricing_tb, category, genres, hdAvailable, watchOnur,moviesOrTvshow, screens);
				prc.add(p);
				
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return prc;
		
	}
	
	public static boolean deletepricing(String pricing_id) {
		
		int convertedpricing_id = Integer.parseInt(pricing_id);
		
		try {
			con= DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "delete from pricing_tb where idpricing_tb='"+convertedpricing_id+"'";
			int r = stmt.executeUpdate(sql);
			
			if(r > 0 ) {
				
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	
		return isSuccess;
	}
		
	
}