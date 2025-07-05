import java.io.*;
import java.util.*;





public class Seatwork1
{
    
    static Scanner console=new Scanner (System.in);
    
    public static void main(String[]args) {
        
        
        //variables//
        
        String cus;         //id//
        String name;        //name//
        double kw;          //kilowatts//
        //set initial value to 0 so it can be used independently//
        double surg = 0;    //surcharge//
        //input the height and base//
        System.out.print("-----------------------------\n");
        System.out.print("Consumer's Information: \n");
        System.out.print("ID Number: "); cus=console.nextLine();
        System.out.print("Name: "); name=console.nextLine();
        System.out.print("Consumed: "); kw=console.nextInt();
        System.out.print("-----------------------------\n\n");

        //print out customer informations//
        System.out.print("Customer ID#: "+ cus+"\n");
        System.out.print("Customer Name: "+ name+"\n");
        System.out.print("Unit Consumed: "+ kw +"kW"+"\n");

        //if else statement for charges//
        if (kw>=600)
        {
            //formula and charge amount//
            kw=kw*3;
            System.out.print("Charge per Unit is PHP 3.00\n");
            System.out.print("Amount Charges: PHP "+ kw+"\n");
        }
        else if (kw<600&&kw>=400)
        {
            //formula and charge amount//
            kw=kw*2.5;
            System.out.print("Charge per Unit is PHP 2.50\n");
            System.out.print("Amount Charges: PHP "+ kw+"\n");
        }
        else if (kw<400&&kw>=200)
        {
            //formula and charge amount//
            kw=kw*2;
            System.out.print("Charge per Unit is PHP 2.00\n");
            System.out.print("Amount Charges: PHP "+ kw+"\n");
        }
        else if (kw<200)
        {
            //formula and charge amount//
            kw=kw*1.5;
            System.out.print("Charge per Unit is PHP 1.50\n");
            System.out.print("Amount Charges: PHP "+ kw+"\n");
        }

        //if amount charge is 1000 and above//
        if(kw>=1000)
        {
            //15% surcharge formula//
            surg=kw*0.15;
            System.out.print("Surchage Amount: PHP "+ surg+"\n");
        }
        //net amount, reused surg var//
        surg=surg+kw;
        System.out.print("Net Amount Paid by the Customer: PHP "+ surg+"\n\n");
        //thank you message//
        System.out.print("-----------------------------\n\n");
        System.out.print("THANK YOU, PLEASE COME AGAIN!\n\n");
        System.out.print("-----------------------------\n\n");
    }
}