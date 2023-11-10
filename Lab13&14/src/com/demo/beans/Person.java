package com.demo.beans;

public class Person implements Comparable<Person> {
	private int id;
	private String name;
	private String email;
	private String mobile;
	
	public Person() {
		
	}
	
	public Person(int id, String name, String email, String mobile) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", email=" + email + ", mobile=" + mobile + "]";
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
//	a.equals(d)
	@Override
	public boolean equals(Object ob) {
		if(this.id == ((Employee)ob).getId()) {
			return true;
		}
		return false;
	}

	@Override
	public int compareTo(Person o) {
		return this.name.compareTo(o.name);
	}
	
}
