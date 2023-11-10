
public class NumberServices {
	public static void displayTable(int t) {
		for(int i=1;i <=10; i++) {
			System.out.println(t+" * " + i +" = "+ t*i);
		}
	}
	
	
	public static boolean isPrime(int n) {
		for(int i=2; i<n; i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void displayDiamond(int h) {
		int spacecnt = (int)(h/2);
		for(int i=1;i<=h;i+=2) {
			String s= "";
			for(int j=0; j<spacecnt; j++) {
				s += " ";
			}
			spacecnt--;
			String star = "";
			for(int j=1;j<=i;j++) {
				star += "*";
			}
			System.out.println(s+star);
		}
		spacecnt = 1;
		for(int i=h-2; i>=1; i-=2) {
			String s = "";
			for(int j=0;j<spacecnt; j++) {
				s += " ";
			}
			String star = "";
			spacecnt++;
			for(int j=1; j<=i; j++) {
				star += "*";
			}
			System.out.println(s+star);
			
			
		}
	}
}
