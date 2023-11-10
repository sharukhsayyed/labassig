package com.demo.test;

import java.time.LocalDate;

import com.demo.service.DateManipulator;

public class TestDateConversion {

	public static void main(String[] args) {
		DateManipulator dm = new DateManipulator();
		// date to string 
		System.out.println("Date to String : " + dm.dateToString(LocalDate.of(2013,12,05)));
		// string to date
		String d = "01/12/2013";
		
		System.out.println("String to date : " + dm.strToDate(d));
		// days between two dates
		System.out.println("days between " + LocalDate.of(2001, 02, 12) + " and " + LocalDate.of(2001, 02, 28));
		System.out.println(dm.daysBetween(LocalDate.of(2001, 02, 12), LocalDate.of(2001, 02, 28)));
		
	}

}
