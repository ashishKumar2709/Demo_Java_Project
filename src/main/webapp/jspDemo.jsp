<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Demo</title>
</head>
<body>
	<a href="welcome.jsp"> back</a><br>
	<h1>JSP Demo</h1>
	<form action="sqroot.jsp" method="get">
		<input name="num" type=number placeholder="Enter number"/><br> <br>
		<button type="submit">(num)^(1/2)</button><br><br> <br>
	</form>
	<form action="home.jsp" method="get">
		<input name="name" type=text placeholder="Please enter your name"/><br> <br>
		<button type="submit">Submit</button><br><br> <br>
	</form>
</body>
</html>