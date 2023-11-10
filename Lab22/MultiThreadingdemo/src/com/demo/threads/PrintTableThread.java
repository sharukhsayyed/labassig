package com.demo.threads;

import com.demo.services.PrintTable;

public class PrintTableThread extends Thread{
	private int n;
	private PrintTable ob;
	public PrintTableThread(PrintTable ob,int n){
		this.ob = ob;
		this.n = n;
	}
	public void run() {
		ob.displayTable(n);
	}
}
