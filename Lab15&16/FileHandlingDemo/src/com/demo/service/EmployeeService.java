package com.demo.service;

import java.io.IOException;
import java.util.List;

import com.demo.beans.Employee;
import com.demo.exceptions.SalaryPositiveException;
import com.demo.exceptions.ZeroVendorEmployeeException;

public interface EmployeeService {

	public void readFromFile() throws IOException;
	
	void addNewEmployee(int ch) throws SalaryPositiveException,ZeroVendorEmployeeException;

	List<Employee> displayAll();

	Employee displayById(int id);

	boolean deleteById(int id);

	List<Employee> sortByName();
	
	public void writeInFile() throws IOException ;
}
