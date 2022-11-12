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
										
										
										
										
										
										<table border=1>
												<tr> 
												<th>Email</th>
												<th>Header</th>
												<th>Comment</th>
												</tr>		
												
												
												<c:forEach var="com" items="${comdetail}">
												
												
												
												<c:set var="cemail"  value="${com.comemail}"/>
	<c:set var="cheader"  value="${com.cheader}"/>
	<c:set var="comments"  value="${com.comment}"/>
												
												
												
												<tr> 
												<td>${com.comemail}</td>
												<td>${com.cheader}</td>
												<td>${com.cheader}</td>
												</tr>
												
												
												
												
												
												
												
												
												
												    
											
												</c:forEach>
												
												</table>
										
												<c:url value="updatecom.jsp" var="comupdate">
			<c:param name="cemail" value="${cemail}"/>
			<c:param name="cheader" value="${cheader}"/>
			<c:param name="comments" value="${comments}"/>
			</c:url>
			
			
			
			
			<br>
		<br>
		
		<a href ="${comupdate}">
		<input type="button" name="comupdate" value="update comment">
		</a>
		
		<br>
		<br>
		
														
										
												<c:url value="deletecom.jsp" var="comdelete">
			<c:param name="demail" value="${cemail}"/>
			<c:param name="dheader" value="${cheader}"/>
			<c:param name="dcomments" value="${comments}"/>
			</c:url>
			
			
			
			
			<br>
		<br>
		
		<a href ="${comdelete}">
		<input type="button" name="comdelete" value="Delete comment">
		</a>
		
		<br>
		<br>
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
												
												
												
												
												
												
</body>
</html>