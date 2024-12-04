package com.ak09;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Add_servlet extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		PrintWriter out = res.getWriter();
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		System.out.println(i+" "+j);
		int k= i+j;
		req.setAttribute("k",k);//adding the values required by different class directly in the request object
		RequestDispatcher rd = req.getRequestDispatcher("square");//using request dispatcher to dispatch the 
		rd.forward(req, res);//forwarding the req and res object of this class to the required class
	}
}
 