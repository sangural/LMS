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
@WebServlet("/bookcontroler")
public class bookcontroler extends HttpServlet {
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Book bk=new Book();
		bk.setBookid(Integer.parseInt(request.getParameter("id")));
		bk.setQuantity(Integer.parseInt(request.getParameter("quantity")));
		bk.setBook_name(request.getParameter("name"));
		bk.setAuthor(request.getParameter("author"));
		bk.setIssued(0); 
		Configuration con=new Configuration().configure().addAnnotatedClass(Book.class);
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		session.save(bk);
		t.commit();
		sf.close();
		response.sendRedirect("libmenu.jsp");
	}

}
