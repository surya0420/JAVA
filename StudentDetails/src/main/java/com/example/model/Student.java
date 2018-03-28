package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	private int studentId;
	private String name;
	private String mobileNumber;
	private String fathersName;
	private String branch;
	private String collageName;

	private Student() {
		super();
	}

	public Student(int studentId, String name, String mobileNumber, String fathersName, String branch,
			String collageName) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.fathersName = fathersName;
		this.branch = branch;
		this.collageName = collageName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getFathersName() {
		return fathersName;
	}

	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getCollageName() {
		return collageName;
	}

	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}

}
