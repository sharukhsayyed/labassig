package com.demo.services;

public class Factorial {
	public void factorial(int n) {
		int fact = 1;
		for(int i=2;i<=n;i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of "+ n + ":"+fact);
	}
}
