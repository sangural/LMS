<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/index.css">

</head>
<style>
    body{
        margin:0%; overflow: hidden;
    }
    </style>

<body id="body">
<header id="theader">
      <div id="embded">
      <center><h3 > Add Librarian in Library managment system</h3><br></center>
    <form action=libcontroler method="post" >
    <label id="name" >Librarian Name</label>
    <input type="text" id="name" name="name" required="required" /><br><br>
    <label id="id" >UserId</label>
    <input type="text" id="id" name="id" required="required" /><br><br>
    <label id="pass" >Password</label>
    <input type="text" id="pass" name="pass" required="required" /><br> <br>
    <label id="email" >E-Mail</label>
    <input type="email" id="email" name="email" required="required" /><br><br>
    <label id="phone" >Phone no.</label>
    <input type="number" id="phone" name="phone" required="required" /><br><br>
    
    <button id="log">submit</button>
    </form></div>
    </header>
   
<footer id="footer">
    copyright
    </footer>
    
  
</body>
</html>