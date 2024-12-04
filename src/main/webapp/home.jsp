<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body bgColor="lightblue">
	<%!
		int count = 0;
	%>
	<%
		String userName = request.getParameter("name");
		if(userName==null || userName.trim().isEmpty()){
	%>
	<p>
		Hello User! Please enter a valid name. 
	<p>
	<%
		}else{
		count++;
	%>
	<p>
		Welcome <%=userName%>
		
	</p>
	<p>
		This page has been accessed <%=count %> times.
	</p>
	<%} %>
</body>
</html>