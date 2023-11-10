package com.demo.exceptions;

public class ZeroVendorEmployeeException extends RuntimeException{
	public ZeroVendorEmployeeException(String msg) {
		super(msg);
	}
}
