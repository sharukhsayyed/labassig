
public class TestShared {

	public static void main(String[] args) {
		MyTask m = new MyTask();
		
		ThreadShared th1 = new ThreadShared(4,m);
		ThreadShared th2 = new ThreadShared(5,m);
		th1.start();
		th2.start();

	}

}
