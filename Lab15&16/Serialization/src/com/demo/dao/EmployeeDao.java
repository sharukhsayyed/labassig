package com.demo.dao;

import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import com.demo.beans.Employee;

public interface EmployeeDao {
	
	void readDataFromFile() throws IOException,EOFException,ClassNotFoundException;
	void save(Employee e);
	
	List<Employee> findAll();
	Employee findById(int id);
	boolean deleteById(int id);

	List<Employee> sortByName();

	boolean updateSalById(int id, double sal);

	List<Employee> sortBySal();
	void writeDataInFile() throws IOException;
	
}
