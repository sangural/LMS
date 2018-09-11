<%@page import="java.util.List"%>
<%@page import="org.hibernate.Query"%>
<%@page import="lib_man.IssueDetails"%>
<%@page import="org.hibernate.Transaction"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<%@page import="lib_man.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
table,tr,th,td{
border:2px solid black;
text-align:center;
border-collapse:collapse;
}
</style>
</head>
<body>

<%session =request.getSession();
  Student st=(Student)session.getAttribute("sobj");
    Configuration con=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(IssueDetails.class);
	SessionFactory sf=con.buildSessionFactory();
	Session hsession=sf.openSession();
	Transaction t=hsession.beginTransaction();
	Query q=hsession.createQuery("from IssueDetails where stdroll="+st.getId());
	List <IssueDetails> is=q.list();
	int checked=0;
%>
<center>
<h2>  Student Details:<br><br></h2>
<h3>  Name : <%=st.getName() %><br> 
Course : <%=st.getCourse() %><br>
Rollno : <%=st.getId() %><br>
</h3>
<form action="libmenu.jsp" method="post">
<table >
<thead>
<tr>
<th>Select
<th>libbookno
<th>bookid
<th>studentrollno
</tr>
</thead>
<tr>
<%for(IssueDetails obj:is)
{checked++;
String libno=obj.getLibbookno()+"";
	out.println("<tr><td>"+"<input type='checkbox' name='check' value="+libno+" "+"/>"+
+checked+"<td>"+libno+"<td>"+obj.getBookid()+"<td>"+obj.getStdroll()+"</tr>"); } %>
</table>
<h1>checkecount: <%=checked %><br> checksession:<%=session.getAttribute("section") %></h1>
<%
session.setAttribute("checks", checked); %>

<button id="log">submit</button>
</form></center>
</body>
</html>