package com.demo.beans;

import java.time.LocalDate;

public class Vendor extends Employee {
	
	private int noOfEmp;
	private double amt;
	public Vendor() {
		super();
	}
	
	public Vendor(int id, String name, String mob, String email, String dept, String desg, LocalDate dateofJoining,int noOfEmp,double amt) {
		super(id, name, mob, email, dept, desg, dateofJoining);
		this.noOfEmp=noOfEmp;
		this.amt=amt;
	}

	public int getNoOfEmp() {
		return noOfEmp;
	}

	public void setNoOfEmp(int noOfEmp) {
		this.noOfEmp = noOfEmp;
	}

	public double getAmt() {
		return amt;
	}

	public void setAmt(double amt) {
		this.amt = amt;
	}

	@Override
	public String toString() {
		return super.toString()+"Vendor [noOfEmp=" + noOfEmp + ", amt=" + amt + "]";
	}
	
	
	
}
