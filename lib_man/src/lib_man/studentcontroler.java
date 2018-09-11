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
 * Servlet implementation class studentcontroler
 */
@WebServlet("/studentcontroler")
public class studentcontroler extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	Student st=new Student();
	st.setName(request.getParameter("name"));
	st.setId(Integer.parseInt(request.getParameter("rollno")));
	st.setEmail(request.getParameter("email"));
	st.setCourse(request.getParameter("course"));
	st.setPassword(request.getParameter("pass"));
	st.setPhone(Integer.parseInt(request.getParameter("phone")));
	st.setQuota(Integer.parseInt(request.getParameter("books")));
	
	Configuration con=new Configuration().configure().addAnnotatedClass(Student.class);
	SessionFactory sf=con.buildSessionFactory();
	
	Session session=sf.openSession();
	
	Transaction t=session.beginTransaction();
	
	session.save(st);
	
	t.commit();
	
	sf.close();
	//Session session=
	response.sendRedirect("adminmenu.jsp");
	
	}

}
