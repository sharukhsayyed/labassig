
public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		String ob = new String("Hello");
		
		Integer in = 10;
		int y = in;
		
		Integer in2 = y;
		System.out.println(y);
		
		Integer in3 = 5;
		int in4 = 5;
		System.out.println(in3 + " " + in4);
		
		System.out.println("s1 == ob"+(s1==ob));
		String s2 = "Apple,Mango";
		String[] s = s2.split(",");
		for(int i=0; i<s.length;i++) {
			System.out.print(s[i]+" ");
		}
		System.out.println();
		System.out.println(s1.substring(1));
		System.out.println(s1.indexOf("e"));
		System.out.println(s1.lastIndexOf("e"));
		
		StringBuilder sbr = new StringBuilder("Ameya");
		System.out.println(sbr.append(" Kulkarni"));
		System.out.println(sbr);
		
		StringBuffer sbf = new StringBuffer("Hello");
		System.out.println(sbf.append(" World"));
		System.out.println(sbf);
		
		System.out.println(s1 == ob);
		
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
	}

}
