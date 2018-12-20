package com.springMVC.RestFourthAssignment.database;

import java.util.HashMap;
import java.util.Map;

import com.springMVC.RestFourthAssignment.model.Employee;


public class Database {
	private static Map<Long , Employee> employee=new HashMap<>();
	
	
	public static Map<Long, Employee> getEmp() {
		return employee;
	}

}
