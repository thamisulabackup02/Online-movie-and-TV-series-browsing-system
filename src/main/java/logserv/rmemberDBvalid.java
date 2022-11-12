package logserv;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class rmemberDBvalid {
	
	
	public static Connection conn = null;
	public static Statement stmnt = null;
	public static ResultSet rs = null;
	public static boolean ifsuccess;
	
	
	
	public static boolean validate(String Email , String Password)
	{
		
		
	
		try {
			
			conn = DBfile.getConnection();
			stmnt = conn.createStatement();
			
			String sql = "SELECT * from regmember where email ='"+Email+"' and password='"+Password+"' ";
			 
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
	
	
	public static boolean registercustomer(String fname, String lname, String remail, String rpassword, int phone)
	{
		boolean ifsuccess = false;
		
		
		
		
		
		
	
		
		
		try {
			
			
			 conn = DBfile.getConnection();	
			 stmnt  = conn.createStatement();
			
			
			String sql = "Insert into regmember values (0,'"+fname+"','"+lname+"','"+remail+"','"+rpassword+"',"+phone+")";
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
	
	public static boolean updateregmember(int id, String fname, String lname, String email, String password, int phone)
	{
		ifsuccess = false;
		
		try {
			
			conn = DBfile.getConnection();
			stmnt = conn.createStatement();
			
			
			String sql = "update regmember set firstname='"+fname+"', lastname='"+lname+"' , email='"+email+"', password='"+password+"' , phonenumber='"+phone+"'"+"where id="+id+";";
			
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
	
	public static List<Regmember> getCustomerDetails(int id){
		
		
		
		
		ArrayList<Regmember> rmem = new ArrayList<>();
		
		try { 
				conn = DBfile.getConnection();
				stmnt = conn.createStatement();
				String sql = "Select * from regmember where id="+id+" ";
				rs = stmnt.executeQuery(sql);
				
				while(rs.next()){
					 id= rs.getInt(1);
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
	
	
	
public static List<Regmember> getCustomerDetails(String Email){
		
		
		
		
		ArrayList<Regmember> rmem = new ArrayList<>();
		
		try { 
				conn = DBfile.getConnection();
				stmnt = conn.createStatement();
				String sql = "Select * from regmember where email='"+Email+"' ";
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
	
	
	
	
	
	
	public static boolean deleteCustomer(int id)
	{
		
		try {
			conn = DBfile.getConnection();
			stmnt = conn.createStatement();
			
			String sql = "delete from regmember where id="+id+";";
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
