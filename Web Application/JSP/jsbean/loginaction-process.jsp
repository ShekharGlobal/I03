<%@ page import="java.io.*" %>
<%@ page import="jakarta.servlet.*" %>
<%@ page import="jakarta.servlet.http.*" %>
<%@ page import="com.example.jspaction.User" %> <!-- Adjust this import based on your User class package -->

<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
</head>
<body>

<%
    String userName = request.getParameter("userName");
    String password = request.getParameter("password");
    User user = new User();

    if (userName != null && password != null) {
        user.setUserName(userName);
        user.setPassword(password);

        // Validate credentials
        if ("tom".equals(user.getUserName()) && "jerry".equalsIgnoreCase(user.getPassword())) {
            // Set user object in request scope
            request.setAttribute("user", user);
            // Forward to success page
            RequestDispatcher dispatcher = request.getRequestDispatcher("successaction.jsp");
            dispatcher.forward(request, response);
            return; // Ensure no further code is executed
        } else {
            out.print("User Name and Password does not match");
        }
    }
%>
