package lib_man;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class StoreData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( "Hello World  45    856!" );
		IssueDetails is=new IssueDetails();
		//is.setB(null);
		//is.setS(null);
		is.setLibbookno(1313);
		//st.setIssued(Integer.parseInt(request.getParameter("id")));
		System.out.println(is);
		
		
		Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(IssueDetails.class).addAnnotatedClass(Book.class);
		
		SessionFactory sf = con.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(is);
		//obj=session.get(STpojo.class, 20);
		tx.commit();
		//System.out.println(obj);
		
	}

}
