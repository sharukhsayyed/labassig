package com.demo.services;

public class PrintTable {
	public void displayTable(int n) {
		for(int i=1; i<=10; i++) {
			System.out.println(n + " * " + i + " = " + (n*i));
		}
	}
}
