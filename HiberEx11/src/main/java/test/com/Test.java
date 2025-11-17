package test.com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Test {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("emp.cfg.xml");
		SessionFactory sf= cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction ts= session.beginTransaction();
		Employee emp=new Employee();
		emp.setId(3);  
		emp.setFirstName("harshi");
		emp.setLastName("bhavya");
		session.delete(emp);
		ts.commit();
		session.close();
		System.out.println("Done..");

	}

}
