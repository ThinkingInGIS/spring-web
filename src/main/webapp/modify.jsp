<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改页面</title>
</head>
<body>
<%	
	request.setCharacterEncoding("utf-8");
	String addUserName = request.getParameter("addUserName");
	String addPassword = request.getParameter("addPassword");
	String addReallName = request.getParameter("addReallName");
%>
	<form action="<c:url value="/modifyUser.html"/>" method = "post">
		<table border="1" width="100%" cellpadding="2">
		
			<tr>
				<td>用户名：</td>
				<td><input type="text"  name ="addUserName" value="<%=addUserName%>"/></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input type="text" name="addPassword" value="<%=addPassword %>"/></td>
			</tr>
			<tr>
				<td>姓名：</td>
				<td><input type="text" name="addReallName" value="<%=addReallName %>"/> </td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="确认修改"/> </td>
			</tr>
		</table>
	</form>
</body>
</html>