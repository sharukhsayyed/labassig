package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.exceptions.SalaryPositiveException;
import com.demo.exceptions.ZeroVendorEmployeeException;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImp;

public class TestEmpList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeService eservice = new EmployeeServiceImp(); 
		int choice=0;
		do {
			System.out.println("1. add new employee\n2. display all\n3. display by id\n4. delete by id\n5. sort by name \n6. close\nEnter the choice");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("1.Salaried\n2. Contract Employee\n3. Vendor ");
				int ch = sc.nextInt();
				try {
				eservice.addNewEmployee(ch);
				}catch(SalaryPositiveException|ZeroVendorEmployeeException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				List<Employee> elist = eservice.displayAll();
				elist.stream().forEach(System.out::println);
			
//				if(elist != null) {
//
//					elist.stream().forEach(System.out::println);
//				} else {
//					System.out.println("no employee found");
//				}
				break;
			case 3:
				System.out.println("Enter the id: ");
				int id = sc.nextInt();
				Employee emp = eservice.displayById(id);
				if(emp != null) {
					System.out.println(emp);
				} else {
					System.out.println("not found");
				}
				break;
			case 4:
				System.out.println("Enter the id:");
				id = sc.nextInt();
				
				boolean status = eservice.deleteById(id);
				if(status) {
					System.out.println("deleted successfully...");
				} else {
					System.out.println("not found");
				}
				break;
			case 5:
				List<Employee> e = eservice.sortByName();
				for(Employee e1:e) {
					System.out.println(e1);
				}
				break;
			case 6:
				System.out.println("Thank you for visiting...");
				sc.close();
				break;
			default:
				System.out.println("wrong choice");
			}
		}while(choice != 6);

	}

}
