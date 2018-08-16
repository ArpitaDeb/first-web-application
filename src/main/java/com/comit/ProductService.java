package com.comit;

import java.util.*;

public class ProductService {
		
	public List<Product> getProducts()
	{
		List<Product> products = new ArrayList<Product>();

		products.add(new Product("Apple", 1.99, "Really good in pies."));
		products.add(new Product("Banana", 1.50, "Easy to peel."));
		products.add(new Product("Orange", 2.00, "Named after the color."));
		products.add(new Product("Grape", 4.75,"Seedless!"));
		products.add(new Product("Strawberry", 5.99, "Supposed to be pretty good for you."));
		products.add(new Product("Pineapple", 8.99, "It's really difficult to cut."));
		products.add(new Product("Coconut", 12.99, "Good luck opening this."));
		
		return products;
	}
}
