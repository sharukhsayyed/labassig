package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {

	void addNewEmployee();

	List<Employee> displayAll();

	List<Employee> sortById();

	List<Employee> sortByName();
	
}
