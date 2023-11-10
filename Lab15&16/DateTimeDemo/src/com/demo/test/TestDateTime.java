package com.demo.test;

import java.sql.Time;
import java.util.Calendar;
import java.util.Date;

public class TestDateTime {

	public static void main(String[] args) {
		Date d = new Date(2006,01,21);
		// checks whether above date is after given date
		System.out.println(d.after(new Date(2006,12,13)));
		// displays date
		System.out.println(d.getDay());
		Time t = new Time(12,23,55);
		// returns hours
		System.out.println(t.getHours());

		Calendar c = Calendar.getInstance(); 
		System.out.println(c.DAY_OF_MONTH);

	}

}
