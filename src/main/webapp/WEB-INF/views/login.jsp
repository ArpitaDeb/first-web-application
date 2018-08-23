<%@ include file="../common/header.jspf" %>

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
		
<%@ include file="../common/footer.jspf" %>