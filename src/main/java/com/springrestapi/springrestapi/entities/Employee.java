package com.springrestapi.springrestapi.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.Table;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Table(name="employee")
public class Employee {
	@Id
	@Column(name="empId")
	private long empId;
	
	@Column(name="empName")
	private String empName;
	
	@Column(name="empSalary")
	private Integer empSalary;
	
	@Column(name="empAge")
	private Integer empAge;
	
	@Column(name="empCity")
	private String empCity;
	
	//constructor using fields
	//Constructors are used to create instances of a class and initialize its fields. In the Employee class, a constructor can be used to set the initial values of the employee's attributes, such as name, age, salary, etc.
	public Employee(long empId, String empName, int empSalary, int empAge, String empCity) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empAge = empAge;
		this.empCity = empCity;
	}
	
	//constructor from superclass
	//If the Employee class extends another class (a superclass), constructors in the superclass can be used to initialize the inherited fields or perform any necessary initialization logic.
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// getter and setter 
	//Getters and setters, also known as accessors and mutators, respectively, are methods used to retrieve and modify the values of the class's fields.
	
	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Integer getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	public Integer getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public String getEmpCity() {
		return empCity;
	}

	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}

	// toString function
	//The toString() method is a predefined method in the Object class, which is the root class for all Java classes
	//When you use System.out.println() or other console output methods to print an object, it internally calls the object's toString() method to obtain the string representation
	//By overriding toString() in your classes, you can ensure that the printed output provides meaningful information about the object's state.
	//this means that when we call this function we will get the specified info. about the object of employee class.
	//annotation is used to ensure that a method is correctly overriding a method from a superclass or implementing an interface.
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empAge=" + empAge
				+ ", empCity=" + empCity + "]";
	}
	
	

}

