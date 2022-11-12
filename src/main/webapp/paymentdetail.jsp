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
			<h1>Payment detail</h1>
			
			
			
			
			
			
			<c:forEach var="pay" items="${pdetail}">
			
			
			
			
			
			
			<c:set var="pemail"  value="${pay.email}"/>
	<c:set var="ppackge"  value="${pay.packagee}"/>
	<c:set var="pphone"  value="${pay.phone}"/>
	
		${pay.email}<br>
		${pay.packagee}<br>
		${pay.phone}<br>
			
			
			</c:forEach>
			
			
			
			
			<c:url value="updatepay.jsp" var="payupdate">
			<c:param name="pemail" value="${pemail}"/>
			<c:param name="ppackge" value="${ppackge}"/>
			<c:param name="pphone" value="${pphone}"/>
			</c:url>
			
			
			
			
			<br>
		<br>
		
		<a href ="${payupdate}">
		<input type="button" name="payupdate" value="update data">
		</a>
		
		<br>
		<br>








					
			
			<c:url value="deletepay.jsp" var="paydelete">
			<c:param name="pemail" value="${pemail}"/>
			<c:param name="ppackge" value="${ppackge}"/>
			<c:param name="pphone" value="${pphone}"/>
			</c:url>
			



<a href ="${paydelete}">
		<input type="button" name="deleteupdate" value="delete data">
		</a>
		










</body>
</html>