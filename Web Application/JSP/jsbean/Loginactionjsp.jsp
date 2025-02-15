<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<style>
body {
	font-family: Arial, sans-serif;
	text-align: center;
	margin-top: 50px;
}

.error-message {
	color: red;
	font-size: 14px;
}
</style>
</head>
<body>


	<!-- Login form -->
	<form method="post" action="loginaction-process.jsp">
		UserName: <input type="text" name="userName" /><br /> 
		Password: <input type="password" name="password" /><br /> 
		<input type="submit" name="login" value="Login" />
	</form>
</body>
</html>
