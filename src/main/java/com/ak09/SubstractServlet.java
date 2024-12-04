package com.ak09;

import java.io.IOException;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SubstractServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int n1 = Integer.parseInt(req.getParameter("num1"));
		int n2 = Integer.parseInt(req.getParameter("num2"));
		
		int subResult = Math.abs(n1- n2);
		Cookie ck = new Cookie("subResult", subResult+"");//creating new cookie to hold the value of the result of this class. ""is appended to result to make it a string
		res.addCookie(ck);
		res.sendRedirect("cube");
		
	}
}
