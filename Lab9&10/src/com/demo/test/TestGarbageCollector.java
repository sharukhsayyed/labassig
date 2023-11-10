package com.demo.test;

import com.demo.beans.GarbageCollector;

public class TestGarbageCollector {

	public static void main(String[] args) throws Throwable {
		GarbageCollector g = new GarbageCollector();
		g.finalize();
	}

}
