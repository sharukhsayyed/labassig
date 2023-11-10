package com.demo.test;

import java.awt.geom.Ellipse2D;
import java.io.IOException;
import java.util.Collection;

import java.util.Scanner;
import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestSerialisation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		EmployeeService eservice = new EmployeeServiceImpl();
		try {
			eservice.readFromFile();
		} catch (ClassNotFoundException | IOException e1) {
			System.out.println(e1.getMessage());
		}
		do {
			System.out.println("1. add new Employee\n2. modify salary\n3. delete by ID\n4. display All\n5. display by ID\n6. sort by name\n7. sort by sal\n8. close");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("1. Salaried Employee\n2. Contract Employee\n3. Vendor");
				int ch = sc.nextInt();
				eservice.addNewEmployee(ch); 
				break;
			case 2:
				System.out.println("Enter the id:");
				int id = sc.nextInt();
				System.out.println("Enter the salary to update: ");
				double sal = sc.nextDouble();
				boolean status = eservice.modifySalById(id,sal);
				
				if(status) {
					System.out.println("modification successful");
				} else {
					System.out.println("not found");
				}
				break;
			case 3:
				System.out.println("Enter the id:");
				id = sc.nextInt();
				status = eservice.deleteById(id);
				if(status) {
					System.out.println("deleted successfully");
				} else {
					System.out.println("not found");
				}
				break;
			case 4:
				Collection<Employee> elist = eservice.displayAll();
				if(elist != null) {
					elist.stream().forEach(System.out::println);
				}
				break; 
			case 5:
				System.out.println("Enter the id:");
				id = sc.nextInt();
				Employee e = eservice.displayById(id);
				if(e != null) {
					System.out.println(e);					
				} else {
					System.out.println("not found");
				}
				break;
			case 6:
				elist = eservice.sortByName();
				if(elist == null) {
					System.out.println("Employees do not exists");
				}
				else {
					elist.stream().forEach(System.out::println);
				}
				break;
			case 7:
				elist = eservice.sortBySal();
				elist.stream().forEach(System.out::println);
				break;
			case 8:
				try {
					eservice.writeInFile();
				} catch (ClassNotFoundException | IOException e2) {
					System.out.println(e2.getMessage());
				}
				System.out.println("Thank you for visiting...");
				sc.close();
				break;
			}
			
		} while(choice != 8);

	}

}
