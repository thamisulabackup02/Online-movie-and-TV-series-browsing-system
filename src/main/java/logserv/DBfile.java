package logserv;

import java.sql.*;

public class DBfile {
	
		
		private static String url = "jdbc:mysql://localhost:3306/project";
		private static String username = "root";
		private static String pass = "shenan";
		private static Connection conn;
		
		
		public static Connection getConnection() {
			
			
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				
				conn = DriverManager.getConnection(url,username,pass);
				
				}
			catch(Exception e){
				
				System.out.println("Connection Error");
			}
			
			
			
			return conn;
		}

}
