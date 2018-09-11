package lib_man;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String username=request.getParameter("uname");
    	String password=request.getParameter("pass");
    	System.out.println("name="+username+"/n password="+password);
    	if(username.equals("sunilangural")&&password.equals("mr.angural")) {
    		out.write("<h1>welcome sunil </h1>");
    		HttpSession session=request.getSession();
    		String name="Sunilangural";
    		session.setAttribute("isadmin", name);
    		response.sendRedirect("adminhome.jsp");
    	}
    	else
    	{
    	 RequestDispatcher rd=request.getRequestDispatcher("lbadmin.jsp?msg=Sorry username and password error");
    	 rd.forward(request, response);
    	}
	}

}
