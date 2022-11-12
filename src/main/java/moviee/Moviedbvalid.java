package moviee;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//import logserv.Regmember;
import moviee.DBfile;
import moviee.movie;

public class Moviedbvalid {

	public static Connection conn = null;
	public static Statement stmnt = null;
	public static ResultSet rs = null;
	public static boolean ifsuccess;
	
	
	
	
	
	
	
public static List<movie> getCustomerDetails(int i){
		
		
		
		
		ArrayList<movie> mov = new ArrayList<>();
		
		try { 
				conn = DBfile.getConnection();
				stmnt = conn.createStatement();
				String sql = "Select * from movie where idmovie = " +i +"";
				rs = stmnt.executeQuery(sql);
				
				while(rs.next()){
					  i = rs.getInt(1);
					String title = rs.getString(2);
					String reyear = rs.getString(3);
					String genre = rs.getString(4);
					String description = rs.getString(5);
					String actor = rs.getString(6);
					String picurl = rs.getString(7);
					
					movie m = new movie(i,title,reyear , genre ,description,actor,picurl );
					mov.add(m);
					
				}
				
				
				
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		
		return mov;
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
