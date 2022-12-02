<%@page import="model.bean.SV"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Managed student system</title>
<style>
/* Style inputs with type="text", select elements and textareas */
html {
    min-height: 100%;
    margin: 0;
}
body {
    margin: 0;
    box-sizing: border-box;
    background-color: #6bd9a0;
    display: flex;
    justify-content:center;
}
input[type=text], select, textarea {
  width: 100%; /* Full width */
  padding: 12px; /* Some padding */ 
  border: 1px solid #ccc; /* Gray border */
  border-radius: 4px; /* Rounded borders */
  box-sizing: border-box; /* Make sure that padding and width stays in place */
  margin-top: 6px; /* Add a top margin */
  margin-bottom: 16px; /* Bottom margin */
  resize: vertical /* Allow the user to vertically resize the textarea (not 
  horizontally) */
}

/* Style the submit button with a specific background color etc */
input[type=submit] {
  background-color: #474A59;
  color: white;
  padding: 12px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

/* When moving the mouse over the submit button, add a darker green color */
input[type=submit]:hover {
  background-color: #45a049;
}

/* Add a background color and some padding around the form */
.container {
  border-radius: 5px;

  padding: 20px;
  width:40%;
}
</style>
</head>
<body>
    <% SV sv = (SV)request.getAttribute("SV"); %>
       <div class="container">
		 <h1 style="text-align:center">Update student with name is : <%=sv.getName() %></h1>
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
      </div>
	
</body>
</html>