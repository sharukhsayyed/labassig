package com.demo.dao;

import java.io.EOFException; 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.demo.beans.ContractEmp;
import com.demo.beans.Employee;
import com.demo.beans.SalariedEmp;
import com.demo.beans.Vendor;

public class EmployeeDaoImpl implements EmployeeDao { 
	static List<Employee> elist;
	static {
		elist = new ArrayList<>();
	}
	
	@Override
	public void readDataFromFile() throws IOException,ClassNotFoundException,EOFException {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("empdata.txt"));){
			File f = new File("empdata.txt");
			if(f.exists()) {
				while(true) {
				Employee e = (Employee)ois.readObject();
				elist.add(e);
				}
			}
		}catch(EOFException e) {
			throw e;
		}catch(IOException|ClassNotFoundException e){
			throw e;
		}
	}
	
	@Override
	public void save(Employee e) {
		elist.add(e);
		
	}

	@Override
	public List<Employee> findAll() {
		return elist;
	}

	@Override
	public Employee findById(int id) {
		for(Employee e: elist) {
			if(e.getId() == id) {
				return e;
			}
		}
		return null;
	}

	@Override
	public boolean deleteById(int id) {
		Employee e = findById(id);
		return elist.remove(e);
	}

	@Override
	public List<Employee> sortByName() {
		List<Employee> elst = new ArrayList<>();
		for(Employee e:elist) {
			elst.add(e);
		}
		elst.sort(null);
		return elst; 
	}

	@Override
	public boolean updateSalById(int id, double sal) {
		Employee e = findById(id);
		if(e != null) {
			if (e instanceof SalariedEmp) {
				((SalariedEmp)e).setSal(sal);
			} else if(e instanceof ContractEmp) {
				((ContractEmp)e).setCharges(sal);
			} else {
				((Vendor)e).setAmt(sal);
			}
			return true;
		}
		return false;
	}

	@Override
	public List<Employee> sortBySal() {
		Comparator<Employee> sal = (o1,o2) ->{
			double sal1,sal2;
			if(o1 instanceof SalariedEmp) {
				sal1 = ((SalariedEmp)o1).getSal();
			} else if(o1 instanceof ContractEmp) {
				sal1 = ((ContractEmp)o1).getCharges();
			} else {
				sal1 = ((Vendor)o1).getAmt();
			}
			if(o2 instanceof SalariedEmp) {
				sal2 = ((SalariedEmp)o2).getSal();
			} else if(o2 instanceof ContractEmp) {
				sal2 = ((ContractEmp)o2).getCharges();
			} else {
				sal2 = ((Vendor)o2).getAmt();
			}
			
			return (int)(sal1-sal2);
		};
		
		List<Employee> elst = new ArrayList<>();
		for(Employee e:elist) {
			elst.add(e);
		}
		elst.sort(sal);
		return elst;
	}

	@Override
	public void writeDataInFile() throws IOException{
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("empdata.txt"));){
			File f = new File("empdata.txt");
			if(f.exists()) {
				for(Employee e : elist) {
					oos.writeObject(e);
				}
			}
		}catch(IOException e) {
			throw e;
		}
		
	}

	

}
