<%@page import="org.hibernate.Query"%>
<%@page import="org.hibernate.Transaction"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="lib_man.IssueDetails"%>
<%@page import="lib_man.Student"%>
<%@page import="lib_man.Book"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/index.css">
<script type="text/javascript">
function addstudent(){
	href="addstudent.jsp";
}
</script>
</head>
<style>
    body{
        margin:0%; overflow: hidden;
    }
    </style>

<body id="body">
<header id="theader">
      <div id="embded">
      <!-- <center><h2 > Menu</h2><br></center>-->	
    <div class="menu" >
    <a href="addbook.jsp">search Book</a> 
    <a class="st" href="checknotification.jsp">Check Notification </a>
    </div>
    <h1>
   
   <br><br>
   <%
   try{
   String values[]=request.getParameterValues("check");
    Configuration con=new Configuration().configure().addAnnotatedClass(Book.class).addAnnotatedClass(Student.class).addAnnotatedClass(IssueDetails.class);
	SessionFactory sf=con.buildSessionFactory();
	Session hsession=sf.openSession();
	IssueDetails is;
	Transaction t;
	int lbn;
	Query query;
   for(String val:values)
   { t=hsession.beginTransaction();
	 lbn=Integer.parseInt(val);
	 is=(IssueDetails)hsession.get(IssueDetails.class, lbn);
	t.commit();
	t=hsession.beginTransaction();
	///incrementing in table
	query=hsession.createQuery("update Student set quota=quota+1 WHERE id = "+is.getStdroll());
	query.executeUpdate();System.out.println("working update");
	////dicrementing in table
	 query=hsession.createQuery("update Book set issued=issued-1 WHERE bookid = "+is.getBookid());
	query.executeUpdate();
	//deleting table row
	query=hsession.createQuery("delete IssueDetails WHERE Libbookno = "+lbn);
	query.executeUpdate(); 
	 
	t.commit(); 
	   
   }}catch(Exception e){}
   
   %>
   hi
   </h1>
     </header>
   
<footer id="footer">
    copyright
    </footer>
    
  
</body>
</html>