package lib_man;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class usercheck
 */
@WebServlet("/usercheck")
public class usercheck extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		session=request.getSession();
	    String username=(String)session.getAttribute("name");
	    if(username.equals("sunilangural"))
	    {response.sendRedirect("adminhome.jsp");}
	    else
	    	response.sendRedirect("lbadmin.jsp");	
	    }

}
