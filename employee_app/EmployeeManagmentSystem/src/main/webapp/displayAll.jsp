<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored ="false"%>
    
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>

<table border="2" rules="all" height="200" width="700">

	<tr>
		<th>ID</th>
		<th>NAME</th>
		<th>DESIGNATION</th>
		<th>SALARY</th>
	</tr>
		
	<c:forEach items ="${employeelist}" var="employees">
	 <tr>
             <td>${employees.id}</td>
             <td>${employees.name}</td>
             <td>${employees.designation}</td>
             <td>${employees.salary}</td>   
    </tr>
	</c:forEach>
	
</table>

<button ><a href="index.jsp">Go Back</a></button>

</center>

</body>
</html>