<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Servlet and JSP Demo</title>
</head>
<body bgcolor="lightblue">
<%
	int n = Integer.parseInt(request.getParameter("num"));
//jsp gives implicit objects ie when it run the .jsp file is converted to servlet
//And all the objects required by the code ie request, out is created inside a service method of servlet class. 
	double result = Math.sqrt(n);
	out.println("Square root is: "+result);
%>
</body>
</html>