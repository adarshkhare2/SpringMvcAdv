<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin</title>
</head>
<body>
<h1>your name is: <%=request.getAttribute("key1")%></h1>	
<h1>your city is: <%=request.getAttribute("key2")%></h1>
<h1>your age is:<%=request.getAttribute("key3")%></h1>
</body>
</html>