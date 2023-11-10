package com.demo.test;

import java.util.ArrayList;
import java.util.List;

public class TestListOperations {

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();
		
		// insertion in list
		arr.add(12);
		arr.add(14);
		arr.add(16);
		arr.add(18);
		arr.add(11);
		System.out.println(arr);
		
		// insert at index
		arr.add(2,15);
		System.out.println(arr);
		
		// delete value from list
		// at index
		arr.remove(0);
		System.out.println(arr);
		
		// search value
		System.out.println("value at index: 0 -->" +  arr.get(0));
		
		// iterate using foreach
		for(Integer i : arr) {
			System.out.println(i);
		}
		
		// sorts the list arr
		arr.sort(null);
		System.out.println("Sorted list: ");
		System.out.println(arr);
		
	}

}
