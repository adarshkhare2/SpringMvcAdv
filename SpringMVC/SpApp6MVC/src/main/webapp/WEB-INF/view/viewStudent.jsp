<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student</title>
</head>
<body>
	
<h1>your name is: <%=request.getAttribute("k1")%></h1>	

<h1>your city is: <%=request.getAttribute("k2")%></h1>

<h1>your age is:<%=request.getAttribute("k3")%></h1>


</body>
</html>
