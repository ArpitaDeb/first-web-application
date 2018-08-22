package com.comit;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/products.do")
public class ProductsServlet extends HttpServlet {
	
	private ProductService productService = new ProductService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setAttribute("products", productService.getProducts());
		request.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("name");
		double price = Double.parseDouble(request.getParameter("price"));
		String description = request.getParameter("description");
		
		Product newProduct = new Product(name, price, description);
		productService.insertProduct(newProduct);
		
		request.setAttribute("products", productService.getProducts());
		request.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(request, response);	
	}
}
