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
      <center><h3 > issuing Book in Library managment system</h3><br></center>
    <form action=issuecontroler method="post" >
    <label id="id" >Student Rollno</label>
    <input type="number" id="id" name="rollno" required="required" /><br><br>
    <label id="id" >Book Idno</label>
    <input type="number" id="id" name="bookid" required="required" /><br><br>
    <label id="id" >LibBookNO</label>
    <input type="number" id="id" name="lbn" required="required" /><br><br>
    <button id="log">submit</button>
    </form></div>
    </header>
   
<footer id="footer">
    copyright
    </footer>
    
  
</body>
</html>