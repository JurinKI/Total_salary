
public class TotalsaralyTest extends TotalsaralySend{
	private String idmanager;
	private String name;
	private int salary;
	private int sales;
	
	public void TotalsaralyTest (String idmanager , String name,int salary ,int sales) {
        this.idmanager = idmanager;
        this.name = name;
		this.salary = salary;
		this.sales = sales;
    }
	
	
	
	public String getidmanager() {
		return this.idmanager;
	}


	public String getname() {
		return this.name;
	}


	public int getsalary() {
		return this.salary;
	}
	
	public int getsales() {
		return this.sales;
	}

	public double salary() {
		double sum = 0;
		if(this.sales<=50000) {
			sum = salary+(salary*0.05);
		}else
			sum = this.salary+(this.salary*0.10);
		
		return sum;
	}
	
}
