public class TotalsaralyDemo {
	public static void main(String[] args) {
		TotalsaralyTest t  =new TotalsaralyTest();
		TotalsaralySend s = new TotalsaralySend();
		s.main(args);
		System.out.println("Name : "+t.getname());
		System.out.println("Salary : "+t.salary());
    }
	
}
