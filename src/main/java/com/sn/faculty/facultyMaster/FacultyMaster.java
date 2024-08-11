package com.sn.faculty.facultyMaster;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class FacultyMaster {
	@Id
	private int fid;
	private String salutation;
	@Column(name="first_name")
	private String fName;
	@Column(name="last_name")
	private String lName;
	@Column(name="highest_qualification")
	private String hQualification;
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getSalutation() {
		return salutation;
	}
	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String gethQualification() {
		return hQualification;
	}
	public void sethQualification(String hQualification) {
		this.hQualification = hQualification;
	}
}
