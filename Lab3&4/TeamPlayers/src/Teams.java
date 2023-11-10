import java.util.Arrays;

public class Teams {
	
	private int tno;
	private String tname;
	private Players captain;
	public Players[] plist;

	@Override
	public String toString() {
		return "Teams [tno=" + tno + ", tname=" + tname + ", captain=" + captain + ", plist=" + Arrays.toString(plist)
				+ "]";
	}

	public Teams() {
		super();
	}

	public Teams(int tno, String tname, Players captain, Players[] plist) {
		super();
		this.tno = tno;
		this.tname = tname;
		this.captain = captain;
		this.plist = plist;
	}

	public int getTno() {
		return tno;
	}

	public void setTno(int tno) {
		this.tno = tno;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public Players getCaptain() {
		return captain;
	}

	public void setCaptain(Players captain) {
		this.captain = captain;
	}

	public Players[] getPlist() {
		return plist;
	}

	public void setPlist(Players[] plist) {
		this.plist = plist;
	}
	
	
	
	
}
