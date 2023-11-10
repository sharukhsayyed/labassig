package com.demo.test;

public class AnonymousFunction {

	public static void main(String[] args) {
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("In thread 1");
				
			}
		};
		
		Runnable r2 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("In thread 2");
				
			}
		};
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();

	}

}
