<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="model.bean.SV_Faculty"%>
<%@page import="model.bean.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Managed Student System</title>
<style>
    *{
    box-sizing: border-box;
    -webkit-box-sizing: border-box;
    -moz-box-sizing: border-box;
}
body{
    font-family: Helvetica;
    -webkit-font-smoothing: antialiased;
    background-color:#6bd9a0 ;
}
h2{
    text-align: center;
    font-size: 18px;
    text-transform: uppercase;
    letter-spacing: 1px;
    color: white;
    padding: 30px 0;
}
.tag-a{
    text-decoration: none;
    color : green;
    margin-right:20px;
    color: #4867bd;
    background-color: white;
    }
 .add-btn{
     text-decoration: none;
    color : green;
    margin-right:20px;
    color: #4867bd;
    background-color: white;
    border:1px solid #4867bd;
    font-size:18px;
    padding:1px 15px;
 }
/* Table Styles */

.table-wrapper{
    margin: 10px 70px 70px;
    box-shadow: 0px 35px 50px rgba( 0, 0, 0, 0.2 );
}

.fl-table {
    border-radius: 5px;
    font-size: 12px;
    font-weight: normal;
    border: none;
    border-collapse: collapse;
    width: 100%;
    max-width: 100%;
    white-space: nowrap;
    background-color: white;
}

.fl-table td, .fl-table th {
    text-align: center;
    padding: 8px;
}

.fl-table td {
    border-right: 1px solid #f8f8f8;
    font-size: 12px;
}

.fl-table thead th {
    color: #ffffff;
    background: #4867bd;
}


.fl-table thead th:nth-child(odd) {
    color: #ffffff;
    background: #324960;
}

.fl-table tr:nth-child(even) {
    background: #F8F8F8;
}

#submit {
  color: #4867bd;
  margin-top: 40px;
  transition: color 300ms;
  background-color: white;
  border: 1px solid #4867bd;
  font-size: 18px;
  transition:all 0.2s;
}
#submit:hover{
    cursor: pointer;
    background-color: #4867bd;
    color:white;
}

</style>
</head>
<body>
<%
	User a = (User)request.getSession().getAttribute("user");
	if (a!=null){
%>
  <h2>Welcome <%=a.getUsername() %></h2> <br>

<%}
%>
    <div class="table-wrapper">
        <form action="SearchSvServlet" style="color:black">
            Enter falculty to search : <input type="text" name="nameSearch" />
            <input type="submit" id="submit" value="Search" />
            <a href="AddSvServlet" class="add-btn"  >Add</a>
        </form>
        <br>
        <table class="fl-table">
            <thead>
            <tr>
                <th>Id</th>
                <th>MSSV</th>
                <th>Full Name</th>
                <th>Gender</th>
                <th>Faculty</th>
                <th>Delete</th>
                <th>Edit</th>
            </tr>
            </thead>
            <tbody>
				  <c:forEach var="item" items="${ListSV}">
				   <tr>
				    <td>${item.id}</td>
				    <td>${item.mssv}</td>
				    <td>${item.name}</td>
				    <td>${item.gender}</td>
				    <td>${item.nameFaculty}</td>
				    <td><a class="tag-a" href="DeleteSvServlet?id=<c:out value='${item.id}' />">Delete</a></td>
				    <td><a class="tag-a" href="UpdateSvlet?id=<c:out value='${item.id}' />">Edit</a></td>
				  </tr>
				
				</c:forEach>

            <tbody>
        </table>
    </div>
        
</body>
</html>