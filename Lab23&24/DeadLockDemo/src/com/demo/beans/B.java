package com.demo.beans;

public class B {
	public synchronized void d2(A a)
    {
        System.out.println(
            "Thread2 start execution of d2() method");
        try {
            Thread.sleep(200);
            
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("end of thread 2");
        
    }
}
