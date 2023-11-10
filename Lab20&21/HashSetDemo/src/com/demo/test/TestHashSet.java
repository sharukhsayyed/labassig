package com.demo.test;

import java.util.HashSet;
import java.util.Set;

import com.demo.beans.Employee;

public class TestHashSet {

	public static void main(String[] args) {
		Set<Employee> eset = new HashSet<>();
		
		eset.add(new Employee(1,"Ameya","784544"));
		eset.add(new Employee(2,"Rohit","789844"));
		eset.add(new Employee(2,"Rohan","778844"));
		System.out.println(eset);

	}

}
