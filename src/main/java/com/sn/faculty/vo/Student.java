package com.sn.faculty.vo;

public class Student {
	private String fName, lName, dept, dob;
	private int sid;
	
	public void setFName(String fName) {
		this.fName = fName;
	}
	public String getFName() {
		return fName;
	}
	
	public void setLName(String lName) {
		this.lName = lName;
	}
	public String getLName() {
		return lName;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDept() {
		return dept;
	}
	
	public void setDOB(String dob) {
		this.dob = dob;
	}
	public String getDOB() {
		return dob;
	}
	
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getSid() {
		return sid;
	}
}
