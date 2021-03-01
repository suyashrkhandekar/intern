package com.intern.util;



import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

import com.intern.jerseyrest.*;

public class HibernateUtil {
	
	
	private static StandardServiceRegistry registry;
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory()
	{
		Map<String,Object> settings = new HashMap<String, Object>();
		settings.put(Environment.DRIVER,"com.mysql.jdbc.Driver");
		settings.put(Environment.URL, "jdbc:mysql://localhost:3306/student-project");
		settings.put(Environment.USER, "root");
		settings.put(Environment.PASS, "root");
		settings.put(Environment.DIALECT,"org.hibernate.dialect.MySQLDialect");
		settings.put(Environment.SHOW_SQL, "true");
		settings.put(Environment.HBM2DDL_AUTO, "update");
		
		registry= new StandardServiceRegistryBuilder().applySettings(settings).build();
		MetadataSources mds= new MetadataSources(registry);
		mds.addAnnotatedClass(Student.class);
		Metadata md = mds.getMetadataBuilder().build();
		sessionFactory=md.getSessionFactoryBuilder().build();
		
		
		return sessionFactory;
	}

}

