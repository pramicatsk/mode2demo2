<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form"  prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.error
{
 color: red;
 font-weight: bold;
 }</style>
</head>
<body>
<spring:form action="submiturl"  modelAttribute="userinfo" method="post">
enter user id <spring:input path="userId"/>
<br>
enter password<spring:input path="password"/>
<spring:errors  path="password"  cssClass="error"></spring:errors>
<input type="submit" value="click">


</spring:form>
</body>
</html>