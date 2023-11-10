package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeDao edao;
	
	public EmployeeServiceImpl() {
		edao = new EmployeeDaoImpl();
	}
	@Override
	public void addNewEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id: ");
		int id = sc.nextInt();
		System.out.println("Enter name: ");
		String nm = sc.next();
		System.out.println("Enter mobile number: ");
		String mob = sc.next();
		
		Employee e = new Employee(id,nm,mob);
		edao.save(e);
		
	}
	@Override
	public List<Employee> displayAll() {
		return edao.findAll();
	}
	@Override
	public List<Employee> sortById() {
		return edao.sortById();
	}
	@Override
	public List<Employee> sortByName() {
		return edao.sortByName();
	}

}
