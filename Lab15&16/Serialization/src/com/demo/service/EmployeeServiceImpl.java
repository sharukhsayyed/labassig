package com.demo.service;

import java.io.EOFException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.ContractEmp;
import com.demo.beans.Employee;
import com.demo.beans.SalariedEmp;
import com.demo.beans.Vendor;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService{

private EmployeeDao edao;
	
	public EmployeeServiceImpl() {
		edao = new EmployeeDaoImpl();
	}
	@Override
	public void addNewEmployee(int ch) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id:");
		int id = sc.nextInt();
		System.out.println("Enter name:");
		String nm = sc.next();
		System.out.println("Enter mobile number: ");
		String mob = sc.next();
		System.out.println("Enter the email ID: ");
		String email = sc.next();
		System.out.println("Enter the department: ");
		String dept = sc.next();
		System.out.println("Enter the designation: ");
		String desg = sc.next();
		System.out.println("Enter the date joining: (dd/mm/yyyy)");
		String dt = sc.next();
		LocalDate ldt = LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Employee emp = null;
		switch(ch) {
		case 1:
			System.out.println("Enter the salary:");
			double sal = sc.nextDouble();
			System.out.println("Enter the bonus:");
			double bon = sc.nextDouble();
			emp = new SalariedEmp(id,nm,mob,email,dept,desg,ldt,sal,bon);
			break;
		case 2:
			System.out.println("Enter the hrs:");
			int hrs = sc.nextInt();
			System.out.println("Enter the charges: ");
			double charges = sc.nextDouble();
			emp = new ContractEmp(id,nm,mob,email,dept,desg,ldt,hrs,charges);
			break;
		case 3:
			System.out.println("Enter the no. of employees:");
			int noOfEmp = sc.nextInt();
			System.out.println("Enter the amount:");
			double amt = sc.nextDouble();
			emp = new Vendor(id,nm,mob,email,dept,desg,ldt,noOfEmp,amt);
			break;
		}
		
		edao.save(emp);
		
	}
	@Override
	public List<Employee> displayAll() {
		List<Employee> elist=edao.findAll();
		return elist;
	}
	@Override
	public Employee displayById(int id) {
		Employee e = edao.findById(id);
		return e;
	}
	@Override
	public boolean deleteById(int id) {
		boolean status = edao.deleteById(id);
		return status;
		
	}
	@Override
	public List<Employee> sortByName() {
		return edao.sortByName();
	}
	@Override
	public boolean modifySalById(int id, double sal) {
		return edao.updateSalById(id, sal);
	}
	@Override
	public List<Employee> sortBySal() {
		return edao.sortBySal();
	}
	@Override
	public void readFromFile() throws IOException, EOFException, ClassNotFoundException {
		edao.readDataFromFile();
		
	}
	@Override
	public void writeInFile() throws IOException, EOFException, ClassNotFoundException {
		edao.writeDataInFile();
		
	}

}
