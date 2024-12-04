<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User</title>
</head>
<body>
	<h1>User Details</h1>
	<%
		String url="jdbc:mysql://localhost:3306/mydb";
		String userName="root";
		String passString="*************";
		int user_id = Integer.parseInt(request.getParameter("user_id"));
		String query = "SELECT * FROM USERS WHERE user_id=?";
		Class.forName("com.mysql.cj.jdbc.Driver");
		try(
			Connection connect = DriverManager.getConnection(url, userName, passString);
		    PreparedStatement pst = connect.prepareStatement(query);
		){
			pst.setInt(1, user_id);
			ResultSet rs = pst.executeQuery();
			System.out.println(rs);
			out.println("<table border='1'>");
			out.println("<tr><th>ID</th><th>First Name</th><th>Last Name</th><th>Email</th></tr>");
			
			while(rs.next()){
				int id = rs.getInt("user_id");
				String first_name = rs.getString("first_name");
				String last_name = rs.getString("last_name");
				String email = rs.getString("email");
				out.println("<tr>");
				out.println("<td>"+id+"</td>");
				out.println("<td>"+first_name+"</td>");
				out.println("<td>"+last_name+"</td>");
				out.println("<td>"+email+"</td>");
				out.println("</tr>");
			}
			out.println("</table>");
		}catch(Exception e){
			e.printStackTrace();
		}
	%>
</body>
</html>