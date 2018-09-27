<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>view form</title>
</head>
<body>

<h1>Employees List</h1>  
<table border="2" cellpadding="2" width="100%">
<tr><td>Id</td><td>Name</td><td>Password</td></tr>
<c:forEach var="list" items="${list}">
<tr>
	<td>${list.id}</td>
	<td>${list.name}</td>
	<td>${list.password}</td>
	<td><a href="editemp/${list.id}">Edit ${list.id}</a></td>  
    <td><a href="deleteemp/${list.id}">Delete</a></td>  
	

</tr>
</c:forEach>

</table>  
</body>
</html>