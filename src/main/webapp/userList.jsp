<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JstlDemo</title>
</head>
<body>
<a href="welcome.jsp">back</a>
<h1>User List</h1>
	<table border='1'>
	<tr><th>ID</th><th>First Name</th><th>Last Name</th><th>Email</th></tr>
	 	<c:forEach var="user" items="${userList}">
	 		<tr>
				<td>${user.user_id}</td>
				<td>${user["first_name"]}</td>
				<td>${user["last_name"]}</td>
				<td>${user["email"]}</td>
			</tr>
	 	</c:forEach>
	</table>
</body>
</html>