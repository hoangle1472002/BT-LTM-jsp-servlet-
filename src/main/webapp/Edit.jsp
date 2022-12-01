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
    <% SV sv = (SV)request.getAttribute("SV"); %>
	<%=request.getAttribute("message") %>  <%=sv.getName() %>
	<form action="CheckUpdateSvServlet" method="post">
	    <input type="hidden" name="id"  />
	    <br>
	    <br>
	    MSSV : <input type="text" name="mssv" value="<%=sv.getMssv() %>" />
		<br>
	    <br>
		Ho va ten : <input type="text" name="name" value="<%=sv.getName() %>"/>
		<br>
	    <br>
		Gioi tinh : <input type="text" name="gender" value="<%=sv.getGender() %>"/>
		<br>
	    <br>
	    Id Faculty : <input type="text" name="id_sv_faculty" value="<%=sv.getIdSvFaculty() %>"/>
		<br>
		<input type="submit" value="Update" />
	</form>
	
</body>
</html>