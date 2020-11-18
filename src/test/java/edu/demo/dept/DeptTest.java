package edu.demo.dept;

import org.junit.Test;

import edu.demo.dao.DeptDao;
import edu.demo.pojo.TDept;

public class DeptTest {

	//@Test
	public void save() {
		DeptDao deptDao = new DeptDao();
		TDept dept = new TDept();
		dept.setDeptName("研发部3");
		dept.setDeptStatus(1);
		
		deptDao.save(dept);
	}
	
	//@Test
	public void get() {
		DeptDao deptDao = new DeptDao();
		TDept dept = deptDao.get(1);
		
		System.out.println(dept.toString());
	}
	
	//@Test
	public void delete() {
		DeptDao deptDao = new DeptDao();
		deptDao.delete(1);
	}
	
	@Test
	public void update() {
		DeptDao deptDao = new DeptDao();
		TDept dept = deptDao.get(4);
		dept.setDeptName("商务部");
		deptDao.update(dept);
		dept = deptDao.get(4);
		System.out.println(dept.toString());
	}
	
}
