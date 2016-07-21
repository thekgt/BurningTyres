package com.burningtyres.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class DBUtils {
	public static SessionFactory sessionFactory;
	
	static {
		Configuration configuration = new Configuration().configure();
		
	}
}
