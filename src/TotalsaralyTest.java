public class TotalsaralyTest extends TotalsaralySend{
    private String idmanager;
    private String name;
    private int salary;
    private double sales;

    public TotalsaralyTest ( ) {

    }

    public  TotalsaralyTest (String idmanager , String name,int salary ) {
        this.idmanager = idmanager;
        this.name = name;
        this.salary = salary;
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

    public double getsales() {
        return this.sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }



    public double salary() {
        double sum = 0;
        if(salary<=10000)
        {
            if(sales<=50000) {
            sum = salary+(salary*0.05);
        }else
            sum = salary+(salary*0.10);
        }

        else {
            if(sales<=100000) {
                sum = salary+(salary*0.05);
            }else
                sum = salary+(salary*0.10);
            if(sum<12000) {
                sum=12000;
            }
        }
        return sum;
    }

    public String toString() {
        return "ManagerID :  " + this.idmanager + "   ManagerName :   " + this.name + "   Salary :   " + this.salary;
    }

}