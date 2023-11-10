package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestEmployee {
	public static void main(String[] args) {
		int ch = 0;
		Scanner sc = new Scanner(System.in);
		EmployeeService eservice = new EmployeeServiceImpl();
		do {
			System.out.println("1. Add Employee\n2. Display all\n3. sort by id\n4. sort by name\n5. close\nEnter choice:");
			ch = sc.nextInt();
			
			switch(ch) {
			case 1: 
				eservice.addNewEmployee();
				break;
			case 2:
				List<Employee> elist = eservice.displayAll();
				elist.stream().forEach(System.out::println);
				break;
			case 3:
				elist = eservice.sortById();
				elist.stream().forEach(System.out::println);
				break;
			case 4:
				elist = eservice.sortByName();
				elist.stream().forEach(System.out::println);
				break;
			case 5:
				System.out.println("Thank you for visiting...");
				sc.close();
				break;
			}
		}while(ch != 5);
	}
}
