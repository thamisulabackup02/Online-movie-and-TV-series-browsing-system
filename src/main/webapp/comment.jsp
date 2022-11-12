<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



				<form action="coment" method ="Post">
				
				
				
				
				<label>Email(Logged email)</label>
				<input type = "text" name="comEmail" id="comEmail">
				
				<br>
				<br>
				
				<label>header</label>
				<input type = "text" name="comheader">
				
				<br>
				<br>
				
				
				
				<label>Comment</label>
			<textarea id="cmmntmsg" name="commentmsg" rows="4" cols="50"></textarea>
		
				
				<br>
				<br>
		
		
		<button type="Submit" name="coment" id="comment">send</button>
		
		
		<script type="text/javascript">
		
		
		
	document.getElementById("comment").addEventListener("click",function()
			{
			
			
			var localemail = localStorage.getItem("Email");
			var inemail = document.getElementById("comEmail").value;
			
			
			if(localemail!=inemail)
				{
				
				
				alert('Your must input your login email');
					location = 'comment.jsp';
			
				}
			
		
			
			
		});
		







</script>
		
		
				
				
				

				</form>












</body>
</html>