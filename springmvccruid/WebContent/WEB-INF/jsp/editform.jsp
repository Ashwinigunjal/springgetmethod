<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Add Employee</h1>
<form:form method="POST" action ="/springmvccruid/editsave">
<table>
<tr>
	
	<td><form:hidden path="id"/></td>
</tr>
<tr>
	<td>Name :</td>
	<td><form:input path="name"/></td>
</tr>
<tr>
	<td>Password :</td>
	<td><form:input path="password"/></td>
</tr>

<tr>
	<td></td>
	<td><input type="submit" value="Save"/></td>
</tr>

</table>
</form:form>
<br><br>




</body>
</html>