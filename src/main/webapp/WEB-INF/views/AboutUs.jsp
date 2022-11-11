<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Contact Form</title>
    <link rel="shortcut icon" type="image/jpg" href="images\favicon.ico"/>
    <link href="<c:url value="/resources/css/aboutus.css" />" rel="stylesheet">
	<script src="<c:url value="/resources/js/aboutus.js" />"></script>
    
  </head>
  
  <body>
    <div class="container">
      
      <div class="form" >
        <div class="contact-info">
          <h3 class="title">Let's get in touch</h3>
          <p class="text">
            Want to Know More about us , Hit us here.
          </p>

          <div class="info">
            <div class="information">
             
              <p>Somewhere in India</p>
            </div>
            <div class="information">
              
              <p>puchbhai@panchatiya.com</p>
            </div>
            <div class="information">
              
              <p>7212141714</p>
            </div>
          </div>

          <div class="social-media">
            <p>Connect with us :</p>
            <div class="social-icons">
              <a href="#">
                <i class="fab fa-facebook-f"></i>
              </a>
              <a href="#">
                <i class="fab fa-twitter"></i>
              </a>
              <a href="#">
                <i class="fab fa-instagram"></i>
              </a>
              <a href="#">
                <i class="fab fa-linkedin-in"></i>
              </a>
            </div><br>
            <div class="credit">Made with <span style="color:tomato"><3 </span> <b>by 4'S</b></a></div>
          </div>
        </div>

        <div class="contact-form">
          <span class="circle one"></span>
          <span class="circle two"></span>

          <form action="validateLogin" method="post">
            <h3 class="title">Contact us</h3>
            <div class="input-container">
              <input type="text" name="name" class="input" placeholder="username"/>
            </div>
            <div class="input-container">
              <input type="email" name="email" class="input" placeholder="email"/>
            </div>
            <div class="input-container">
              <input type="tel" name="phone" class="input" placeholder="mobile"/>
              <span>Phone</span>
            </div>
            <div class="input-container textarea">
              <textarea name="message" class="input" placeholder="message"></textarea>
            </div>
            <input type="submit" value="Send" class="btn" />
          </form>
        </div>
      </div>
    </div>

    <script src="script.js"></script>
  </body>
</html>
