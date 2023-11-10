package com.demo.test;

import java.util.Scanner;

import com.demo.services.Factorial;
import com.demo.services.PrimeNumber;
import com.demo.services.PrintTable;
import com.demo.threads.MyFactorial;
import com.demo.threads.MyPrimeThread;
import com.demo.threads.PrintTableThread;

public class TestMultithreading {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n = sc.nextInt();
		PrimeNumber p = new PrimeNumber();
		MyPrimeThread pth = new MyPrimeThread(p,n);
		pth.start();
//		System.out.println("prime number thread");
		
		
		
//		pth.notify();
		//
		Factorial f = new Factorial();
		
		// thread for factorial
		MyFactorial fth = new MyFactorial(f,n);
		Thread t = new Thread(fth);

		t.start();
		System.out.println(t.getState());
		
		PrintTable tab = new PrintTable();
		
		// thread for printing table
		PrintTableThread tth = new PrintTableThread(tab,n);
		tth.start();
		try {
			pth.join();
			tth.join();
			t.join();
			
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		PrimeNumber p1 = new PrimeNumber();
		MyPrimeThread th1 = new MyPrimeThread(p1,4);
		MyPrimeThread th2 = new MyPrimeThread(p1,5);
		th1.start();
		th2.start();
        th1.yield();  
        System.out.println(Thread.currentThread().getName() + " in control");  

		
		
		System.out.println("main method ends here");
		sc.close();
	}
	

}
