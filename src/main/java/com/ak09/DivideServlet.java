package com.ak09;

import java.io.IOException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class DivideServlet extends HttpServlet {
	public void doGet (HttpServletRequest req, HttpServletResponse res) throws IOException {
		int n1 = Integer.parseInt(req.getParameter("num1"));
		int n2 = Integer.parseInt(req.getParameter("num2"));
		int divResult = n1/n2;
		HttpSession session = req.getSession();
		session.setAttribute("divResult", divResult);//setting the values required by different class in session 
		res.sendRedirect("minusone");
	}
}
