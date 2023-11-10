package com.demo.beans;

public class A {
    public synchronized void d1(B b)
    {
        System.out.println(
            "Thread1 start execution of d1() method");
 
        try {
 
            Thread.sleep(200);
           
        }
 
        
        catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("end of thread 1");
    }

}
