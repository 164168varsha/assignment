package com.springMVC.RestFourthAssignment.model;

public class Employee {
	public long employeeId;
	public int employeeDepartment, employeeSalary;
	public String employeeName, employeeDesignation;
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public int getEmployeeDepartment() {
		return employeeDepartment;
	}

	public void setEmployeeDepartment(int employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}

	public int getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	public Employee(String employeeName, String employeeDesignation, int employeeDepartment, int employeeSalary) {
		super();
		this.employeeDepartment = employeeDepartment;
		this.employeeSalary = employeeSalary;
		this.employeeName = employeeName;
		this.employeeDesignation = employeeDesignation;
	}

}
