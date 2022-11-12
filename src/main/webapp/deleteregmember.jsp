<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



			
			<%
				String i = request.getParameter("id");
			String dfname = request.getParameter("fname");
			String dlname = request.getParameter("lname");
			String demail = request.getParameter("email");
			String dpassword = request.getParameter("password");
			String dphn = request.getParameter("phone");
			
			
			
			int dPhone = Integer.parseInt(dphn);
			int did = Integer.parseInt(i);
			
			
			%>



	<center>
			<script>
			
					document.write("<h2>" + "<%= demail%>" + "</h2>"  + "<h1>|Delete Profile </h1>");
			
			
			</script>
			
			
			</center>
			
			




		<form action = "deleteregmember" method ="post">
			
			
			<label>Customer ID</label>
			<input type ="text" name="dcustid" value="<%= did%>" readonly><br><br>
			
			<label>First Name</label>
			 <input type="text" name="dfiname" value="<%=dfname %>"readonly><br><br>
			 
			 <label>Last name</label> 
			 <input type="text" name="dlaname" value="<%=dlname %>" readonly><br><br>
			 
			 <label>Email </label>
			 <input type="text" name="deml" value="<%=demail %>" readonly><br><br>
			 
			 <label>Password </label>
			 <input type="text" name="dpaswd" value="<%=dpassword %>" readonly><br><br>
			 
			 <label>Phone number </label>
			 <input type="number" name="dpnum" value="<%=dPhone %>"readonly><br><br>
			 
			 
			 <input type="submit" name="submit" value="Delete account"> <br><br> 
			 
			
			
		
		
		
		
		
		
		</form>








</body>
</html>