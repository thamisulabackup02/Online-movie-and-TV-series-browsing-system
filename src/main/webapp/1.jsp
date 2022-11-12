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

<c:forEach var="mov" items="${mdetail}">
	
	
	<c:set var="id"  value="${mov.id}"/>
	<c:set var="title"  value="${mov.mtitle}"/>
	<c:set var="ryear"  value="${mov.ryear}"/>
	<c:set var="genre"  value="${mov.genre}"/>
	<c:set var="descrip"  value="${mov.description}"/>
	<c:set var="actor"  value="${mov.actor}"/>
	<c:set var="picurl"  value="${mov.picurl}"/>
	
	
		<CENTER>
		
		
			<H1>${mov.id}  ${mov.mtitle}</H1>
		
		
		
		</CENTER>
	
	
	<CENTER>
	
		
	
	</CENTER>
	
	<CENTER>
	
	
	<H4>${mov.mtitle}</H4>
	<H4>${mov.ryear}</H4>
	<H4>${mov.genre}</H4>
	<H4>${mov.description}</H4>
	
	
	
	
	</CENTER>
	</c:forEach>


			











</body>
</html>