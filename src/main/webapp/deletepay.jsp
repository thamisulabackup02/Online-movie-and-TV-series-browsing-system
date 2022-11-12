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
				
			String payemail = request.getParameter("pemail");
			String packagee = request.getParameter("ppackage");
			String pphone    =  request.getParameter("pphone");
			
			%>




			<form action = "deletePay" method ="post">
			
			
			<fieldset>
<legend>Package Details</legend>


	<label>E-mail</label>
	<input type = "text" name="deleteemail" id="delEmail" value="<%=payemail %>"readonly >
	
	<br>
	
	<label>Package</label>
<input type = "text" name="deletepac" id="delpac" value="<%=packagee %>" readonly >
	
	
	
	<br>
	
	
	<label>Phone</label>
	<input type = "text" name="deletehone" value="<%=pphone %>" readonly>
	
	<br>
	<br>
	
		<button type="Submit" name="payment" id="payment">Delete</button>


</fieldset>
<hr>


</form>




</body>
</html>