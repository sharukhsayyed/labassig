
import java.time.LocalDate;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Employee e = new Employee(1,"Ameya","3333","a@gmail.com","HR","manager",LocalDate.of(2001,02,23));
//		System.out.println(e.getPemail());
		
		// implicit typecasting (upcasting)
		Employee e1 = new SalariedEmp(1,"Ameya","3333","b@gmail.com","HR","manager",LocalDate.of(2001,02,23),2500,5000); 
		System.out.println(e1.calculateSalary());
		
		
		Employee e3 = new ContractWorker(1,"gdgs","8451","fsaf","fafd","asfaf",LocalDate.of(2012,02,12),45,4500);
//		System.out.println(e3.);
		ContractWorker c1 = (ContractWorker)e3;
		System.out.println(c1.getCharges());
		System.out.println(c1.calculateSalary());
		
		
		SalariedEmp e2 = (SalariedEmp)e1;
		System.out.println(e2.getSalary());
		
		SalariedEmp s1 = (SalariedEmp)e1;
		System.out.println(s1.getPname());
		
		Person p = new Member(1,"Ameya","3333","hjsfh","premium",4500);
		System.out.println(p.getPname());
		
		Member m = (Member) p;
		System.out.println(m.getMembership());
	}

}

