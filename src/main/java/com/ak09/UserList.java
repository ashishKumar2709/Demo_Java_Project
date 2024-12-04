package com.ak09;

import java.io.IOException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/UserList")
public class UserList extends HttpServlet {
	UserServices service = new UserServices();
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		req.setAttribute("userList", service.getAllUsers());
		RequestDispatcher rd = req.getRequestDispatcher("/userList.jsp");
		rd.forward(req,res);
	} 	
}
