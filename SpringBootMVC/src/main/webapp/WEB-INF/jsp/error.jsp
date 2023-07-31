<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
@import url("../../employee.css");
</style>
</head>
<body>
<%@page isErrorPage="true" %>


<div class="error1">
<h1>Employee error page</h1>

<h4><%= exception.getMessage() %> </h4>


</div>
</body>
</html>