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
					<h1 class="text-center mb-3">Books with quantity less than 10</h1>
					<table class="table">
					  <thead class="thead-dark">
					    <tr>
					      <th scope="col">Id</th>
					      <th scope="col">Book Name</th>
					      <th scope="col">Author Name</th>
					      <th scope="col">Quantity</th>
					      <th scope="col">Price</th>
					      <th scope="col">Action</th>
					    </tr>
					  </thead>
					  <tbody>
					  	<c:forEach items="${books}" var="b">
						    <tr>
						      <th scope="row">Book${b.id}</th>
						      <td>${b.name}</td>
						      <td>${b.author}</td>
						      <td>${b.quantity}</td>
						      <td class="font-weight-bold">&#x20B9;${b.price}</td>
						      <td><a href="removeBook/${b.id}"><i class="fa-solid fa-trash"></i></a>
						      <a href="editBook/${b.id}"><i class="fa-regular fa-pen-to-square"></i></a></td>
						    </tr>
					    </c:forEach>
					    
					  </tbody>
					</table>
				</div>
			</div>
		</div>
	
	</body>
</html>