<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<%@include file="./base.jsp" %>
</head>
<body>
	<div class="container mt-5" >
  		<h3 class="text-center">Update Book Details</h3>
		<form action="${pageContext.request.contextPath}/updateBook" method="post">
			  <div class="form-group">
			    <label for="bookId">Book Id</label>
			    <input type="text" class="form-control" id="bookId" placeholder="Enter Book Id" name="id" value="${book.id}">
			  </div>
			  <div class="form-group">
			    <label for="name">Book Name</label>
			    <input type="text" class="form-control" id="name" placeholder="Enter Book Name" name="name" value="${book.name}">
			  </div>
			  <div class="form-group">
			    <label for="author">Author Name</label>
			    <input type="text" class="form-control" id="author" placeholder="Enter Author" name="author" value="${book.author}">
			  </div>
			  <div class="form-group">
			    <label for="price">Price</label>
			    <input type="text" class="form-control" id="price" placeholder="Enter Price" name="price" value="${book.price}">
			  </div>
			  <div class="form-group">
			    <label for="quantity">Quantity</label>
			    <input type="text" class="form-control" id="quantity" placeholder="Enter Quantity" name="quantity" value="${book.quantity}">
			  </div>
			  <button type="submit" class="btn btn-warning">Update</button>
		</form>
	</div>

</body>
</html>


