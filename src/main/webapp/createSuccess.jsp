<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>addUser successfully</title>
</head>
<body>
	<h1>用户：${addUser.addUserName } 增加成功！</h1>
	<table>
		<tr>
			<td>密码:</td>
			<td>${addUser.addPassword }</td>
		</tr>
		<tr>
			<td>真实姓名：</td>
			<td>${addUser.addReallName }</td>
		</tr>
	</table>
	<form action="<c:url value="/showAddUsers.html"/>" method = "post">		
		<input type="submit" value="查询所有用户">		
	</form>
</body>
</html>