package com.ak09;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class Minus_One extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		HttpSession session = req.getSession();
		int divResult = (int) session.getAttribute("divResult");//fetching the value from different class from session.
		int result = divResult - 1;
		PrintWriter out = res.getWriter();
		out.println("Result: "+ result);
	}
}
