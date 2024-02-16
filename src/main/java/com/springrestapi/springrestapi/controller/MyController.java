package com.springrestapi.springrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrestapi.springrestapi.entities.Employee;
import com.springrestapi.springrestapi.services.EmployeeService;

@RestController
public class MyController {

	//this is an example
	//@GetMapping("/home")
	//public String home() {
	//  	return "this is home page";
	// }
	
	
	@Autowired
	private EmployeeService EmployeeServiceObj;
	
	// get the employees
	@GetMapping("/employee")
	public List<Employee> getEmployees(){
		return this.EmployeeServiceObj.getEmployees();
	}
	
	//get particular employee
	@GetMapping("/employee/{empId}")
	//The @PathVariable annotation in Spring Boot is used to bind a path variable value from a URL to a method parameter in a controller. 
	public Employee getEmployee(@PathVariable String empId) {
		return this.EmployeeServiceObj.getEmployee(Long.parseLong(empId));
	}
	
	//add employee
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return this.EmployeeServiceObj.addEmployee(employee);
	}
	
	@PutMapping("/employee/{empId}")
	public Employee updateEmployee(@RequestBody Employee employee,@PathVariable String empId) {
		return this.EmployeeServiceObj.updateEmployee(employee,Long.parseLong(empId));
	}
	
	@DeleteMapping("/employee/{empId}")
	public String deleteEmployee(@PathVariable String empId) {
			this.EmployeeServiceObj.deleteEmployee(Long.parseLong(empId));
			return "this entity is delete successfully";
		
	}
	
	
}
