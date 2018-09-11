package lib_man;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Servlet implementation class libcontroler
 */
@WebServlet("/libcontroler")
public class libcontroler extends HttpServlet {
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		librarian lib=new librarian();
		lib.setId(Integer.parseInt(request.getParameter("id")));
		lib.setName(request.getParameter("name"));
		lib.setPassword(request.getParameter("pass"));
		lib.setEmail(request.getParameter("email"));
		lib.setPhone(Integer.parseInt(request.getParameter("phone")));
		 
		Configuration con=new Configuration().configure().addAnnotatedClass(librarian.class);
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		session.save(lib);
		t.commit();
		sf.close();
		response.sendRedirect("adminmenu.jsp");
	}

}
