<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="model.bean.SV_Faculty"%>
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
<%
	User a = (User)request.getSession().getAttribute("user");
	if (a!=null){
%>
  <h1>Welcome <%=a.getUsername() %></h1> <br>

<%}
%>

<form action="SearchSvServlet">
	Input name to search : <input type="text" name="nameSearch" />
	<br>
	<input type="submit" value="Search" />
</form>


	<h3><%=request.getAttribute("message")%></h3>
	<a href="AddSvServlet" />Add new</a>
	
	<table>
	  <tr>
	    <th>id</th>
	    <th>MSSV</th>
	    <th>Ho va ten</th>
	    <th>Gioi tinh</th>
	    <th>Khoa</th>
	  </tr>
	  <c:forEach var="item" items="${ListSV}">
	   <tr>
	    <td>${item.id}</td>
	    <td>${item.mssv}</td>
	    <td>${item.name}</td>
	    <td>${item.gender}</td>
	    <td>${item.nameFaculty}</td>
	    <td><a href="DeleteSvServlet?id=<c:out value='${item.id}' />">Delete</a></td>
	    <td><a href="UpdateSvlet?id=<c:out value='${item.id}' />">Edit</a></td>
	  </tr>
	
	</c:forEach>
	</table>

</body>
</html>