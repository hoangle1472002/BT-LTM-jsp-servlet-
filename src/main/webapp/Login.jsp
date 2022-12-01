<%@page import="model.bean.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>Dang nhap he thong</h2>
	<form action="CheckLoginServlet" method="post">
		UserName : <input type="text" name="name" />
		PassWord : <input type="text" name="pass" />
		<br>
		<input type="submit" value="Login" />
	</form>
	
	<br>
	<br>
	Regist account : <a href="RegistSvServlet" >Here</a>
</body>
</html>