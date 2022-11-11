<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<%@include file="./base.jsp" %>
		<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
		<title>Book List</title>
	</head>
	<body>
		<div class="container mt-3">
			<div class="row">
				<div class="col-md-12">
					<h1 class="text-center mb-3">Orders</h1>
					<table class="table">
					  <thead class="thead-dark">
					    <tr>
					      <th scope="col">User</th>
					      <th scope="col">Id</th>
					      <th scope="col">Book Name</th>
					      <th scope="col">Author Name</th>
					      <th scope="col">Quantity</th>
					      <th scope="col">Price</th>
					    </tr>
					  </thead>
					  <tbody>
					  	<c:forEach items="${orders}" var="o">
						    <tr>
						      <td scope="row">${o.user}</td>
						      <th >Book${o.id}</th>
						      <td>${o.name}</td>
						      <td>${o.author}</td>
						      <td>${o.quantity}</td>
						      <td class="font-weight-bold">&#x20B9;${o.price}</td>
						    </tr>
					    </c:forEach>
					    
					  </tbody>
					</table>
					
				</div>
			</div>
		</div>
	
	</body>
</html>