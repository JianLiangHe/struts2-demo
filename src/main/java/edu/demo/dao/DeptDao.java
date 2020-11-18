package edu.demo.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.demo.pojo.TDept;
import edu.demo.util.HibernateUtils;

public class DeptDao extends HibernateUtils {

	public void save(TDept dept) {
		Session session = super.getSession();
		
		// 开启事务
		Transaction transaction = session.beginTransaction(); 
		session.save(dept);
		
		// 提交事务
		transaction.commit();
		super.closeSession();
	}
	
	public TDept get(int id) {
		Session session = super.getSession();
		
		// 开启事务
		Transaction transaction = session.beginTransaction();
		TDept dept = session.get(TDept.class, id);

		// 提交事务
		transaction.commit();
		super.closeSession();
		return dept;
	}
	
	public void delete(int id) {
		Session session = super.getSession();
		TDept dept = new TDept();
		dept.setDeptId(id);
		// 开启事务
		Transaction transaction = session.beginTransaction();
		session.delete(dept);
		
		// 提交事务
		transaction.commit();
		super.closeSession();
		System.out.println("删除成功");
	}
	
	public void update(TDept dept) {
		Session session = super.getSession();
		// 开启事务
		Transaction transaction = session.beginTransaction();
		session.update(dept);
		
		// 提交事务
		transaction.commit();
		super.closeSession();
		System.out.println("更新成功");
	}
	
}
