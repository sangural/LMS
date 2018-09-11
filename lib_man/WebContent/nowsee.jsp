<%@page import="lib_man.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String msg=request.getParameter("val");
session =request.getSession();
Student st=(Student)session.getAttribute("ses");
%>
<h1>woeking like charm</h1>
<h3><%=msg %></h3>
<h5><%=st.getCourse() %></h5>
<form action=lolhaha method="post">
<div class="menu" ><a Href=lolhaha>submit</a></div>
</form>
</body>
</html>