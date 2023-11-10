package com.demo.beans;

import java.time.LocalDate;

public class Employee extends Person{
	private String dept;
	private String desg;
	private LocalDate dateofJoining;
	public Employee() {
		super();
	}
	public Employee(int id,String name,String mob,String email,String dept, String desg, LocalDate dateofJoining) {
		super(id,name,mob,email);
		this.dept = dept;
		this.desg = desg;
		this.dateofJoining = dateofJoining;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public LocalDate getDateofJoining() {
		return dateofJoining;
	}
	public void setDateofJoining(LocalDate dateofJoining) {
		this.dateofJoining = dateofJoining;
	}
	@Override
	public String toString() {
		return super.toString()+"Employee [dept=" + dept + ", desg=" + desg + ", dateofJoining=" + dateofJoining + "]";
	}
	
	
}
