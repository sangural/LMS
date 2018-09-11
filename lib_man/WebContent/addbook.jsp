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
      <center><h3 > Add Book in Library managment system</h3><br></center>
    <form action=bookcontroler method="post" >
    <label id="name" >Book Name</label>
    <input type="text" id="name" name="name" required="required" /><br><br>
    <label id="id" >Author</label>
    <input type="text" id="id" name="author" required="required" /><br><br>
    <label id="email" >Book id</label>
    <input type="number" id="email" name="id" required="required" /><br><br>
     <label id="quty" >Book Quantity</label>
    <input type="number" id="quty" name="quantity" required="required" /><br><br>
    <button id="log">submit</button>
    </form></div>
    </header>
   
<footer id="footer">
    copyright
    </footer>
    
  
</body>
</html>