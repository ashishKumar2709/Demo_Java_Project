<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
	<form action="Login" method='POST'>
		Email ID: <input id='emailId' name='emailId' type=email placeholder="Enter email ID"/>
		Password: <input id='password' name='password' type=password placeholder="Enter password"/>
		<button type='submit' id='login'>Login</button>
	</form>
	<p>${errorMessage}</p>
</body>
</html>