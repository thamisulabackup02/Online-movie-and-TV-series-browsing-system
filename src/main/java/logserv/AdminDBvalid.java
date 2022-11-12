package logserv;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Comment.Comment;
import payment.Payment;

public class AdminDBvalid {

	
	
	public static Connection conn = null;
	public static Statement stmnt = null;
	public static ResultSet rs = null;
	public static boolean ifsuccess;
	
	
	
	
	
	public static boolean validate(String username , String Password)
	{
		
		
	
		try {
			
			conn = DBfile.getConnection();
			stmnt = conn.createStatement();
			
			String sql = "SELECT * from admin where username ='"+username+"' and password='"+Password+"' ";
			 
			rs = stmnt.executeQuery(sql);
		
		if(rs.next())
		{
			ifsuccess =true;
		}
		
		else { 
			ifsuccess = false;
		
		}
		
		}
		
		
		
		catch(Exception e){
			e.printStackTrace();
		}
		
		
		
		
		return ifsuccess;
		
	}
	
	
public static List<Regmember> getCustomerDetails(){
		
		
		
		
		ArrayList<Regmember> rmem = new ArrayList<>();
		
		try { 
				conn = DBfile.getConnection();
				stmnt = conn.createStatement();
				String sql = "Select * from regmember";
				rs = stmnt.executeQuery(sql);
				
				while(rs.next()){
					int id= rs.getInt(1);
					String fname = rs.getString(2);
					String lname = rs.getString(3);
					String email = rs.getString(4);
					String password = rs.getString(5);
					int phone = rs.getInt(6);
					
					Regmember r = new Regmember(id,fname,lname , email,password,phone );
					rmem.add(r);
					
				}
				
				
				
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		
		return rmem;
	
	}
	
	
	


public static List<Payment> getPaymentDetails(){
	
	
	
	
	ArrayList<Payment> pymnt = new ArrayList<>();
	
	try { 
			conn = DBfile.getConnection();
			stmnt = conn.createStatement();
			String sql = "Select * from packagee  ";
			rs = stmnt.executeQuery(sql);
			
			while(rs.next()){
				
				String email = rs.getString(1);
				String packagee = rs.getString(2);
				String phone = rs.getString(3);
				
				Payment pay = new Payment(email,packagee,phone );
				pymnt.add(pay);
				
			}
			
			
			
	}
	
	catch(Exception e){
		e.printStackTrace();
	}
	
	return pymnt;

}
	

public static List<Comment> getcommentDetails(){
	
	
	
	
	ArrayList<Comment> cmnt = new ArrayList<>();
	
	try { 
			conn = DBfile.getConnection();
			stmnt = conn.createStatement();
			String sql = "Select * from comment  ";
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

	
	
	
	
	
	
	
	
	
	
	
	
	
}

















