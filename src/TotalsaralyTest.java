
public class TotalsaralyTest {
	private String idmanager;
	private String name;
	private int salary;
	private int sales;
	
	public void TotalsaralyTest(String idmanager , String name,int salary ,int sales) {
        this.idmanager = idmanager;
        this.name = name;
		this.salary = salary;
		this.sales = sales;
    }
	
	
	
	public String getidmanager() {
		return idmanager;
	}


	public String getname() {
		return name;
	}


	public int getsalary() {
		return salary;
	}


	public int salary() {
		int sum = 0;
		sum = salary*500;
		return sum;
	}
	
}
