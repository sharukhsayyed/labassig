
public class Person {
	private int pid;
	private String pname;
	private String pmob;
	private String pemail;
	public Person() {
		super();
	}
	public Person(int pid, String pname, String pmob, String pemail) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pmob = pmob;
		this.pemail = pemail;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPmob() {
		return pmob;
	}
	public void setPmob(String pmob) {
		this.pmob = pmob;
	}
	public String getPemail() {
		return pemail;
	}
	public void setPemail(String pemail) {
		this.pemail = pemail;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", pmob=" + pmob + ", pemail=" + pemail + "]";
	}
	
	
}
