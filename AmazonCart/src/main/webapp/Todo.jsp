<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Todo's</title>
</head>
<body>
<h4>Your Todo's</h4>
${todos} 
<form action="Todo.do">
Mango:<button type="submit" name="todo" value="Mango">Add</button>
Banana:<button type="submit" name="todo" value="Banana">Add</button>
Apple:<button type="submit" name="todo" value="Apple">Add</button>
</form>
<a href="Logout">Logout</a>
</body>
</html> 