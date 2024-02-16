package com.springrestapi.springrestapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springrestapi.springrestapi.services.EmployeeService;
//import com.springrestapi.springrestapi.entities.Employee ;

@SpringBootApplication
//creating this application as console based application
public class SpringrestapiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringrestapiApplication.class, args);
	}
	
	@Autowired
	EmployeeService employeeService;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Employee employee = new Employee (1,"a",200,23,"jbp");
//		employeeService.addEmployee(employee);
	}
	
	

}
