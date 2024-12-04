<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Servlet Demo</title>
</head>
<body>
	<a href="welcome.jsp"> back</a><br>
	<h1>Servlet Demo</h1>
	<form action="add" >
		<input name="num1" type=number placeholder="Enter first number"/><br> <br>
		<input name="num2" type=number placeholder="Enter second number"/><br> <br>
		<button type="submit">(num1+num2)^2</button><br> <br><br>
	</form>
	<form action="multiply" method="post">
		<input name="num1" type=number placeholder="Enter first number"/><br> <br>
		<input name="num2" type=number placeholder="Enter second number"/><br> <br>
		<button type="submit">(num1*num2)+1</button><br> <br><br>
	</form>
	<form action="divide" method="get">
		<input name="num1" type=number placeholder="Enter first number"/><br> <br>
		<input name="num2" type=number placeholder="Enter second number"/><br> <br>
		<button type="submit">(num1/num2)-1</button><br> <br><br>
	</form>
	<form action="substract" method="get">
		<input name="num1" type=number placeholder="Enter first number"/><br> <br>
		<input name="num2" type=number placeholder="Enter second number"/><br> <br>
		<button type="submit">(|num1-num2|)^3</button><br> <br><br>
	</form>
</body>
</html>