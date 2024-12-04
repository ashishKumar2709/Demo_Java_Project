package com.ak09;

import java.util.List;

import jakarta.servlet.http.HttpServlet;

public class UserServices extends HttpServlet {
	UserDao userDao = new UserDaoImpl();
	
	public List<User> getAllUsers(){
		return userDao.getAllUsers();
	}
}
