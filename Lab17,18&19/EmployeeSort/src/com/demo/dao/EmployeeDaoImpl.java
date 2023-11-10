package com.demo.dao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	static List<Employee> elist;
	
	static {
		elist = new ArrayList<>();
		
		elist.add(new Employee(1,"Ameya","784154"));
		elist.add(new Employee(2,"Saurabh","7842151"));
		
	}
	
	@Override
	public void save(Employee e) {
		elist.add(e);
	}

	@Override
	public List<Employee> findAll() {
		return elist;
	}

	@Override
	public List<Employee> sortById() {
		List<Employee> temp = new ArrayList<>();
		for(Employee e : elist) {
			temp.add(e);
		}
		temp.sort(null);
		return temp;
	}

	@Override
	public List<Employee> sortByName() {
		Comparator<Employee> nm = (o1,o2) ->{
			return o1.getName().compareTo(o2.getName());
		};
		List<Employee> temp = new ArrayList<>();
		for(Employee e : elist) {
			temp.add(e);
		}
		temp.sort(nm);
		return temp;
	}

}
