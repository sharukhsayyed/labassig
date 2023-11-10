
public class Member extends Person{
	private String membership;
	private int amount;
	public Member() {
		super();
	}
	public Member(int pid, String pname, String mobile, String email, String membership, int amount) {
		super(pid,pname,mobile,email);
		this.membership = membership;
		this.amount = amount;
	}
	public String getMembership() {
		return membership;
	}
	public void setMembership(String membership) {
		this.membership = membership;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return super.toString()+"Member [membership=" + membership + ", amount=" + amount + "]";
	}
	
	
}
