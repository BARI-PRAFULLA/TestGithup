

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertV {
	

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.addAnnotatedClass(Pojo.class).configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tx=ss.beginTransaction();
		
		Pojo dd=new Pojo(101, "vikas");
		ss.update(dd);
		
		tx.commit();
		System.out.println("Inserted");
		
		ss.close();
}
}