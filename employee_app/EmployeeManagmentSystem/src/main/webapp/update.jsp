
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib prefix="form" uri = "http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form action="updateEmp" modelAttribute="employee">
	
	<h1 style="color:blue;">Enter the  existing id of employee and fill the values to be updated here </h1>
		<form:label path="id">ID</form:label>
		<form:input path="id"/>
		
		<form:label path="designation">DESIGNATION</form:label>
		<form:input path="designation"/>
		
		<form:label path="salary">SALARY</form:label>
		<form:input path="salary"/>
		
		<input type = "submit" value = "UPDATE EMPLOYEE">

</form:form> <br><br>


</body>
</html>