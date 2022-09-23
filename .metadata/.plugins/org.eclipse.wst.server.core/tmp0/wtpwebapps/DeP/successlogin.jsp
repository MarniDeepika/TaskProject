<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


Welcome to home page
<%=session.getAttribute("password1") %><hr>
<%=session.getAttribute("username") %>


<form action="logout" method="post">

<input type="submit" value="logout">
</form>
</body>
</html>