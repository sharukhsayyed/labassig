package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao {

	void save(Employee emp);

	List<Employee> findAll();

	Employee findById(int id);
	
	boolean deleteById(int id);

	List<Employee> sortByName();

}
