<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home page</title>
</head>
<body>
	<a href="Logout">Logout</a>

	 <h2>Welcome, <c:out value="${sessionScope.name}"/>!</h2>
    <p>Your email: <c:out value="${sessionScope.emailId}"/></p>
	<br><br>
	<form action="users.jsp" method="get">
		<label id="user_id">Search User By Id: </label>
		<input name="user_id" type=text placeholder="Please enter user id"/>
		<button type="submit">Submit</button><br><br> <br>
	</form>
	<form action="UserList" method="get">
		<label id="list">See Complete User List: </label>
		<button id="list" type="submit">Show User List</button><br><br> <br>
	</form>
	<a href="servletDemo.jsp"> Servlet Demo</a><br>
	<a href="jspDemo.jsp"> JSP Demo</a><br>
	<a href="jstlDemo.jsp"> JSTL Demo</a><br>
</body>
</html>