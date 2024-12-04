package com.ak09;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class CubeServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int subValue = 0;
		Cookie cks[] = req.getCookies();//get cookies will give an array of cookies 
		for(Cookie ck : cks) {			
			if(ck.getName().equals("subResult")) {
				subValue = Integer.parseInt(ck.getValue());//getting the value of required cookie
			}
		}
		int result =(int) Math.pow(subValue, 3);
		PrintWriter out = res.getWriter();
		out.println("<a href=\"servletDemo.jsp\"> back</a><br><br><br>");
		out.println("<p>Cube of difference of num1 and num2 is: " +result+"</p>");
	}
}
