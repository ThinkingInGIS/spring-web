<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="content-type" content="text/html; charset=utf-8" />
	<link rel="shortcut icon" type="image/ico" href="/images/favicon.ico" />	
	<title>My spring</title>		
	<link href="css/style.css" type="text/css" media="screen" rel="stylesheet" />		
	<style type="text/css">
		img, div { behavior: url(iepngfix.htc) }
	</style>
</head>
<!--  
<body id="login">
	<c:if test="${!empty error}"> 
		<font color="red"><c:out value="${error}"/></font>
	</c:if>
	<form action="<c:url value="/loginCheck.html"/>" method="post">
		用户名：
		<input type="text" name="userName">
		<br/>
		<br/>
		密码：
		<input type="password" name="password">
		<br/>
		<input type="submit" value="登录">
		<input type="reset" value="重置">
	</form>
</body>
-->
<body id="login">
		<div id="wrappertop"></div>
			<div id="wrapper">
					<div id="content">
						<div id="header">
							<h1><a href=""><img src="image/logo.png" alt="FreelanceSuite"></a></h1>
						</div>
						<div id="darkbanner" class="banner320">
							<h2>Login</h2>
						</div>
						<div id="darkbannerwrap">
						</div>
						<form name="form1" method="post" action="<c:url value="/loginCheck.html"/>">
						<fieldset class="form">
                        	<p>                                                                                      
								<label for="user_name">Username:</label>
								<input name="userName" id="user_name" type="text" value="" />
							</p>
							<p>
								<label for="user_password">Password:</label>
								<input name="password" id="user_password" type="password" />
							</p>
							<button type="submit" class="positive" name="Submit">
								<img src="image/key.png" alt="Announcement"/>Login
							</button>
							<ul id="forgottenpassword">
								<li class="boldtext">|</li>
								<li><a href="forgot.php">Forgotten it?</a></li>
							</ul>
                            </fieldset>
						</form>		
					</div>
				</div>   

<div id="wrapperbottom_branding">
	<div id="wrapperbottom_branding_text">
		<a href="https://github.com/ThinkingInGIS/" style='text-decoration:none'>Powered By ThinkingInGIS
		</a>.
	</div>
</div>
</body>
</html>