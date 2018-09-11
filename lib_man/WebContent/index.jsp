<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Library managment system</title>
<link rel="stylesheet" href="css/index.css">
<style>
    body{
        margin:0%; background-color: black;
    }
    </style>
</head>
<body><%
try {
	String requestpage="";
	System.out.println("server : "+session.getId());
	Cookie[] cookies = request.getCookies();
	if(cookies!=null){
	 for(Cookie c:cookies)
	  {
		if(c.getName().equals("sessionid"))
			{	String sessionid=c.getValue();
			if( sessionid.equals(session.getId()))
			{	response.sendRedirect("libhome.jsp");	}
			
		}
		// 
		}	
	}
	

}catch(Exception e){}
%>
<header id="header">
      <h4 id="title"> Library managment system</h4>
     <%
      try {
    	 String msg=(String)request.getParameter("msg"); 
    	  if(msg.equals("True")){out.println("Enter correct username or password");}
    	  else{out.println(msg);}
      }
      catch(Exception e){}
      %>
    <form action=ilogin method="post">
    <label id="uname" >Username</label>
    <input type="text" id="uname" name="id" required="required" />
    <label id="pass" >Password</label>
    <input type="password" id="pass" name="pass" required="required" /> 
    <button id="log">login</button>
    </form>
    </header>
<footer id="footer">
    copyright
    </footer>
    <img id="lib" src="img/1.jpg">
</body>
</html>