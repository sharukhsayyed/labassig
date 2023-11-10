import java.time.LocalDate;

public class SalariedEmp extends Employee {
	private double salary;
	private double bonus;
	
	
	public SalariedEmp() {
		super();
	}
	
	
	public SalariedEmp(int pid, String pname, String pmob, String pemail,String dept, String designation, LocalDate dateOfJoining,double salary, double bonus) {
		super(pid,pname,pmob,pemail,dept,designation,dateOfJoining);
		this.salary = salary;
		this.bonus = bonus;
	}


	@Override
	public String toString() {
		return super.toString()+"SalariedEmp [salary=" + salary + ", bonus=" + bonus + "]";
	}


	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	public double calculateSalary() {
		return salary + 0.10 * salary + 0.15 * salary - 0.08 * salary + bonus;
	}
	
}
