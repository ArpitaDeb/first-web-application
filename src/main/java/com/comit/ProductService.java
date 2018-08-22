package com.comit;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class ProductService {
		
	public List<Product> getProducts()
	{
		List<Product> products = new ArrayList<Product>();
        Connection connection = Database.getConnection();

        String sql = "SELECT * FROM products";

        try {
            PreparedStatement statement = connection.prepareStatement(sql);

            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()) {
            	int productId = resultSet.getInt("id");
            	String name = resultSet.getString("name");
            	String description = resultSet.getString("description");
            	double price = resultSet.getDouble("price");
            	products.add(new Product(productId, name, price, description));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

		return products;
	}
	
	public Product getProductById(int id)
	{
		Product product = null;
        Connection connection = Database.getConnection();

        String sql = "SELECT * FROM products WHERE id = ?";

        try {
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setInt(1, id);
            
            ResultSet resultSet = statement.executeQuery();

            if(resultSet.next()) {
            	int productId = resultSet.getInt("id");
            	String name = resultSet.getString("name");
            	String description = resultSet.getString("description");
            	double price = resultSet.getDouble("price");
            	product = new Product(productId, name, price, description);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

		return product;
	}
	
	public void insertProduct(Product product)
	{
        Connection connection = Database.getConnection();

        String sql = "INSERT INTO products (name, price, description) VALUES (?, ?, ?)";

        try {
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, product.getName());
            statement.setDouble(2, product.getPrice());
            statement.setString(3, product.getDescription());
            
            statement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
	
	public void updateProduct(Product product)
	{
        Connection connection = Database.getConnection();

        String sql = "UPDATE INTO products VALUES (?, ?, ?, ?)";

        try {
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(2, product.getName());
            statement.setDouble(1, product.getPrice());
            statement.setString(1, product.getDescription());
            
            statement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
	
	public void deleteProduct(int id)
	{
        Connection connection = Database.getConnection();

        String sql = "DELETE FROM products WHERE id = ?";

        try {
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setInt(1, id);
            
            statement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
}
