package com.springrestapi.springrestapi.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springrestapi.springrestapi.dao.EmployeeDao;
import com.springrestapi.springrestapi.entities.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao employeedao;

	public EmployeeServiceImpl() {
		
	}
	
	//this function would return the list variable that stores all the employee data in arraylist data type 
	//arrayList data type store multiple list in array .
	@Override
	public List<Employee> getEmployees() {
		return employeedao.findAll();
	}

	//this function would sent the specific employee details based on employee id 
	@Override
	public Employee getEmployee(long empId) {
	
		return employeedao.getOne(empId);
		
	};
	
	@Override
	public Employee addEmployee(Employee employee) {

		employeedao.save(employee);
		return employee;
	};
	
	@Override
	public Employee updateEmployee(Employee employee,long empId) {

		employeedao.save(employee);
		return employee;
	};
	
	@Override
	@Transactional
	public void deleteEmployee(long empId) {

		Employee emp = employeedao.getOne(empId);
		employeedao.delete(emp);
		
	};
}

//import java.util.ArrayList;
//@Service
//public class EmployeeServiceImpl implements EmployeeService {
//	
//	@Autowired
//	private EmployeeDao employeedao;
//
//	//creating a temporary list to store data
//	List<Employee> list;
//	public EmployeeServiceImpl() {
//		list= new  ArrayList<>();
//		list.add(new Employee(123,"ram",2000,32,"jbp"));
//		list.add(new Employee(1223,"ram2",2002,22,"jbp"));
//	}
//	
//	//this function would return the list variable that stores all the employee data in arraylist data type 
//	//arrayList data type store multiple list in array .
//	@Override
//	public List<Employee> getEmployees() {
//		return list;
//	}
//
//	//this function would sent the specific employee details based on employee id 
//	@Override
//	public Employee getEmployee(long empId) {
//		//here we created an null object of name e of class Employee from entities
//		Employee e=null;
//		//traverse the list
//		for(Employee emp: list) {
//			if(emp.getEmpId()==empId) {
//				checking if the employee is the desired one.
//				e=emp;
//				break;
//			}
//		}
//		
//	};
//	
//	@Override
//	public Employee addEmployee(Employee employee) {
//		list.add(employee);
//		
//	};
//	
//	@Override
//	public Employee updateEmployee(Employee employee,long empId) {
//		Employee c=null;
//		//traverse the list
//		for(Employee emp: list) {
//			if(emp.getEmpId()==empId) {
////				//checking if the employee is the desired one.
////							
//				emp.setEmpId(empId);
//				emp.setEmpName(employee.getEmpName());
//				emp.setEmpSalary(employee.getEmpSalary());
//				emp.setEmpAge(employee.getEmpAge());
//				emp.setEmpCity(employee.getEmpCity());
//				break;
//			}
//		}
//		
//	};
//	
//	
//	public void deleteEmployee(long empId) {
////		//traverse the list
//		for(Employee emp: list) {
//			if(emp.getEmpId()==empId) {
//				list.remove(emp);
//				return 1;
//			}
//		}
//		return 0;
//		
//	};
//}
//
