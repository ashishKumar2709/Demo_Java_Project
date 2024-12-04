package com.ak09;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		ServletConfig sconfig = getServletConfig();//getting individual servlet context values
		String str = sconfig.getInitParameter("description");
		int k = (int) req.getAttribute("k");
		PrintWriter out = res.getWriter();
		out.println(str);
		out.println("Square of sum of num1 and num2 : "+ k*k);
	}
}
