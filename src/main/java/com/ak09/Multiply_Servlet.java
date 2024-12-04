package com.ak09;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/multiply")
//instead of using servlet and servlet-mapping tags in xml, 
//linking the servlet class can be done directly in the class file using annotations

public class Multiply_Servlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {//doPost will accept only post request similarly we can write doGet
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		int result = num1 * num2;
//		PrintWriter out = res.getWriter();
//		out.println(num1*num2);
		res.sendRedirect("plusone?MultiplyRes="+result);//sending the values required by different class by adding the value in url.
	}
}
