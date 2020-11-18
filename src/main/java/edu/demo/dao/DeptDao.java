package edu.demo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import edu.demo.pojo.TDept;
import edu.demo.util.HibernateUtils;

public class DeptDao extends HibernateUtils {

	public void save(TDept dept) {
		SessionFactory sessionFactory = getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		
		// 开启事务
		Transaction transaction = session.beginTransaction(); 
		session.save(dept);
		
		// 提交事务
		transaction.commit();
		
		session.close();
		sessionFactory.close();
	}
	
}
