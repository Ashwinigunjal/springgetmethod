<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>View Emp</title>
</head>
<body>
<h1>Employee Details: </h1>
<table border="2" width="100%" cellpadding="2">
<tr><th>Id</th><th>Name</th><th>Designation</th><th>Password</th> </tr>
<c:forEach var="emp" items="${list}">
<tr>
<td>${emp.id}</td>
<td>${emp.name}</td>
<td>${emp.designation}</td>
<td>${emp.password}</td>

</tr>
</c:forEach>

</table>
</body>
</html>