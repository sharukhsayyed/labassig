package com.demo.test;

import com.demo.threads.Th1;

public class TestDeadlock {
	public static void main(String[] args) {
		Th1 t = new Th1();
		t.start();

	}
}
