<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>Home</title>
  <link href="<c:url value="/resources/css/h.css" />" rel="stylesheet">
  <script src="<c:url value="/resources/js/h.js" />"></script>
</head>

<body>
  <div class="container">
    <!-- Toggler -->
    <div class="toggle__menu-open" onclick="toggleMenu()">
      <svg width="36" height="25" viewBox="0 0 36 25" fill="none" xmlns="http://www.w3.org/2000/svg">
        <path fill-rule="evenodd" clip-rule="evenodd" d="M34.1389 21.0951C35.1054 21.0951 35.8889 21.8786 35.8889 22.8451C35.8889 23.8116 35.1054 24.5951 34.1389 24.5951H2.63892C1.67242 24.5951 0.888916 23.8116 0.888916 22.8451C0.888916 21.8786 1.67242 21.0951 2.63892 21.0951H34.1389ZM34.1389 10.5951C35.1054 10.5951 35.8889 11.3786 35.8889 12.3451C35.8889 13.3116 35.1054 14.0951 34.1389 14.0951H2.63892C1.67242 14.0951 0.888916 13.3116 0.888916 12.3451C0.888916 11.3786 1.67242 10.5951 2.63892 10.5951H34.1389ZM34.1389 0.0950928C35.1054 0.0950928 35.8889 0.878594 35.8889 1.84509C35.8889 2.81159 35.1054 3.59509 34.1389 3.59509H2.63892C1.67242 3.59509 0.888916 2.81159 0.888916 1.84509C0.888916 0.878594 1.67242 0.0950928 2.63892 0.0950928H34.1389Z" fill="white" />
      </svg>

    </div>

    <div class="toggle__menu-close" onclick="toggleMenu()">
      <svg width="86" height="86" viewBox="0 0 86 86" fill="none" xmlns="http://www.w3.org/2000/svg">
        <g filter="url(#filter0_d)">
          <circle cx="43.1122" cy="40.25" r="27.3569" fill="white" />
          <circle cx="43.1122" cy="40.25" r="26.8569" stroke="white" />
        </g>
        <path fill-rule="evenodd" clip-rule="evenodd" d="M46.7879 40.2502L54.4173 32.6208C54.9809 32.0572 54.9809 31.1462 54.4173 30.5826C53.8538 30.019 52.9428 30.019 52.3792 30.5826L44.7497 38.2121L37.1203 30.5826C36.5567 30.019 35.6457 30.019 35.0821 30.5826C34.5185 31.1462 34.5185 32.0572 35.0821 32.6208L42.7116 40.2502L35.0821 47.8797C34.5185 48.4433 34.5185 49.3542 35.0821 49.9178C35.3632 50.1989 35.7322 50.3402 36.1012 50.3402C36.4702 50.3402 36.8392 50.1989 37.1203 49.9178L44.7497 42.2884L52.3792 49.9178C52.6603 50.1989 53.0293 50.3402 53.3983 50.3402C53.7673 50.3402 54.1363 50.1989 54.4173 49.9178C54.9809 49.3542 54.9809 48.4433 54.4173 47.8797L46.7879 40.2502Z" fill="#5F4EFA" />
        <defs>
          <filter id="filter0_d" x="0.755249" y="0.893066" width="84.7139" height="84.7139" filterUnits="userSpaceOnUse" color-interpolation-filters="sRGB">
            <feFlood flood-opacity="0" result="BackgroundImageFix" />
            <feColorMatrix in="SourceAlpha" type="matrix" values="0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 127 0" />
            <feMorphology radius="5" operator="erode" in="SourceAlpha" result="effect1_dropShadow" />
            <feOffset dy="3" />
            <feGaussianBlur stdDeviation="10" />
            <feColorMatrix type="matrix" values="0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.25 0" />
            <feBlend mode="normal" in2="BackgroundImageFix" result="effect1_dropShadow" />
            <feBlend mode="normal" in="SourceGraphic" in2="effect1_dropShadow" result="shape" />
          </filter>
        </defs>
      </svg>

    </div>

    <!-- Text -->

    <h1 class="title">Home</h1>

    <!-- Menu -->
    <div class="menu">
      <div id="home" class="menu-icon" onclick="changeMenu('home')">
        <svg width="26" height="26" viewBox="0 0 26 26" fill="none" xmlns="http://www.w3.org/2000/svg">
          <path fill-rule="evenodd" clip-rule="evenodd" d="M6.75006 25.3909C4.679 25.3909 3.00006 23.7119 3.00006 21.6409V14.1409H1.75006C0.636433 14.1409 0.078725 12.7944 0.866181 12.007L12.1162 0.756986C12.6043 0.26883 13.3958 0.26883 13.8839 0.756986L25.1339 12.007C25.9214 12.7944 25.3637 14.1409 24.2501 14.1409H23.0001V21.6409C23.0001 23.7119 21.3211 25.3909 19.2501 25.3909H6.75006ZM13.0001 3.40864L4.6887 11.72C5.16269 11.8976 5.50006 12.3549 5.50006 12.8909V21.6409C5.50006 22.3312 6.05971 22.8909 6.75006 22.8909L9.25006 22.8896L9.25006 17.8909C9.25006 16.5102 10.3694 15.3909 11.7501 15.3909H14.2501C15.6308 15.3909 16.7501 16.5102 16.7501 17.8909L16.7501 22.8896L19.2501 22.8909C19.9404 22.8909 20.5001 22.3312 20.5001 21.6409V12.8909C20.5001 12.3549 20.8374 11.8976 21.3114 11.72L13.0001 3.40864ZM14.2501 17.8909H11.7501L11.7501 22.8896H14.2501L14.2501 17.8909Z" fill="white" />
        </svg>
        <form action="booksList" method="get">
      		<div class="input_box">
		        <input class="button" type="submit" style="border:none;" value="Book List">
		    </div>
        </form>
        <div class="tooltip" data-key="home">Home</div>
      </div>
      <div id="about" class="menu-icon" onclick="changeMenu('thresold')">
        <svg width="26" height="26" viewBox="0 0 26 26" fill="none" xmlns="http://www.w3.org/2000/svg">
          <path fill-rule="evenodd" clip-rule="evenodd" d="M7.229 18.3676H19.729C23.1808 18.3676 25.979 21.1658 25.979 24.6176C25.979 25.3079 25.4194 25.8676 24.729 25.8676C24.088 25.8676 23.5596 25.385 23.4874 24.7633L23.4726 24.3972C23.3628 22.5016 21.8449 20.9838 19.9493 20.8739L19.729 20.8676H7.229C5.15794 20.8676 3.479 22.5465 3.479 24.6176C3.479 25.3079 2.91936 25.8676 2.229 25.8676C1.53865 25.8676 0.979004 25.3079 0.979004 24.6176C0.979004 21.2566 3.63189 18.5153 6.95789 18.3733L7.229 18.3676ZM13.479 0.867554C17.6211 0.867554 20.979 4.22542 20.979 8.36755C20.979 12.5097 17.6211 15.8676 13.479 15.8676C9.33687 15.8676 5.979 12.5097 5.979 8.36755C5.979 4.22542 9.33687 0.867554 13.479 0.867554ZM13.479 3.36755C10.7176 3.36755 8.479 5.60613 8.479 8.36755C8.479 11.129 10.7176 13.3676 13.479 13.3676C16.2404 13.3676 18.479 11.129 18.479 8.36755C18.479 5.60613 16.2404 3.36755 13.479 3.36755Z" fill="white" />
        </svg>
        <form action="thresold" method="get">
      		<div class="input_box">
		        <input class="button" type="submit" style="border:none;" value="Threshold">
		    </div>
        </form>
        <div class="tooltip" data-key="about">About</div>
      </div>
      
      <div id="projects" class="menu-icon" onclick="changeMenu('Orders')">
        <svg width="26" height="26" viewBox="0 0 26 26" fill="none" xmlns="http://www.w3.org/2000/svg">
          <path fill-rule="evenodd" clip-rule="evenodd" d="M11.7524 0.390869H14.2524C16.2495 0.390869 17.882 1.95202 17.9961 3.92053L18.0024 4.14087V5.39087H21.7524C23.8235 5.39087 25.5024 7.0698 25.5024 9.14087V21.6409C25.5024 23.7119 23.8235 25.3909 21.7524 25.3909H4.25244C2.18137 25.3909 0.502441 23.7119 0.502441 21.6409V9.14087C0.502441 7.0698 2.18137 5.39087 4.25244 5.39087H8.00244V4.14087C8.00244 2.14377 9.56359 0.511293 11.5321 0.397235L11.7524 0.390869ZM23.0024 17.8909H3.00244V21.6409C3.00244 22.3312 3.56209 22.8909 4.25244 22.8909H21.7524C22.4428 22.8909 23.0024 22.3312 23.0024 21.6409V17.8909ZM21.7524 7.89087H4.25244C3.56209 7.89087 3.00244 8.45051 3.00244 9.14087V15.3909H23.0024V9.14087C23.0024 8.45051 22.4428 7.89087 21.7524 7.89087ZM14.2524 2.89087H11.7524C11.1114 2.89087 10.5831 3.37342 10.5109 3.99509L10.5024 4.14087V5.39087H15.5024V4.14087C15.5024 3.49982 15.0199 2.97149 14.3982 2.89928L14.2524 2.89087Z" fill="white" />
        </svg>
        <form action="showOrder" method="post">
      		<div class="input_box">
		        <input class="button" type="submit" style="border:none;" value="Orders">
		    </div>
        </form>
        <div class="tooltip" data-key="projects">Projects</div>
      </div>
      <div id="contact" class="menu-icon" onclick="changeMenu('contact')">
        <svg width="26" height="26" viewBox="0 0 26 26" fill="none" xmlns="http://www.w3.org/2000/svg">
          	<path fill-rule="evenodd" clip-rule="evenodd" d="M9.94582 10.1809C10.2936 9.9491 10.5024 9.55881 10.5024 9.14087V4.14087C10.5024 2.0698 8.82351 0.390869 6.75244 0.390869H1.75244C1.06209 0.390869 0.502441 0.950513 0.502441 1.64087C0.502441 14.0673 11.826 25.3909 24.2524 25.3909C24.9428 25.3909 25.5024 24.8312 25.5024 24.1409V19.1409C25.5024 17.0698 23.8235 15.3909 21.7524 15.3909H16.7524C16.3345 15.3909 15.9442 15.5997 15.7124 15.9475L13.3307 19.52C10.7367 17.8427 8.464 15.6273 6.71587 13.0771L6.37329 12.5626L9.94582 10.1809ZM17.4214 17.8909H21.7524C22.4428 17.8909 23.0024 18.4505 23.0024 19.1409V22.8475C20.5809 22.68 18.2176 22.0323 16.0134 21.0053L15.5076 20.7616L17.4214 17.8909ZM3.04578 2.89087H6.75244C7.4428 2.89087 8.00244 3.45051 8.00244 4.14087V8.47189L5.13167 10.3857C3.96347 8.03893 3.22623 5.4987 3.04578 2.89087Z" fill="white" />
        </svg>
		<form action="popular" method="get">
      		<div class="input_box">
		        <input class="button" type="submit" style="border:none;" value="Popular">
		    </div>
        </form>
        
        <div class="tooltip" data-key="contact">Contact</div>
      </div>
    </div>
  </div>

  <script src="app.js"></script>
</body>

</html>