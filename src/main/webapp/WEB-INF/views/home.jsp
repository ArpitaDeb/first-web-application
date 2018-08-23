<%@ include file="../common/header.jspf" %>
<%@ include file="../common/navigation.jspf" %>

<div class="container">
	<h1 class="mt-3">
		Welcome back, ${user.firstName}
	</h1>
	<h2 class="mt-4">
		Products for Sale
	</h2>
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
	  	<form action="/products.do" method="post">
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

<%@ include file="../common/footer.jspf" %>