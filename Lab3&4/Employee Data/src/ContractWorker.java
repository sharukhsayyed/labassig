import java.time.LocalDate;

public class ContractWorker extends Employee {
	private int hrs;
	private double charges;
	public ContractWorker() {
		super();
	}
	public ContractWorker(int pid,String pname, String pmob, String pemail,String dept, String designation, LocalDate dateOfJoining,int hrs, double charges) {
		super(pid,pname,pmob,pemail,dept,designation,dateOfJoining);
		this.hrs = hrs;
		this.charges = charges;
	}
	public int getHrs() {
		return hrs;
	}
	public void setHrs(int hrs) {
		this.hrs = hrs;
	}
	public double getCharges() {
		return charges;
	}
	public void setCharges(double charges) {
		this.charges = charges;
	}
	@Override
	public String toString() {
		return super.toString()+"ContractWorker [hrs=" + hrs + ", charges=" + charges + "]";
	}
	
	public double calculateSalary() {
		return hrs * charges;
	}
	
	
}
