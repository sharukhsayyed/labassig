package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao {

	void save(Employee e);

	List<Employee> findAll();

	List<Employee> sortById();

	List<Employee> sortByName();

}
