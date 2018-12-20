package com.springMVC.RestFourthAssignment.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.springMVC.RestFourthAssignment.database.Database;
import com.springMVC.RestFourthAssignment.model.Employee;

public class EmployeeService {
	private Map<Long, Employee> employee=Database.getEmp();
	public EmployeeService() {
		employee.put(1L, new Employee("abc","java",1,10000));
		employee.put(2L, new Employee("def",".net",2,20000));
	}
	
	public List<Employee> getAllEmployee(){
		
		
		return new ArrayList<Employee>(employee.values());
		
	}
	public Employee addEmployee(Employee emp) {
	
		emp.setEmployeeId(employee.size() +1);
		employee.put( emp.getEmployeeId(),emp);
		return emp;
		
	}
	public Employee  getEmployee(long id) {
		return employee.get(id);
		
	}
	
	public Employee  removeMessage(long id) {
		return employee.remove(id);
		
	}
	}
	

