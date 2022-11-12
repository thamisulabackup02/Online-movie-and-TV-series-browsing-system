<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		
		
		
		
		<center><h1>user details</h1></center>




				<table border='1'>
				<tr>
					<th>Id</th>
					<th>First name</th>
					<th>Last name</th>
					<th>email</th> 
					<th>phone</th> 
				</tr>
				


			<c:forEach var="cus" items="${cdetails}">
	
	
		<tr>
	
	
	
	
	
	
	
		<td>${cus.id}</td>
		<td>${cus.fname}</td>
		<td>${cus.lname}</td>
		<td>${cus.email}</td>
	
		<td>${cus.phone}</td>
		
	
	
	</c:forEach>
		
		</table>

















</body>
</html>