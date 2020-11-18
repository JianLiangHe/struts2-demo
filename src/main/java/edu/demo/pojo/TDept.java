package edu.demo.pojo;

import java.io.Serializable;

public class TDept implements Serializable {

	private int deptId;
	
	private String deptName;
	
	private String deptCreatetime;
	
	private int deptStatus; // 状态 0:禁用 1:启用

	public TDept() {
		super();
	}

	public TDept(int deptId, String deptName, String deptCreatetime, int deptStatus) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptCreatetime = deptCreatetime;
		this.deptStatus = deptStatus;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptCreatetime() {
		return deptCreatetime;
	}

	public void setDeptCreatetime(String deptCreatetime) {
		this.deptCreatetime = deptCreatetime;
	}

	public int getDeptStatus() {
		return deptStatus;
	}

	public void setDeptStatus(int deptStatus) {
		this.deptStatus = deptStatus;
	}

	@Override
	public String toString() {
		return "TDept [deptId=" + deptId + ", deptName=" + deptName + ", deptCreatetime=" + deptCreatetime
				+ ", deptStatus=" + deptStatus + "]";
	}
	
}
