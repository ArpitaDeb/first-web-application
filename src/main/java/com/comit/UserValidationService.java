package com.comit;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserValidationService
{	
	public boolean isUserValid(String username, String password)
	{
        User user = getUser(username);
        
        if (user != null && user.password.equals(password))
		{
        	return true;
		}
        return false;
	}
	
	public User getUser(String username)
	{
		User user = null;
        Connection connection = Database.getConnection();

        String sql = "SELECT * FROM users WHERE username = ?";

        try {
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, username);

            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()) {
            	String password = resultSet.getString("password");
            	String firstName = resultSet.getString("firstName");
            	String lastName = resultSet.getString("lastName");
            	
            	user = new User(username, password, firstName, lastName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
	}
	
	public void insertUser(String username, String password)
	{
        Connection connection = Database.getConnection();

        String sql = "INSERT INTO users (username, password) VALUES (?, ?)";

        try {
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, username);
            statement.setString(2, password);
            
            statement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
}
