package lib_man;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
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
 * Servlet implementation class ilogin
 */
@WebServlet("/ilogin")
public class ilogin extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int username=Integer.parseInt(request.getParameter("id"));
		String pass=request.getParameter("pass");
		Configuration con=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(librarian.class);
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		Transaction t;
		String requestpage="index.jsp?msg=True";
		HttpSession ressession=request.getSession();
		Cookie usernamecookie=new Cookie("sessionid",ressession.getId());		
				
		System.out.println("running");/////////***************************
		try {
		t=session.beginTransaction();
		librarian lib=session.get(librarian.class, username);
		t.commit();
		if(lib.getPassword().equals(pass)) {
			ressession.setAttribute("name", lib.getName());
			ressession.setAttribute("section", "Librarian");
			requestpage="libhome.jsp";
		}
		
		
		}
		catch(Exception e) {}
		try {t=session.beginTransaction();System.out.println("sty executedworning");
			Student st=session.get(Student.class, username);
			t.commit();
			if(st.getPassword().equals(pass)) {
				ressession.setAttribute("name", st.getName());
				ressession.setAttribute("section", "Student");
				requestpage="libhome.jsp";
			}
			
			
			}
			catch(Exception e) {}
			response.addCookie(usernamecookie);
			response.sendRedirect(requestpage);
		
		
		
	}

}
