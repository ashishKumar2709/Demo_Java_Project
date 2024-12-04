package com.ak09;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Greet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
		ServletContext cntx = getServletContext(); //instantiate context object// context values defined in xml file can be fetched in any of the servlet classes.
		String name = cntx.getInitParameter("name");//get the value defined in the .xml file
		out.println("Hello "+name+"!");
	}
}
