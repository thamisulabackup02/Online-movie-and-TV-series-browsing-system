<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<style>
		  
.new-message-box {
    margin: 15px 0;
    padding-left: 20px;
    margin-bottom: 25px!important;
}

.new-message-box p{
    font-size: 1.15em;
    font-weight: 600;
}

.info-tab {
    width: 40px;
    height: 40px;
    display: inline-block;
    position: relative;
    top: 8px;
}

.info-tab {
    float: left;
    margin-left: -23px;
}

.info-tab i::before {
    width: 24px;
    height: 24px;
    box-shadow: inset 12px 0 13px rgba(0,0,0,0.5);
}

.info-tab i::after {
    width: 0;
    height: 0;
    border: 12px solid transparent;
    border-bottom-color: #fff;
    border-left-color: #fff;
    bottom: -18px;
}

.info-tab i::before, .info-tab i::after {
    content: "";
    display: inline-block;
    position: absolute;
    left: 0;
    bottom: -17px;
    transform: rotateX(60deg);
}

.note-box, .warning-box, .tip-box-success, .tip-box-danger, .tip-box-warning, .tip-box-info, .tip-box-alert {
    padding: 12px 8px 3px 26px;
}


/***Success****/

.new-message-box-success {
    background: #eeeeee;
    padding: 3px;
    margin: 10px 0;
}

.tip-icon-success {
    background: #8BC34A;
}

.tip-box-success {
    color: #33691E;
    background: #DCEDC8;
}

.tip-icon-success::before {
    font-size: 25px;
    content:"\f00c";
    top: 8px;
    left: 11px;
    font-family: FontAwesome;
    position: absolute;
    color: white;
}

.tip-icon-success i::before {
    background: #8BC34A;
}

	</style>
<div class="container-fluid text-center">

   <!-- -->
	<div class="row">
	 <div class="col-xs-12 col-sm-6 col-sm-offset-3">
	   <div class="new-message-box">
					 <div class="new-message-box-success">
						 <div class="info-tab tip-icon-success" title="success"><i></i></div>
						 <div class="tip-box-success">
							 <!--<p><strong>Tip:</strong> If you want to enable the fading transition effect while closing the alert boxes, apply the classes <code>.fade</code> and <code>.in</code> to them along with the contextual class.</p>-->
							 <p>Success 
							</p>
						 </div>
					 </div>
				 </div>

 </div>
 </div>
	<!-- -->
	
 </div>
</body>
</html>




