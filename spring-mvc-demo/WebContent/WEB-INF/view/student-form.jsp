<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration Form</title>
</head>
<body>
	<form:form action="processStudentForm" modelAttribute="student">
	First Name : <form:input path="firstName"/>
	<br> <br>
	Last Name : <form:input path="lastName"/>
	<br> <br>
	Country :
	<form:select path="country">
		<form:options items="${student.countryOptions}"/>
	</form:select>
	<br> <br>
	Favorite Language <br>
	<form:radiobutton path="favoriteLang" value="Java"/> Java <br>
	<form:radiobutton path="favoriteLang" value="Python"/> Python  <br>
	<form:radiobutton path="favoriteLang" value="C#"/> C#  <br>
	 <form:radiobutton path="favoriteLang" value="Javascript"/>Javascript <br>
	<form:radiobutton path="favoriteLang" value="C++"/> C++ 
	<br> <br>
	Operating Systems
	<form:checkboxes items="${student.operatingSystems}"  path="operatingSystems"/>
	<br> <br>
	<input type="submit" value="Submit"/>
	
	</form:form>
</body>
</html>