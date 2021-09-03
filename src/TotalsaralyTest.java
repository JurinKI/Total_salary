
public class TotalsaralyTest {
	private String fname;
	private String lname;
	private int time;
	
	
	public void TotalsaralyTest(String fname , String lname,int time ) {
        this.fname = fname;
        this.lname = lname;
		this.time = time;
    }
	
	
	
	public String getFname() {
		return fname;
	}



	public void setFname(String fname) {
		this.fname = fname;
	}



	public String getLname() {
		return lname;
	}



	public void setLname(String lname) {
		this.lname = lname;
	}



	public int getTime() {
		return time;
	}



	public void setTime(int time) {
		this.time = time;
	}



	public int salary() {
		int sum = 0;
		sum = time*500;
		return sum;
	}
	
}
