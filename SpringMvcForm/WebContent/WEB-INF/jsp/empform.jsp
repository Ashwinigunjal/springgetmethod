<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>emp form</title>
</head>
<body>
<form:form method="post" action="save.html">
<table cellpadding="2">
<tr>
<td>Name : </td>
 <td><form:input path="name"  />
 </td>  
</tr>

<tr>
<td>Designation: </td>
<td><form:input path="designation"/></td>
</tr>

<tr>
<td>Password: </td>
<td><form:password path="password"/></td>
</tr>

<tr>
<td><input type="submit" value="save"/></td>
</tr>

</table>

</form:form>
</body>
</html>
