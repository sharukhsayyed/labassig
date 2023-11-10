package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateManipulator {

	// convert string to date
	public LocalDate strToDate(String d) {
		LocalDate dt = LocalDate.parse(d,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		return dt;
	}
	
	//convert date to string
	public String dateToString(LocalDate d) {
		String dt = d.getDayOfMonth() + "-" + d.getMonthValue() + "-" + d.getYear();
		return dt;
	}
	
	// days between two dates
	public int daysBetween(LocalDate d1, LocalDate d2) {
		return Math.abs(d1.getDayOfYear() - d2.getDayOfYear());
	}
	
	

}
