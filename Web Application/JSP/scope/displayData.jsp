<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Data Display</title>
</head>
<body>

	<h2>Data from Different Scopes</h2>

	<%-- Accessing the data from the request scope --%>
	<p>Request Scope Data: ${requestData}</p>

	<%-- Accessing the data from the session scope --%>
	<p>Session Scope Data: ${sessionData}</p>

	<%-- Accessing the data from the application scope --%>
	<p>Application Scope Data: ${applicationData}</p>

</body>
</html>
