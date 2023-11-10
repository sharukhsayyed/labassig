package com.demo.service;

import java.util.List; 

import com.demo.beans.Employee;
import com.demo.exceptions.SalaryPositiveException;

public interface EmployeeService {

	void addNewEmployee(int ch) throws SalaryPositiveException;

	List<Employee> displayAll();

	Employee displayById(int id);

	boolean deleteById(int id);

	List<Employee> sortByName();
	
}
