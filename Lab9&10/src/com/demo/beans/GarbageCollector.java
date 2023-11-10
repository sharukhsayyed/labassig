package com.demo.beans;

public class GarbageCollector {
	public void finalize() throws Throwable {
		
		GarbageCollector g = new GarbageCollector();
		g=null;
		try {
			System.gc();
			System.out.println("finalize method");
		} catch(Throwable e) {
			throw e;
		} finally {
			System.out.println("In finally block");
			super.finalize();
		}
		
	}
}
