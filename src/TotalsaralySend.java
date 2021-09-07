import java.util.Scanner;
public class TotalsaralySend extends TotalsaralyDemo{
	 
	
	public  void TotalsaralySend () {
		
		Addmember();
		
	    
	}
	
	public void Addmember() {
		TotalsaralyTest t = new TotalsaralyTest();
		 String idmanager;
		 String name;
		 int salary;
		 int sales;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your ID : ");
		idmanager = in.nextLine();
        System.out.print("Enter your Name : ");
        name = in.nextLine();
        System.out.print("Enter your salary : ");
        salary = in.nextInt();
        System.out.println("30/09/2020 ");
        System.out.print("Enter your sales : ");
        sales = in.nextInt();
	    t.TotalsaralyTest( idmanager, name,salary,sales);
	    System.out.println("Name : "+t.getname());
	    System.out.println("Salary : "+t.salary());
	    
	}
	
	
	
}
	