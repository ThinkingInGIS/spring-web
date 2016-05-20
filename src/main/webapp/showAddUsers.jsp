<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询所有用户</title>
</head>
<%
response.setCharacterEncoding("utf-8");
%>
<body>
<form action="<c:url value="/select.html" />" name="mainForm" method="post">
	<table>
		<tr>
			<td>查询条件：</td>	
		</tr>
		<tr>
			<td>用户名：<input type="text" name="QaddUserName" /></td>
			<td>真实姓名：<input type="text" name="QaddRealName" /></td>
			<td><input type="submit" value="查询"></td>
		</tr>
	</table>
</form>
<hr>
<table border="1" width="100%" cellpadding="2" cellspacing="1">
	<tr>
		<td>用户Id</td>
		<td>姓名：</td>
		<td>密码：</td>
		<td>真实姓名：</td>
		<td>操作</td>
	</tr>
	<c:forEach items="${list }" var="users">
	<tr>	
			<td>${users.id }</td>
			<td>${users.addUserName }</td>
			<td>${users.addPassword }</td>
			<td>${users.addReallName}</td>	
			<td><a href="modify.jsp?addUserName=${users.addUserName }&addPassword=${users.addPassword}&addReallName=${users.addReallName}">修改</a>&nbsp;&nbsp;<a href="delete.jsp?addUserName=${users.addUserName }">删除</a></td>			
	</tr>
	</c:forEach>	
</table>
<hr>
<a href="register.jsp">新增人员</a>
<br/>
<p>总共${list.size() }个用户</p>
</body>
</html>