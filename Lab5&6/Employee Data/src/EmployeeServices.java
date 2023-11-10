import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EmployeeServices {
	static Employee[] earr;
	static int count;
	
	static {
		count=0;
		earr = new Employee[10];
	}
	
	public static void addEmployee(int ch) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter id:");
		int id = sc.nextInt();
		System.out.println("Enter name : ");
		String nm = sc.next();
		System.out.println("Enter email ID : ");
		String email = sc.next();
		System.out.println("Enter mobile : ");
		String mobile = sc.next();
		System.out.println("Enter designation : ");
		String desig = sc.next();
		System.out.println("Enter department : ");
		String dept = sc.next();
		System.out.println("Enter date of Joining : (dd/mm/yyyy)");
		String dt = sc.next();
		LocalDate ldt = LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		switch(ch) {
		case 1:
			
			System.out.println("Enter the salary: ");
			double sal = sc.nextDouble();
			System.out.println("Enter the bonus: ");
			double b = sc.nextDouble();
			earr[count] = new SalariedEmp(id,nm,mobile,email,dept,desig,ldt,sal,b);
			break;
		case 2:
			System.out.println("Enter no. of hours: ");
			int hrs = sc.nextInt();
			System.out.println("Enter the charges: ");
			double charges = sc.nextDouble();
			earr[count] = new ContractWorker(id,nm,mobile,email,dept,desig,ldt,hrs,charges);
			break;
		case 3:
			System.out.println("Enter no of employees: ");
			int emp = sc.nextInt();
			System.out.println("Enter the amount: ");
			int amt = sc.nextInt();
			earr[count] = new Vendors(id,nm,mobile,email, dept,desig, ldt,emp,amt);
	
			break;
		}
		count++;
	}
	
	public static int searchById(int id) {
		for(int i=0; i<count; i++) {
			if(earr[i].getPid() == id) {
				return i;
			}
		}
		return -1;
	}
	
	public static int[] searchByName(String nm) {
//		Employee[] nlist = new Employee[];
		int[] ilist = new int[count];
		int temp = 0;
		for(int i=0; i<count; i++) {
			if(earr[i].getPname().equals(nm)) {
				ilist[temp++] = i;
			}
		}
		return ilist;
	}
	
	public static boolean modifySalaryById(int id,double s) {
		int pos = searchById(id);
		
		if(pos != -1) {
			if(earr[pos] instanceof SalariedEmp) {
				((SalariedEmp)(earr[pos])).setSalary(s);
				
			}
			else if(earr[pos] instanceof ContractWorker){
				((ContractWorker)(earr[pos])).setCharges(s);
				
			}
			else {
				((Vendors)(earr[pos])).setAmt(s);
				
			}
			return true;
		}
		return false;
	}
	
	public static void displayAll() {
		for(int i=0; i<count; i++) { 
			System.out.println(earr[i]);
		}
	}
	
	public static void displayById(int id) {
		int pos = searchById(id);
		if(pos != -1) {
			System.out.println(earr[pos]);
		}
		else {
			System.out.println("id not found");
		}
	}
	public static double calculateSalaryById(int id) {
		int pos = searchById(id);
		if(pos != -1) {
			return earr[pos].calculateSalary();
		}
		return -1;
	}
	
	public static double calculateBonus(int id) {
		int pos = searchById(id);
		
		if(pos != -1) {
			if(earr[pos] instanceof SalariedEmp) {
				return (((SalariedEmp)(earr[pos])).getBonus());
			}
		}
		return -1;
	}
	
}
