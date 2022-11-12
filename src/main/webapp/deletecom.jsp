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
				
			String commentemail = request.getParameter("demail");
			String  header= request.getParameter("dheader");
			String comment    =  request.getParameter("dcomments");
			
			%>



	<form action = "deleteComment" method="post">
	
	
	
	
	
		<label>Email(Logged email)</label>
				<input type = "text" name="dcomEmail" id="comEmail" value="<%=commentemail %>" readonly>
				
				<br>
				<br>
				
				<label>header</label>
				<input type = "text" name="dcomheader" value="<%=header %>"readonly>
				
				<br>
				<br>
				
				
				
				<label>Comment</label>
			<textarea id="cmmntmsg" name="dcommentmsg" rows="4" cols="50" readonly><%=comment %></textarea>
		
				
				<br>
				<br>
		
		
		<button type="Submit" name="coment" id="comment">send</button>
	
	
	
	
	
	
	
	
	
	</form>







</body>
</html>