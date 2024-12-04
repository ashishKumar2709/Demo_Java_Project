package com.ak09;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.http.HttpServlet;

public class UserDaoImpl implements UserDao {
	
	private static String url="jdbc:mysql://localhost:3306/mydb";
	private static String userName="root";
	private static String passString="***************";
	
	
	public static Connection getConnection() throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		try{
			Connection connect = DriverManager.getConnection(url, userName, passString);
			return connect;
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<User> getAllUsers() {
		 String query = "SELECT * FROM users;";
		 try(
				 Connection connect = getConnection();
				 PreparedStatement pst = connect.prepareStatement(query);
				 ResultSet res = pst.executeQuery();
				 ){
			 		List<User> userList = new ArrayList<>();
			 		while(res.next()) {
			 			userList.add(new User(res.getInt(1), res.getString(2), res.getString(3), res.getString(4)));
			 		}
			 		
			 		return userList;
		 }catch(Exception e) {
			 e.printStackTrace();
			 return null;
		 }
		 
	}
}
