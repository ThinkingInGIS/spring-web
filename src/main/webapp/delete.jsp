<%@ page language="java" import="java.sql.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>删除人员页面</title>
</head>
<body>
<%
	Connection conn = null;
	Statement stmt = null;
	try{
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "123456");
		stmt = conn.createStatement();
		request.setCharacterEncoding("utf-8");
		String addUserName = request.getParameter("addUserName");
		String sql = "delete from adduser where addUserName = '" + addUserName + "'";
		stmt.execute(sql);
	} catch(Exception e){
		e.printStackTrace();
	} finally{
		stmt.close();
		conn.close();
	}
	
%>
	<form action="<c:url value="/showAddUsers.html"/>" method = "post">		
		<input type="submit" value="返回人员列表">
	</form>
</body>
</html>