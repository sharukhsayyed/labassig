package com.demo.threads;

import com.demo.services.PrimeNumber;

public class MyPrimeThread extends Thread{
	private PrimeNumber ob;
	private int n;
	public MyPrimeThread(PrimeNumber ob,int n) {
		this.ob = ob;
		this.n = n;
	}
	
	public void run() {
		if(ob.checkPrime(n)) {
			System.out.println("prime number");
		}else {
			System.out.println("Not a prime");
		}	  
        System.out.println(Thread.currentThread().getName() + " in control");
	}
}
