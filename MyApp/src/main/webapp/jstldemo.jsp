<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="i" value="10" scope="application"></c:set>
<a href="contact.jsp">click</a>
<c:out value="${i}"></c:out>
<c:out value="${i}"></c:out>
<c:forEach var="k" begin="1" end="10">
<c:out value="${k}"></c:out>
</c:forEach>
</body>
</html>