package com.demo.test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.demo.beans.Employee;

public class TestReflection {

	public static void main(String[] args) {
		Employee e = new Employee();
		Class<? extends Employee> cls = e.getClass();
		
		
		// get private fields in Employee class
		try {
			Field[] f = cls.getDeclaredFields();
			for(Field f1 : f) {
				System.out.println(f1.getName());
			}
		} 
		catch (SecurityException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Method[] m = cls.getDeclaredMethods();
		
		for(Method m1 : m) {
			System.out.println(m1.getName());
		}
		
		try {
			Method meth = cls.getDeclaredMethod("method2");
			meth.invoke(e);
		} catch (IllegalAccessException|IllegalArgumentException|InvocationTargetException|NoSuchMethodException|SecurityException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		
		
		

	}

}
