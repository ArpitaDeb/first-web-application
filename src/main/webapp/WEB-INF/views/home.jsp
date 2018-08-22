<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html>
	<head>
		<title>Kyle's Grocery - Home</title>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
		<link rel="stylesheet" href="styles/main.css">
	</head>
	<body>
		<header class="navbar-dark bg-dark">
			<div class="container">
				<nav class="navbar navbar-expand-lg">
				  <a class="navbar-brand" href="/">Kyle's Grocery</a>
				  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
				    <span class="navbar-toggler-icon"></span>
				  </button>
				  <div class="collapse navbar-collapse" id="navbarSupportedContent">
				    <ul class="navbar-nav mr-auto">
				      <li class="nav-item active">
				        <a class="nav-link" href="/home">Home <span class="sr-only">(current)</span></a>
				      </li>
				      <li class="nav-item">
				        <a class="nav-link" href="/about">About</a>
				      </li>
				    </ul>
				    <form class="form-inline my-2 my-lg-0">
				      <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
				      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
				    </form>
				  </div>
				</nav>
			</div>
		</header>
		<div class="container">
			<h1 class="mt-3">
				Products for Sale
			</h1>
			<div class="row">
				<c:forEach items="${products}" var="product">
				  	<form action="/delete_product.do" method="post">
						<div class="card info-panel" style="width: 18rem;">
							<div class="card-header">
								${product.name}
							</div>
							<div class="card-body">
							    <h5 class="card-title">${product.priceAsCurrency}</h5>
							    <p class="card-text">${product.description}</p>
							    <input id="productId" name="productId" type="hidden" value="${product.id}">
								<button type="submit" class="btn btn-primary">Delete</button>
							</div>
						</div>
					</form>
				</c:forEach>
			</div>
		</div>
		
		<div class="container">
		
			<h2 class="mt-3">
				Add New Products
			</h2>
						
			<div class="card ">
			  <h5 class="card-header">Product information</h5>
			  <div class="card-body">					  
			  	<form action="products.do" method="post">
				  <div class="form-group">
				    <label>Name</label>
				    <input type="text" class="form-control" name="name" placeholder="Enter Name">
				  </div>
				  <div class="form-group">
				    <label>Price</label>
				    <input type="text" class="form-control" name="price" placeholder="Enter Price">
				  </div>
				  <div class="form-group">
				    <label>Description</label>
				    <input type="text" class="form-control" name="description" placeholder="Enter Description">
				  </div>
				  <button type="submit" class="btn btn-primary">Add</button>
				</form>
			  </div>
			</div>
		</div>
		<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
	</body>
</html>