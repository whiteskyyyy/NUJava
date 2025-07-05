import java.util.*;


public class act2no3 {
    static Scanner cl =new Scanner (System.in);
    
    public static void main(String[]args) {

        //variables//
        String employee;
        int hrs;
        int rate;
        double gross = 0;
        double Netpay = 0;


        //input all of the data needed//
        System.out.print("Name: "); employee=cl.nextLine();
        System.out.print("Hours worked: "); hrs=cl.nextInt();
        System.out.print("Input your rate: "); rate=cl.nextInt();

        //display the inputed data//
        System.out.print("\n\nEmployee's Name: "+ employee);
        System.out.print("\nHours worked: "+ hrs +" hrs");
        System.out.print("\nRate per hour: "+ rate +" PHP/hr");

        //first condition//
        if(hrs<=40){
            //formula if condition is met//
            gross = hrs*rate;
        }
        //if the condition wasn't met//
        else {
            //proceed with formula if hrs>40//
            gross = 1.5*rate*(hrs-40)+40*rate;
        }

        //second condition if gross<=500//
        if(gross<=6500) {
            //formula for netpay if condition is met//
            Netpay=gross;
        }
        //if condition wasn't met//
        else {
            //formula if condition wasn't met//
            //if gross>6500//
            Netpay=gross-(15+(0.45*gross));
        }

        //Display the net salary and grosspay of the employee//
        System.out.print("\nTotal Gross pay: PHP "+ gross);
        System.out.print("\nNet Salary Amount: PHP "+ Netpay);




    }
}
