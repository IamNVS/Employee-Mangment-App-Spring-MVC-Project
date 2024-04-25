<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored ="false"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<center>

<table border="2" rules="all" height="200" width="700" >

	<tr>
		<th>ID</th>
		<th>NAME</th>
		<th>DESIGNATION</th>
		<th>SALARY</th>
	</tr>
		
	<tr>
		<td>${employee.id }</td>
		<td>${employee.name }</td>
		<td>${employee.designation }</td>
		<td>${employee.salary }</td>
	</tr>
	
</table>

<button ><a href="index.jsp">Go Back</a></button>

</center>


</body>
</html>