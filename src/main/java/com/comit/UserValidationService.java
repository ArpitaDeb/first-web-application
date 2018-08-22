package com.comit;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserValidationService
{	
	public boolean isUserValid(String username, String password)
	{
        boolean userValid = false;
        Connection connection = Database.getConnection();

        String sql = "SELECT * FROM users WHERE username = ? AND password = ?";

        try {
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, username);
            statement.setString(2, password);

            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()) {
            	userValid = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return userValid;
	}
	
	public boolean doesUserExist(String username)
	{
        boolean usernameExists = false;
        Connection connection = Database.getConnection();

        String sql = "SELECT * FROM users WHERE username = ?";

        try {
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, username);

            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()) {
            	usernameExists = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return usernameExists;
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
