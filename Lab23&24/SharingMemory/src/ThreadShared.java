
public class ThreadShared extends Thread{
	private int a;
	private MyTask ob;
	
	public ThreadShared(int a,MyTask o) {
		this.a = a;
		ob = o;
	}
	
	public void run() {
		System.out.println("value of a: "+a);
	}
}
