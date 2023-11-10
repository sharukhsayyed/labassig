package com.demo.beans;

public class Employee {
	private int id;
	private String name;
	public Employee() {
		super();
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	public static void mystaticmethod() {
		System.out.println("in mystatic method");
		
	}
	private void method2() {
		System.out.println("in method2");
		
	}
	public void method1(int i) {
		System.out.println("in method1 "+i);
	}
}
