package com.demo.test;

public class TestThreadusingLambdaFunction {

	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			System.out.println("Thread 1 running");
		});
		
		t1.start();
	}

}
