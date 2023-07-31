<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
@import url("../../employee.css")
</style>
</head>
<body>

<form action="empAction">
<h2>Employee Form</h2>
<div>
  <label> Enter id</label><input name="id">
</div>
<div>
  <label> Enter Name</label><input name="name">
</div>
<div>
  <label> Enter Salary</label><input name="salary">
</div>
<div>
		<input type="submit">
		<input type="reset">
</div>
</form>
</body>
</html>