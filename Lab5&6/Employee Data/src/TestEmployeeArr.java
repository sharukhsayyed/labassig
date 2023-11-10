import java.util.Scanner;

public class TestEmployeeArr {

	public static void main(String[] args) {
		int ch=0;
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice:\n1. Add Employee\n2. Modify Salary by ID\n3. display all");
		System.out.println("4. display by ID\n5. calculate salary by ID\n6. calculate bonus\n7. Exit");
		ch = sc.nextInt();
		
		switch(ch) {
		case 1: 
			System.out.println("Enter choice:\n1. Salaried Employee\n2. Contract Worker\n3. Vendor ");
			int choice = sc.nextInt();
			EmployeeServices.addEmployee(choice);
			break;
		case 2:
			System.out.println("Enter the id: ");
			int id = sc.nextInt();
			System.out.println("Enter the new salary:");
			double nsal = sc.nextDouble(); 
			boolean status = EmployeeServices.modifySalaryById(id,nsal);
			if(status) {
				System.out.println("modified successfully");
			}
			else {
				System.out.println("Id not found");
			}
			break;
		case 3:
			System.out.println("Employee details: ");
			EmployeeServices.displayAll();
			break;
		case 4:
			System.out.println("Enter the ID");
			id = sc.nextInt();
			EmployeeServices.displayById(id);
			break;
		case 5:
			System.out.println("Enter the ID:");
			id = sc.nextInt();
			double netSalary = EmployeeServices.calculateSalaryById(id);
			
			if(netSalary != -1) {
				System.out.println("Net Salary: " + netSalary);
			} else {
				System.out.println("Id not found");
			}
			break;
		case 6:
			System.out.println("Enter the ID: ");
			id = sc.nextInt();
			double bonus = EmployeeServices.calculateBonus(id);
			
			if(bonus != -1) {
				System.out.println("Bonus :"+bonus);
			} else {
				System.out.println("Id not found");
			}
			
			break;
		case 7:
			sc.close();
			System.out.println("Thank you for visiting...");
			break;
		default:
			System.out.println("Invalid choice");	
			
		}
		}while(ch != 7);

	}

}
