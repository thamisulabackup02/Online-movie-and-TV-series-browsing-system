package com.pricing;

import java.sql.Connection;
import java.sql.DriverManager;



public class DBConnect {

	private static String url = "jdbc:mysql://localhost:3306/project";
	private static String username = "root";
	private static String pass = "shenan";

	private static Connection con;
	
	public static Connection getConnection() {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url, username, pass);
			
		}
		catch (Exception e) {
			System.out.println("Database vada na!!!");
		}
		
		return con;
		
	}
	
	
}
