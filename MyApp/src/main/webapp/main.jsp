<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="Emp" class="com.sopra.bean.Employee"/>
<jsp:setProperty  property="empName" name="Emp" value="Deepu"/>
<jsp:getProperty  property="empName" name="Emp"/>

</body>
</html>