<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		if(session.getAttribute("name")==null){
			response.sendRedirect("Login.jsp");
		}
	%>
	<h1 style="color:green;">Java full tutorial</h1>
	<a href="https://youtu.be/8cm1x4bC610">https://youtu.be/8cm1x4bC610</a>
	<form action="logout.jsp">
		<input type="submit" value="logout">
	</form>
</body>
</html>