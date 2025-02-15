<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="com.example.jspaction.User" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Login Success</title>
</head>
<body>
    <%
        // Retrieve the User object from request attributes
        User user = (User) request.getAttribute("user");
    %>
    <h1>Welcome, <%= user.getUserName() %>!</h1>
</body>
</html>
