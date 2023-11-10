import java.time.LocalDate;

public class Vendors extends Employee{
	private int noOfEmployees;
	private double amt;

	public Vendors() {
		super();
	}

	public Vendors(int id,String nm,String mobile, String email, String dept,String desig, LocalDate doj, int noOfEmployees,int amt) {
		super(id,nm,mobile,email,dept,desig,doj);
		this.noOfEmployees = noOfEmployees;
		this.amt = amt;
	}

	public int getNoOfEmployees() { 
		return noOfEmployees;
	}

	public double getAmt() {
		return amt;
	}

	public void setAmt(double amt) {
		this.amt = amt;
	}

	public void setNoOfEmployees(int noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}

	@Override
	public String toString() {
		return super.toString()+"Vendors [noOfEmployees=" + noOfEmployees + ", amt=" + amt + "]";
	}

	public double calculateSalary() {
		return amt * noOfEmployees;
	}
	
	
}
