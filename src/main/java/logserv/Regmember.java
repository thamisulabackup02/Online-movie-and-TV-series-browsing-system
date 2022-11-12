package logserv;

public class Regmember extends user{
		
		private int id;
		private String fname;
		private String lname;
		private String email;
		private String password;
		private int phone;
		
		
		public Regmember(int id, String fname, String lname, String email, String password, int phone) {
		
			
			this.id = id;
			this.fname = fname;
			this.lname = lname;
			this.email = email;
			this.password = password;
			this.phone = phone;
		}


		public int getId() {
			return id;
		}


	

		public String getFname() {
			return fname;
		}


	


		public String getLname() {
			return lname;
		}


	


		public String getEmail() {
			return email;
		}


	


		public String getPassword() {
			return password;
		}


		

		public int getPhone() {
			return phone;
		}


	
			
}
