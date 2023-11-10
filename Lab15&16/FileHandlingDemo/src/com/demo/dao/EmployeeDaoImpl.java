package com.demo.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	static List<Employee> elist;
	
	static {
		elist = new ArrayList<>();
	}
	
	@Override
	public void readDataFromFile() throws IOException{
		File f = new File("empdata.txt");
		if(f.exists()) {
			try(BufferedReader br = new BufferedReader(new FileReader("empdata.txt"))){
				String line =  br.readLine();
				while(line != null) {
					String[] strarr = line.split(",");
					LocalDate dt = LocalDate.parse(strarr[6],DateTimeFormatter.ofPattern("yyyy-MM-dd"));
					Employee e = new Employee(Integer.parseInt(strarr[0]),strarr[1],strarr[2],strarr[3],strarr[4],strarr[5],dt);
					elist.add(e);
					line = br.readLine();
				}
			}catch(IOException e) {
				throw e;
			}
		}
		
	}
	@Override
	public void save(Employee emp) {
		elist.add(emp);
	}

	@Override
	public List<Employee> findAll() {
		return elist;
	}

	@Override
	public Employee findById(int id) {
		for(Employee e :elist) {
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
		for(Employee e: elist) {
			elst.add(e);
		}
		elst.sort(null);
		return elst;
	}
	@Override
	public List<Employee> displayAll() {
		return elist;
	}
	@Override
	public void writeDataInFile() throws IOException{
		File f = new File("empdata.txt");
		if(f.exists()) {
			try(BufferedWriter br = new BufferedWriter(new FileWriter("empdata.txt"))){
				for(Employee e:elist) {
					br.write(e.getId()+","+e.getName()+","+e.getMobile()+","+e.getEmail()+","+e.getDept()+","+e.getDesg()+","+e.getDateofJoining()+"\n");
				}
			}catch(IOException e) {
				throw e;
			}
		}
	}

}
