import java.util.Scanner;
public class TotalsaralySend {

	public static void main(String[] args) {
		TotalsaralyTest t [][] = new TotalsaralyTest[2][3];
		Scanner in = new Scanner(System.in);
		String fname,lname;
		int i = 0 ,j = 0, time; 
		char yn = 'y';
		
		for(i=0; i< t.length ; i++) {
			
			for(j=0; j < 3 ; j++) {
				switch (j) {
				case 0:
					System.out.print("Enter your First name : ");
			        fname = in.nextLine();
			        t[i][j].setFname(fname);
					break;
				case 1:
					System.out.print("Enter your Last name : ");
			        lname = in.nextLine();
			        t[i][j].setLname(lname);
					break;
				case 2:
					System.out.print("How much hours : ");
					time = in.nextInt();
			        t[i][j].setTime(time);
					break;
				}
			}
			
			System.out.println("Col"+i);
		}
		
//			System.out.print("Enter your First name : ");
//	        fname = in.nextLine();
//	        System.out.print("Enter your Last name : ");
//	        lname = in.nextLine();
//	        System.out.print("How much hours : ");
//	        time = in.nextInt();
//	        t.TotalsaralyTest( fname, lname,time);
//	        System.out.print("Do you want to add (Y/N) : ");
//	        yn = in.next().charAt(0);
//	        i= i+1;
//		
		
		
		
		
        
	}

}
