package lib_man;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Servlet implementation class addissuedetail
 */
@WebServlet("/returncontroler")
public class returncontroler extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int rollno =Integer.parseInt(request.getParameter("rollno"));
		
		
		Configuration con=new Configuration().configure().addAnnotatedClass(Book.class).addAnnotatedClass(Student.class).addAnnotatedClass(IssueDetails.class);
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		Student run=(Student)session.get(Student.class, rollno);
		HttpSession tempsession; 
		PrintWriter out=response.getWriter();
		
		if(run!=null) {
		    tempsession=request.getSession();
			tempsession.setAttribute("sobj", run);
			response.sendRedirect("checkboxreturnbook.jsp");
				}
		else
		{ 
		out.println("<h1> student not found </h1>");
		}
	}

}
