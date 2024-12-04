package com.ak09;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/plusone")
public class Plus_One extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int n = Integer.parseInt(req.getParameter("MultiplyRes"));//getting the values required from other class set in the req url.
		int result = n+1;
		PrintWriter out = res.getWriter();
		out.println("Result of multiplication of num1 ad num2 plus one is: "+ result);
	}
}
