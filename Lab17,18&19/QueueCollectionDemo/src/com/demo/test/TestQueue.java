package com.demo.test;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestQueue {

	public static void main(String[] args) {
		
		// priority queue 
		Queue<Integer> q = new PriorityQueue<>();
		q.add(12);
		q.add(45);
		q.add(1);
		q.add(3);
		System.out.println(q);
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		
		// linked list
		Queue<Integer> llist = new LinkedList<>();
		llist.add(12);
		llist.add(78);
		llist.add(7);
		
		System.out.println(llist);
		while(!llist.isEmpty()) {
			System.out.println(llist.poll());
		}

	}

}
