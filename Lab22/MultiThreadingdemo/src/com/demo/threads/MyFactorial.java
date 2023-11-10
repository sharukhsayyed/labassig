package com.demo.threads;

import com.demo.services.Factorial;

public class MyFactorial implements Runnable{
	
	private Factorial ob;
	private int n;
	
	public MyFactorial(Factorial ob,int n) {
		this.ob = ob;
		this.n = n;
	}
	
	@Override
	public void run() {
		ob.factorial(n);
		
	}

}
