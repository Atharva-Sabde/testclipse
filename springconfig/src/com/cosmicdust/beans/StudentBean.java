package com.cosmicdust.beans;

public class StudentBean {
	private String studentName;
	private int rollNo;
	private String deptName;

	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String student) {
		this.studentName = student;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollno) {
		this.rollNo = rollno;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String dept) {
		this.deptName = dept;
	}

	public void getDetails() {
		System.out.println(this.deptName); 
		System.out.println(this.rollNo); 
		System.out.println(this.studentName); 
	}
}
