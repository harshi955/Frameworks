package com.test.HiberEx12;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Object {

	public static void main(String[] args) {
//		Configuration cfg=new Configuration();
//		cfg.configure("stu.cfg.xml");
		StandardServiceRegistry str= new StandardServiceRegistryBuilder().configure("stu.cfg.xml").build();
		Metadata meta =new MetadataSources(str).getMetadataBuilder().build();
		SessionFactory sf= meta.getSessionFactoryBuilder().build();
		Session session=sf.openSession();
		Transaction ts= session.beginTransaction();
		Student emp=new Student();
		emp.setId(1);  
		emp.setName("bhanu");
		emp.setCity("Mpl");
		emp.setEmail("bhanu@gmail.com");
		session.save(emp);
		ts.commit();
		session.close();
		System.out.println("Done..");

	}

	}


