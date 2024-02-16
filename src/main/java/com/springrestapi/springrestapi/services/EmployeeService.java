package com.springrestapi.springrestapi.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springrestapi.springrestapi.entities.Employee;

// interface defines a set of methods that a class implementing the interface must implement. 
//An interface can be seen as a blueprint for classes, specifying the methods that classes need to implement without providing any implementation details.
@Service
//this annotation tells that this is service layer.
public interface EmployeeService {
	
	//Coupling refers to the level of dependency between two or more components in a system
	//    Tight Coupling: Components are highly dependent on each other, and any change in one component requires corresponding changes in other components.
		//the use of new keyword inside a class contributes to tight coupling because it creates a direct dependency on a specific class or implementation.
    //	  Loose Coupling: Components are less dependent on each other, allowing them to work independently and be easily replaced or modified without affecting other components.
			//The use of this keyword or dependency injection contributes to loose coupling by allowing dependencies to be supplied from outside because . It refers to the current instance of the class.
	//here loose coupling is implement to improve the coupling because loose coupling is more flexible and testable.
	public List<Employee> getEmployees();

	public Employee getEmployee(long empId); 
	
	public Employee addEmployee(Employee employee);
	
	public Employee updateEmployee(Employee employee, long empId);
	
	public void deleteEmployee(long empId);
	
	
	// runtime polymorphism 
}
