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
			out.println("kjgsaj");
			response.sendRedirect("Login.jsp");
		}
	%>
	Welcome ${name} <br>
	<a href="Video.jsp">click here for videos</a>

</body>
</html>