
public class Players {
	private int pno;
	private String pname;
	private String pability;
	public Players() {
		super();
	}
	public Players(int pno, String pname, String pability) {
		super();
		this.pno = pno;
		this.pname = pname;
		this.pability = pability;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPability() {
		return pability;
	}
	public void setPability(String pability) {
		this.pability = pability;
	}
	@Override
	public String toString() {
		return "Players [pno=" + pno + ", pname=" + pname + ", pability=" + pability + "]";
	}
	
	
}
