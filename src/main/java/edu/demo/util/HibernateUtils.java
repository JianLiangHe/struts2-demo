package edu.demo.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * hibernate工具类
 * @author Administrator
 *
 */
public class HibernateUtils {

	private static SessionFactory sessionFactory;
	
	private static Configuration configuration = new Configuration();
	
	private static StandardServiceRegistry serviceRegistry;
	
	static {
        try {
            configuration.configure("hibernate.cfg.xml");
            serviceRegistry = new StandardServiceRegistryBuilder().configure().build();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        } catch (Exception e) {
            System.err.println("%%%% Error Creating SessionFactory %%%%");
            e.printStackTrace();
        }
    }
	
	/**
     * 获取session，所有的hibernate操作均基于session进行
     * @return
     */
    public static Session getSession(){
        return sessionFactory.openSession();
    }
    
    public static SessionFactory getSessionFactory() {
    	return sessionFactory;
    }
	
}
