<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<meta charset="ISO-8859-1">
	<meta charset="utf-8">
	  <meta http-equiv="X-UA-Compatible" content="IE-edge">
	  <meta name="viewport" content="width=device-width, intial-scale=1.0">
	  <link rel="stylesheet" href="./assets/css/style.css">
	  <link rel="shortcut icon" href="./favicon.svg" type="image/svg+xml">
	  <title>Filmspiedia</title>

	  <head>
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
</head>
<body>
	<style>
		.content {
		  position: relative;
		  min-height: 100vh;
		  z-index: 0;
		  padding: 40px 40px;
		  
		}
		.user-box {
		  padding: 50px;
		  display: grid;
		  justify-content: center;
		  align-items: center;
		  max-width: 98%;
		  margin: 1rem auto;
		  overflow: auto;
		  background-color: #3439499d;
		  
		}
		
		.input-group{
		  display: flex;
		
		}
		.input-group label{
		  margin: 10px;
		  font-size: 1rem;
		  text-transform: uppercase;
			padding: 0.8rem;
		 
		}
		
		.input-group input{
		  width: 130px;
		  height: 40px;
		  border:none;
		  outline: none;
		  color: #ffffff;
		  background-color: #343949;
		  margin: 10px;
		  font-size: 1rem;
		  border-radius: 5px;
		}
		.input-group input:hover{
		  background: rgb(231, 235, 2);
		  opacity: 0.7;
		}
		
		.input-group select{
		  width: 130px;
		  height: 40px;
		  border:none;
		  outline: none;
		  color: #ffffff;
		  background-color: #343949;
		  margin: 10px;
		  font-size: 1rem;
		  border-radius: 5px;
		}
		.input-group select:hover{
		  background: rgb(251, 255, 1);
		  opacity: 0.7;
		  
		}
		
		.submit input{
		  width: 130px;
		  height: 40px;
		  border:none;
		  outline: none;
		  color: #ffffff;
		  background-color: #343949;
		  margin: 10px;
		  font-size: 1rem;
		  border-radius: 5px;
		  border: 3px solid  rgb(251, 255, 4);
		}
		.submit input:hover{
		  background: rgb(231, 235, 2);
		  opacity: 0.7;
		}
		
		</style>

	<%
		String pricing_id = request.getParameter("pricing_id");
		String category = request.getParameter("category");
		String genres = request.getParameter("genres");
		String hdAvailable = request.getParameter("hdAvailable");
		String watchOnur = request.getParameter("watchOnur");
		String moviesOrTvshow = request.getParameter("moviesOrTvshow");
		String screens = request.getParameter("screens");
	%>
	<h2>delete adjksaj</h2>
	<div class="content">
	  <form action="deletex" method="post">
		<div class="user-box">
		  <p class="login-text" style="font-size: 2rem; font-weight: 800;">Delete Your Chooses</p>
		  <div class="input-group">
			<label>user id</label>
				 <input type= "text" name="usid" value="<%= pricing_id %>" readonly><br>
		  </div>
		  <div class="input-group">
			<label>category</label>
			<input type= "text" name="category" value="<%= category %>"readonly><br>
			</div>
		  <div class="input-group">
			<label>Year</label>
			<input type= "text" name="genres" value="<%= genres %>"readonly><br>
		</div>
		<div class="input-group">
			  <label>HD Available</label>
			  <input type= "text" name="hdAvailable" value="<%= hdAvailable %>"readonly><br>
		</div>
		<div class="input-group">
			<label>Watch on your </label>
			<input type= "text" name="watchOnur" value="<%= watchOnur %>"readonly> <br>
		</div>
			<div class="input-group">
			 <label>Unlimited movies or TV shows</label>
			<input type= "text" name="moviesOrTvshow" value="<%= moviesOrTvshow %>"readonly><br>
		</div>
		<div class="input-group">
			<label>Screens you want watch on ate the same time</label>
			<input type= "text" name="screens" value="<%= screens %>"readonly><br>
			</div>
				<div class="submit">
					  <input type="submit" name="submit" value="Delete">
				</div>
  
  
		</div>
	  </form>
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