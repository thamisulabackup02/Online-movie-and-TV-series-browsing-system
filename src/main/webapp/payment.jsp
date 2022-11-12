<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form action="pay" method ="Post">
<fieldset>
<legend>Package Details</legend>


	<label>E-mail</label>
	<input type = "text" name="payEmail" id="payEmail">
	
	<label>Package</label>
	<select name="packagee" >
		<option value="Basic">Basic</option>
		<option value="Standard">Standard</option>
		<option value="Premium">Premimum</option>
	</select>
	
	
	
	
	
	
	<label>Phone</label>
	<input type = "text" name="Payphone">
	
	


</fieldset>
<hr>




<fieldset>
<legend>Payment details</legend>



		<label>Name On Card</label>
		<input type="text" id="NOC" name="noc">


	
		<label>Credit card</label>
		<input type="text" id="NOC" name="noc">
		
		
		<label> Expire month/Date</label>
		<input type="text" id="NOC" name="noc">
		
		<br><br>
		<label>CVV</label>
		<input type="text" id="NOC" name="noc">


		
		<BR><BR>
		
		<label>Accept terms & Conditions</label>
<input type="checkbox" id="terms" name="terms" value="Accept"  required>
 


		<button type="Submit" name="payment" id="payment">Pay</button>
		
	
	
		
		
		</script>
		
		
		
		
		
		
		


</fieldset>





</form>


	<script type="text/javascript">
		
		
		
	document.getElementById("payment").addEventListener("click",function()
			{
			
			
			var localemail = localStorage.getItem("Email");
			var inemail = document.getElementById("payEmail").value;
			
			
			if(localemail!=inemail)
				{
				
				
				alert('Your must input your login email');
					location = 'payment.jsp';
			
				}
			
		
			
			
		});
		







</script>






</body>
</html>