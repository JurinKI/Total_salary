import java.util.Scanner;
import java.time.LocalDate;
import java.util.Calendar;

public class TotalsaralySend {
	
	static boolean lateDate = false;
	
	public void  TotalsaralySend () {
		
		Addmember();
		
	    
	}
	
	public void Addmember() {
		
		LocalDate today = LocalDate.now();
        System.out.println("Current Date : " +today);
        
        
		TotalsaralyTest t = new TotalsaralyTest();
		
		 String idmanager;
		 String name;
		 int salary;
		 double sales;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your ID : ");
		idmanager = in.nextLine();
        System.out.print("Enter your Name : ");
        name = in.nextLine();
        System.out.print("Enter your salary : ");
        salary = in.nextInt();
        
        if(findtoDate ()== true){
			System.out.print("Enter your sales : ");
			sales = in.nextDouble();
			t.setSales(sales);
			
		}
	    
		t = new TotalsaralyTest(idmanager, name,salary);
		sales=t.getsales();
		
		
		toSring( idmanager, name,salary,sales);
	}
	
	
	
	public String toSring(String idmanager, String name,int salary,double sales) {
		TotalsaralyTest t = new TotalsaralyTest(idmanager, name,salary);
		String manager = t.toString();
		if(lateDate == true) {
			manager = manager + " Amount : " + t.salary();
		}
		System.out.println(manager);
		
		return manager;
	}
	
	
	public boolean findtoDate () {
		
		LocalDate today = LocalDate.now();
		int date = today.getDayOfMonth();
		Calendar cal = Calendar.getInstance();
		int lastDateOfMonth = cal.getActualMaximum(Calendar.DATE);
		date=30;
		if(date == lastDateOfMonth){
			lateDate = true;
			return true;
		}
		return false;
		
	}
	
	
	
}
	