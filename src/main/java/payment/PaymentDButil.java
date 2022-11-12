package payment;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import logserv.DBfile;
import logserv.Regmember;

public class PaymentDButil {
	
	
	public static Connection conn = null;
	public static Statement stmnt = null;
	public static ResultSet rs = null;
	public static boolean ifsuccess;
	
	
	
	public static boolean Insertpacakge(String payemail, String packagee, String phone)
	{
		 ifsuccess = false;
		

		try {
			
			
			 conn = DBfile.getConnection();	
			 stmnt  = conn.createStatement();
			
			
			String sql = "Insert into packagee values ('"+payemail+"','"+packagee+"','"+phone+"')";
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
	
	
	
	
public static List<Payment> getPaymentDetails(String Email){
		
		
		
		
		ArrayList<Payment> pymnt = new ArrayList<>();
		
		try { 
				conn = DBfile.getConnection();
				stmnt = conn.createStatement();
				String sql = "Select * from packagee where email='"+Email+"' ";
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


public static boolean updatepayment( String email ,String packagee, String phone )
{
	ifsuccess = false;
	
	try {
		
		conn = DBfile.getConnection();
		stmnt = conn.createStatement();
		
		
		String sql = "update packagee set package_title='"+packagee+"', phonenumber='"+phone+"' where email='"+email+"';";
		
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

	
	
public static boolean deletepayment(String email)
{
	
	try {
		conn = DBfile.getConnection();
		stmnt = conn.createStatement();
		
		String sql = "delete from packagee where email='"+email+"';";
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
