package Comment;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import logserv.DBfile;


public class CommentDButil {

	
	
	
	
	public static Connection conn = null;
	public static Statement stmnt = null;
	public static ResultSet rs = null;
	public static boolean ifsuccess;
	
	
	
	public static boolean Insertcomment(String comemail, String header, String comment)
	{
		 ifsuccess = false;
		

		try {
			
			
			 conn = DBfile.getConnection();	
			 stmnt  = conn.createStatement();
			
			
			String sql = "Insert into comment values ('"+comemail+"','"+header+"','"+comment+"')";
				int rs = stmnt.executeUpdate(sql);
				
				if(rs > 0)
				{
					ifsuccess = true;
				} 
				else ifsuccess = false;
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		
		
		return ifsuccess;
	}
	
	
public static List<Comment> getcommentDetails(String Email){
		
		
		
		
		ArrayList<Comment> cmnt = new ArrayList<>();
		
		try { 
				conn = DBfile.getConnection();
				stmnt = conn.createStatement();
				String sql = "Select * from comment where comemail='"+Email+"' ";
				rs = stmnt.executeQuery(sql);
				
				while(rs.next()){
					
					String email = rs.getString(1);
					String header = rs.getString(2);
					String comment = rs.getString(3);
					
					Comment com = new Comment(email,header,comment );
					cmnt.add(com);
					
				}
				
				
				
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		
		return cmnt;
	
	}
	

public static boolean updatecomment( String email ,String cheader, String comments )
{
	ifsuccess = false;
	
	try {
		
		conn = DBfile.getConnection();
		stmnt = conn.createStatement();
		
		
		String sql = "update comment set header='"+cheader+"', comment='"+comments+"' where comemail='"+email+"';";
		
		int rs=stmnt.executeUpdate(sql);
		if(rs > 0)
		{
			ifsuccess = true;
		} 
		else ifsuccess = false;
		
		
		
	}
	
	catch(Exception ex)
	{
		ex.printStackTrace();
	}
	
	return ifsuccess;
}






public static boolean deletecomment(String email)
{
	
	try {
		conn = DBfile.getConnection();
		stmnt = conn.createStatement();
		
		String sql = "delete from comment where comemail='"+email+"';";
		int rs = stmnt.executeUpdate(sql);
		
		
		
		if(rs > 0) {
			ifsuccess = true;
		}
		
		else {
			ifsuccess = false;
		}
	}
	
	catch(Exception e)
	{
		
		e.printStackTrace();
		
	}
	
	
	
	
	
	
	
	
	return ifsuccess;
	
	
	
	
}










	
	
	
	
	
	
	
}
