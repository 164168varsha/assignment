package com.springMVC.RestFourthAssignment.resource;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.springMVC.RestFourthAssignment.model.Employee;
import com.springMVC.RestFourthAssignment.service.EmployeeService;

@Path("/emp")
public class EmployeeResource {
	/*EmployeeService employeeService = null;

	public EmployeeResource() {
		employeeService = new EmployeeService();
	}
*/
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getEmployee() {
		System.out.println("hii");
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee("Onkar", "Manager", 10, 1000));
		
		return list;

	}
	
	/*@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String msg() {
		return "Hello";
	}*/

	/*@GET
	@Path("{EmployeeId}")
	@Produces(MediaType.APPLICATION_JSON)
	public String test(@PathParam("employeeId") Long employeeId) {

		employeeService.getEmployee(employeeId);
		return "test";

	}
*/
}
