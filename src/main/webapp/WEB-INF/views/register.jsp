<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
	
	<link href="<c:url value="/resources/css/loginStyle.css" />" rel="stylesheet">
	<script src="<c:url value="/resources/js/loginJs.js" />"></script>
	
    <title>Welcome </title>
  </head>
  <body>
  		<section>
		    <div class="colour"></div>
		    <div class="colour"></div>
		    <div class="colour"></div>
		    <div class="box">
		        <div class="square" style="--i: 0"></div>
		        <div class="square" style="--i: 1"></div>
		        <div class="square" style="--i: 2"></div>
		        <div class="square" style="--i: 3"></div>
		        <div class="square" style="--i: 4"></div>
		        <div class="container">
		            <div class="form">
		                <h2>Sign Up</h2>
		                <form action="validateSignup" method="post">
		                    <div class="input__box">
		                        <input type="text" placeholder="Username" name="username"/>
		                    </div>
		                    <div class="input__box">
		                        <input type="email" placeholder="Email" name="email"/>
		                    </div>
		                    <div class="input__box">
		                        <input type="password" placeholder="Password" name="password"/>
		                    </div>
		                    <div class="input__box">
		                        <input type="submit" value="submit" />
		                    </div>
		                </form>
		                <br>
		                <form action="login" method="get">
		                	<div class="input_box">
						        <label class="forget">Already have an account</label>
						        <input type="submit" value="Login"> 
					        </div>
				        </form>
		            </div>
		        </div>
		    </div>
		
        
        </section>
 
  </body>
</html>
