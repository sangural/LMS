package lib_man;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Servlet implementation class libcontroler
 */
@WebServlet("/issuecontroler")
public class issuecontroler extends HttpServlet {
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int rollno =Integer.parseInt(request.getParameter("rollno"));
		int bookid=Integer.parseInt(request.getParameter("bookid"));
		int lbn=Integer.parseInt(request.getParameter("lbn"));
		
		
		Configuration con=new Configuration().configure().addAnnotatedClass(Book.class).addAnnotatedClass(Student.class).addAnnotatedClass(IssueDetails.class);
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		Student st=(Student)session.get(Student.class, rollno);
		st.setQuota(st.getQuota()-1);
		Book bk=(Book)session.get(Book.class, bookid);
		bk.setIssued(bk.getIssued()+1);
		IssueDetails is=new IssueDetails();
		is.setLibbookno(lbn);
		is.setBookid(bookid);
		is.setStdroll(rollno);
		session.save(is);
		session.save(bk);
		session.save(st);
		t.commit();sf.close();
		response.sendRedirect("libmenu.jsp");
	}

}
