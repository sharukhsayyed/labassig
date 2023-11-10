import java.util.Scanner;
public class TestTeam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ch;
		
		do {
			System.out.println("Enter the choice:\n1. Add Team\n2. Display All\n3. search by team no.\n4. search by captain name\n5. close\n Enter the choice");
			ch = sc.nextInt();
			
			switch(ch) {
			case 1:
				TeamServices.addTeam();
				break;
			case 2:
				TeamServices.displayAll();
				break;
			case 3:
				System.out.println("Enter the team no. \n");
				int tno = sc.nextInt();
				Players[] parr= TeamServices.searchByTno(tno);
				if(parr != null) {
					for(Players p: parr) {
						System.out.println(p);
					}
				} else {
					System.out.println("Enter valid team no.");
				}
				break;
			case 4:
				sc.nextLine();
				System.out.println("Enter the name of captain: \n");
				String nm = sc.nextLine();
				Players[] p = TeamServices.searchByCName(nm);
				if(p != null) {
					for(Players p1: p) {
						System.out.println(p1);
					}
				} else {
					System.out.println("No captain name : "+nm+" found");
				}
				break;
			case 5:
				break;
			default:
				System.out.println("Invalid choice");
			}
			
		}while(ch != 5);
		sc.close();
	}

}
