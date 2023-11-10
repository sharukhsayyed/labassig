
import java.util.Scanner;

public class TeamServices {
	public static Teams[] tarr;
	static int count;
	
	static {
		tarr = new Teams[2];
		count = 0;
	}
	
	public static void addTeam() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the team no. \n");
		int tno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the team name \n");
		String tname = sc.nextLine();
		System.out.println("Enter the player no. of captain \n");
		int pno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the name of captain \n");
		String pname = sc.nextLine();
		System.out.println("Enter the skill of captain \n");
		String pability = sc.next();
		Players captain = new Players(pno,pname,pability);
		
		Players[] plist = new Players[3];
		plist[0] = captain;
		
		for(int i=1; i<plist.length; i++) {
			System.out.println("Enter the player no. : \n");
			pno = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the name of player: \n");
			pname = sc.nextLine();
			System.out.println("Enter the skill :  \n");
			pability = sc.next();
			plist[i] = new Players(pno,pname,pability);
		}
		
		tarr[count] = new Teams(tno,tname,captain,plist);
		count++;
	}
	
	public static void displayAll() {
		for(int i=0; i<count; i++) {
			System.out.println(tarr[i]);
		}
	}
	
	public static Players[] searchByTno(int tno) {
		for(int i=0; i<count; i++) {
			if(tarr[i].getTno() == tno) {
				return tarr[i].plist;
			}
		}
		return null;
	}
	
	public static Players[] searchByCName(String cname) {
		for(int i=0; i<count; i++) {
			if(tarr[i].getCaptain().getPname().equals(cname)) {
				return tarr[i].plist;
			}
		}
		return null;
	}
	
	
}
