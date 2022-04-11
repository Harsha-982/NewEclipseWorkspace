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
		out.println("You haven't logged in");
	}
	else{
	session.removeAttribute("name");
	session.invalidate();
	out.print("Succesfully logged out");
	}
%>
</body>
</html>
