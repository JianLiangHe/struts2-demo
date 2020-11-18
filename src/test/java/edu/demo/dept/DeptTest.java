package edu.demo.dept;

import org.junit.Test;

import edu.demo.dao.DeptDao;
import edu.demo.pojo.TDept;

public class DeptTest {

	@Test
	public void save() {
		DeptDao deptDao = new DeptDao();
		TDept dept = new TDept();
		dept.setDeptName("研发部");
		dept.setDeptStatus(1);
		
		deptDao.save(dept);
	}
	
}
