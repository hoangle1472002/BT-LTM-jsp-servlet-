<%@page import="model.bean.SV"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    Them moi sinh vien
	<form action="CheckAddSvServlet" method="post">
	    MSSV : <input type="text" name="mssv"  />
	    <br>
		Ho va ten : <input type="text" name="name" />
		<br>
		Gioi tinh : <input type="text" name="gender" />
		<br>
	    Id Khoa : <input type="text" name="id_sv_faculty" />
		<br>
		<input type="submit" value="Add" />
	</form>
	
</body>
</html>