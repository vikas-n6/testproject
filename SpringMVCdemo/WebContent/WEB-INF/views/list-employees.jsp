<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employees List</title>
</head>
<body>
<h2>Employee Genaral info</h2>

<table>
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Email</th>
<th>Role</th>
</tr>
<c:forEach  var="tempEmployee" items="${employees}">
<tr>
<td>${tempEmployee.firstName}</td>
<td>${tempEmployee.lastName}</td>
<td>${tempEmployee.email}</td>
<td>${tempEmployee.role}</td>
</tr>
</c:forEach>
</table>

</body>
</html>