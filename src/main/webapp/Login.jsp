<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>


<head>
<meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE-edge">
  <meta name="viewport" content="width=device-width, intial-scale=1.0">
  <link rel="stylesheet" href="./assets/css/style.css">
  <link rel="shortcut icon" href="./favicon.svg" type="image/svg+xml">
  <title>Filmspiedia</title>

	</head>
	<body>
		<!--navigation-------------->
    <nav>
      <!--menu-------------->
      <ul class="menu">
          <li><a href="#">Home</a></li>
          <li><a href="#">Movies</a></li>
          <li><a href="#">TV Shows</a></li>
          <li><a href="#">Web Series</a></li>
          <li><a href="#">Pricing</a></li>
      </ul>
      <!--search------------->
      <div class="search">
          <input type="text" placeholder="Find Your Favourtie Movies"/>
          <!--search-icon----------->
          <i class="fas fa-search"></i>
      </div>
      <div class="showcase-top">
          <a href="#" class="btn btn-rounded">Sign In</a>
      </div>
      
     
    </nav>


<BR>
<BR>
<BR>
<BR>
<BR>
<BR>
  
		<CENTER>



<style> .login
{
	background-color: lightgray;
	border:  15px solid rgb(0,7,44);
}    
 </style>
		
		<DIV class ="login" >
		
			
			
		
		<form action="log" method="post">
		<fieldset>
		<LEGEND>Login</LEGEND>
		<h1>Login</h1>
		
		<label>Email/Username</label>
		<Input type = "text" name="lname" id="lname"><br><br>
		
		
		
		
		
		
		
		
		<label>Password</label>
		<input type="password" name="lpass"><br>
		
		
		<br>
		
		
		<button type="submit" value="login" id="submitt">login</button>
		
		
		</fieldset>
	
</form>
		
	
		
			<script>
		document.getElementById("submitt").addEventListener("click",function()
				{
					var email = document.getElementById("lname").value ;
					
					
					
					localStorage.setItem("Email",email);
				});
		
		</script>
		
		</DIV>
		</CENTER>
		
<br>
<br>
<div class="btns">
    <a href="#">Previous</a>
    <a href="#">Next</a>
</div>

<footer class="footer">
    
    <p>Questions? Filmspiedia</p>
    <div class="footer-cols">
        <ul>
            <li><a href="#">FAQ</a></li>
            <li><a href="#">Investor Relations</a></li>
            <li><a href="#">Privacy</a></li>
            <li><a href="#">Speed Test</a></li>
        </ul>
        <ul>
            <li><a href="#">Help Centre</a></li>
            <li><a href="#">Jobs</a></li>
            <li><a href="#">Cookie Preferences</a></li>
            <li><a href="#">Watch for Free</a></li>
        </ul>
        <ul>
            <li><a href="#">Account</a></li>
            <li><a href="#">Ways to Watch</a></li>
            <li><a href="#">Corporate Information</a></li>
            <li><a href="#">Legal Notices</a></li>
        </ul>
        <ul>
            <li><a href="#">Media Centre</a></li>
            <li><a href="#">Terms of Use</a></li>
            <li><a href="#">Contact Us</a></li>
            <li><a href="#">Filmspiedia Originals</a></li>
        </ul>
    </div>
</footer>

</body>
</html>