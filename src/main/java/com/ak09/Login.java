package com.ak09;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static String url="**************************";
	private static String userName="root";
	private static String passString="*****************";
	
	public static Connection getConnection() throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		try{
			Connection connect = DriverManager.getConnection(url, userName, passString);
			return connect;
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) {
		String emailId= req.getParameter("emailId");
		String password = req.getParameter("password");
		String query = "SELECT * FROM users WHERE email=? AND login_password=?";
		try(
				Connection connect = getConnection();
				PreparedStatement pst = connect.prepareStatement(query);
				){
				pst.setString(1, emailId);
				pst.setString(2, password);
				ResultSet loginRes = pst.executeQuery();
				if(loginRes.next()) {
					String firstName = loginRes.getString("first_name");
					int user_id = loginRes.getInt("user_id");
					HttpSession session = req.getSession();
					session.setAttribute("emailId", emailId);
					session.setAttribute("name", firstName);
					session.setAttribute("user_id", user_id);
					res.sendRedirect("welcome.jsp");
				}else {
					req.setAttribute("errorMessage", "Incorrect Email ID or Password");
					req.getRequestDispatcher("login.jsp").forward(req, res);
				}
				loginRes.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
