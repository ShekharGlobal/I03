<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Person Information</title>
</head>
<body>

<h2>Person Details</h2>

<%-- Accessing the Person object from the request attribute --%>
<p>First Name: ${person.firstName}</p>
<p>Last Name: ${person.lastName}</p>
<p>Age: ${person.age}</p>

</body>
</html>
