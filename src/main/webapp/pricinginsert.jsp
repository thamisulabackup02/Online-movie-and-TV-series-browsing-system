<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>

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

    <style>
    
  .content {
  position: relative;
  min-height: 100vh;
  z-index: 0;
  padding: 40px 40px;
 
  
  
}
.user-box {
  
  padding: 100px;
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
	 </head>
	  
	
	<body>

    <div class="content">
      <form name="formContact" action="insertx" method="POST">
        <div class="user-box">
          <p class="login-text" style="font-size: 2rem; font-weight: 800;">Add Your Chooses</p>
          <div class="input-group">
            <label>Category</label>
            <select type= "text" name="category">
              <option value=" "> </option> 
              <option value="action">Action</option>
              <option value="romantic">Romantic</option>
              <option value="comedy">Comedy</option>
              <option value="horror">Horror</option>
              <option value="crime">Crime</option>
              </select>
          </div>
          <div class="input-group">
            <label>Year</label>
            <select type= "text" name="genres">
              <option value=" "> </option>
              <option value="2022">2022</option>
              <option value="2020-2021">2020-2021</option>
              <option value="2010-2019">2010-2019</option>
              <option value="2000-2009">2000-2009</option>
              <option value="1980-1999">1980-1999</option>
            </select>

          </div>
          <div class="input-group">
            <label>HD Available</label>
            <select type= "text" name="hdAvailable">
              <option value=" "> </option>
              <option value="yes">YES</option>
              <option value="no">NO</option>
              </select>
          </div>
          <div class="input-group">
            <label>Watch on your </label>
            <select type= "text" name="watchOnur">
              <option value=" "> </option>
              <option value="laptop">laptop</option>
              <option value="TV">TV</option>
              <option value="Phone">Phone</option>
              <option value="Tablet">Tablet</option>
              </select>
          </div>
          <div class="input-group">
            <label>Unlimited movies or TV shows</label>
            <select type= "text" name="moviesOrTvshow">
              <option value=" "> </option>
              <option value="movies">Movies</option>
              <option value="TV shows">TV shows</option>
              </select>
          </div>
          <div class="input-group">
            <label>Screens you want watch on ate the same time</label>
            <input type= "text" name="screens"> 
          </div>
 		 <div class="submit">
        <input type="submit" name="submit" value="ADD">
            </div>
          <p class="login-register-text">Don't have an account? <a href="register.php">Register Here</a>.</p>
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
