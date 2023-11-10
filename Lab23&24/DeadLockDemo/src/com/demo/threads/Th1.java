package com.demo.threads;

import com.demo.beans.A;
import com.demo.beans.B;

public class Th1 extends Thread{
	
	A a = new A();
	B b = new B();
	public void run() {
		a.d1(b);
		b.d2(a);
	}
}
