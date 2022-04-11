<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

</head>
<body>
<form action="Login.do" method="post">
<p style="color:red">${ErrorMessage}</p>
UserName:<input type="text" name="name"/> <br><br>
Password:<input type="password" name="password"/><br><br>
<input type="submit" onclick="return check(this.form)" value="Login"/>
</form>
<script>
function check(form)
{

    if(form.name.value=="" || form.password.value=="" )
    {
        alert("UserName or Password has not entered")
        return false;
    }
    else
    {
        return true;
    }
}
</script>
</body>
</html>