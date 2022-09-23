package com.beans;

public class Registration {
	private int empId;
	private String empName;
	
	
	public Registration() {
		super();
	}

	public Registration(int empId2, String empName) {
		this.empId = empId2;
		this.empName = empName;
		
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	

	@Override
	public String toString() {
		return empName;
	}
	
}
