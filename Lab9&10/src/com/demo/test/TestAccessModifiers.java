package com.demo.test;

import com.demo.beans.Person;

public class TestAccessModifiers extends Person{
	
	public TestAccessModifiers() {
		super();
		
	}

	public TestAccessModifiers(int id, String name, String email, String mob) {
		super(id, name, email, mob);
		
	}

	public static void main(String[] args){
		
		Person p = new Person(1,"ameya","a@gmail.com","784248");
		// public variables are accessible in different package
		System.out.println(p.mobile);
		// protected 
		TestAccessModifiers tas = new TestAccessModifiers(2,"ameya","a@gmail.com","784248");
		System.out.println(tas.email);
//		System.out.println(p.name);
	}

}
