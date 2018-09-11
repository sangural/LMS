<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Section</title>
<link rel="stylesheet" href="css/index.css">
<style>
    body{
        margin:0%;
    }
    </style>
</head>
<body>
<% 
session=request.getSession();
String username=(String)session.getAttribute("isadmin");   %>
<header id="header">
      <h4 id="title"> Admin Section </h4>
    <form action=adminlogout method=post >
    <label id="pass" > 
    <%=username %>
    </label>
    <button id="log">logout</button>
    </form>
    </header>
<!--<footer id="footer">
    copyright
    </footer>--> <iframe id="nav" src="adminmenu.jsp">
    </iframe>
    
</body>
</html>