package com.demo.beans;

import java.time.LocalDate;

public class ContractEmp extends Employee {
	private int hrs;
	private double charges;
	public ContractEmp() {
		super();
	}
	public ContractEmp(int id, String name, String mob, String email, String dept, String desg,
			LocalDate dateofJoining,int hrs,double charges) {
		super(id, name, mob, email, dept, desg, dateofJoining);
		this.hrs=hrs;
		this.charges=charges;
	}
	public int getHrs() {
		return hrs;
	}
	public void setHrs(int hrs) {
		this.hrs = hrs;
	}
	public double getCharges() {
		return charges;
	}
	public void setCharges(double charges) {
		this.charges = charges;
	}
	@Override
	public String toString() {
		return super.toString()+"ContractEmp [hrs=" + hrs + ", charges=" + charges + "]";
	}
	
	
}
