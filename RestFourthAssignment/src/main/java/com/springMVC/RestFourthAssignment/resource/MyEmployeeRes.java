package com.springMVC.RestFourthAssignment.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.springMVC.RestFourthAssignment.model.Employee;
import com.springMVC.RestFourthAssignment.service.EmployeeService;

@Path("/abc")
public class MyEmployeeRes {
	EmployeeService employeeService = null;

	public  MyEmployeeRes() {
		employeeService = new EmployeeService();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getAllEmp(){
		
			return employeeService.getAllEmployee();
			
		}
		
		

	
	@GET
	@Path("{EmployeeId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee test(@PathParam("employeeId") Long employeeId) {

		return employeeService.getEmployee(employeeId);
		

	}

}
