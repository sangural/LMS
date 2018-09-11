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
        margin:0%; background-color: black;
    }
    </style>
</head>
<body>
<header id="header">
      <h4 id="title"> Admin Section </h4>
      <%
      try {
    	 String msg=(String)request.getParameter("msg"); 
    	  if(!msg.equals("null")){out.println(msg);}
    	    }
      catch(Exception e){}
      %>
    <form action=login method=post >
    <label id="uname" >Username</label>
    <input type="text" id="uname" name="uname" required="required" />
    <label id="pass" >Password</label>
    <input type="password" id="pass" name="pass" required="required" /> 
    <button id="log">login</button>
    </form>
    </header>
<footer id="footer">
    copyright
    </footer>
    <img id="lib" src="img/1.jpg">
    <%
    try{
 	String isadmin=(String)session.getAttribute("isadmin");
    if(isadmin.equals("Sunilangural"))
    {response.sendRedirect("adminhome.jsp");}  }
    catch(Exception e){}
    %>
</body>
</html>