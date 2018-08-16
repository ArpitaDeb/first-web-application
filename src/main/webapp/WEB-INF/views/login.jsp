<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!doctype html>
<html>
	<head>
		<title>Kyle's Grocery</title>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
		<link rel="stylesheet" href="styles/main.css">
	</head>
	<body>
		<div class="container">
		
			<c:if test="${errorMessage != null }">
				<div class="alert alert-danger mt-3" role="alert">
	  				${errorMessage}
				</div>
			</c:if>
						
			<div class="row mt-3">
				<div class="mx-auto col-sm-6">
					<div class="card ">
					  <h5 class="card-header">Login to continue</h5>
					  <div class="card-body">					  
					  	<form action="/login.do" method="post">
						  <div class="form-group">
						    <label for="exampleInputEmail1">Username</label>
						    <input type="text" class="form-control" name="username" placeholder="Enter Username">
						  </div>
						  <div class="form-group">
						    <label for="exampleInputPassword1">Password</label>
						    <input type="password" class="form-control" name="password" placeholder="Password">
						  </div>
						  <button type="submit" class="btn btn-primary">Login</button>
						</form>
					  </div>
					</div>
				</div>
			</div>
		</div>
		<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
	</body>
</html>