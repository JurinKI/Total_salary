import java.util.Scanner;
public class TotalsaralySend {

    public static void main(String[] args) {
        TotalsaralyTest t = new TotalsaralyTest();
        Scanner in = new Scanner(System.in);
        String idmanager,name;
        int salary;
        int sales;

            System.out.print("Enter your First name : ");
            idmanager = in.nextLine();
            System.out.print("Enter your Last name : ");
            name = in.nextLine();
            System.out.print("Enter your salary : ");
            salary = in.nextInt();
            System.out.println("30/09/2020 ");
            System.out.print("Enter your sales : ");
            sales = in.nextInt();
            t.TotalsaralyTest( idmanager, name,salary,sales);



    }

}