package com.demo.service;

import java.io.EOFException;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

import com.demo.beans.Employee;
 
public interface EmployeeService {

	void readFromFile() throws IOException,EOFException,ClassNotFoundException;
	
	void addNewEmployee(int ch);

	Collection<Employee> displayAll();

	Employee displayById(int id);

	boolean deleteById(int id);

	List<Employee> sortByName();

	boolean modifySalById(int id,double sal);

	List<Employee> sortBySal();
	
	void writeInFile() throws IOException,EOFException,ClassNotFoundException;
	
}
