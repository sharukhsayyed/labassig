package com.demo.dao;

import java.io.IOException;
import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao {

	void save(Employee emp);

	List<Employee> findAll();

	Employee findById(int id);
	
	boolean deleteById(int id);

	List<Employee> sortByName();

	void readDataFromFile() throws IOException;

	List<Employee> displayAll();

	void writeDataInFile() throws IOException;

}
