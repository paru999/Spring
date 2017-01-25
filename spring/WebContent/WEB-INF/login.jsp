
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${msg}

<form:form name="submitform" method="POST">
<div align="center">
<table>
	<tr>
	<td>username</td>
	<td>password</td>
	</tr>
	<tr>
	<td><input type="text" id="uname" name="username"></td>
	<td><input type="password" id="psw" name="password"></td>
	<td><input type="submit" value="submit"></td>
	</tr>
</table>
</div>
</form:form>
${error}

</body>
</html>