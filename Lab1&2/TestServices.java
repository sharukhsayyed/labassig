import java.util.Scanner;

public class TestServices {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch;
		do {
			System.out.println("Enter the choice:\n1. Print table\n2. prime number\n3. display diamond pattern\n4. Exit");
			ch = sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter the number whose table you want");
				int n = sc.nextInt();
				NumberServices.displayTable(n);
				break;
			case 2:
				System.out.println("Enter the number: ");
				n = sc.nextInt();
				boolean status = NumberServices.isPrime(n);
				if(status) {
					System.out.println("The number is prime");
				} else {
					System.out.println("THe number is not a prime");
				}
				break;
			case 3:
				System.out.println("Enter the height of diamond");
				n = sc.nextInt();
				NumberServices.displayDiamond(n);
				break;
			case 4:
				sc.close();
				System.out.println("Thank you for visiting...");
				break;
			default:
				System.out.println("Invalid choice");
			}
		}while( ch != 4);
	}

}
