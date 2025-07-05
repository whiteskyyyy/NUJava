package midterm;
import java.util.*;
/* Problem: Set B
Write a program that will compute the total salary of an employee. 
Input the name of the employee, department, and employee number.  
Input also for the rate per hour, and the numbers of work 
rendered to compute the total pay of an employee. Construct 
a class, instantiate the class three times, use a constructor,
and apply methods. The more methods in your program, the better. */

public class totalsal {
    static Scanner cl = new Scanner (System.in);
    public static void main(String[]args){
        //clear screen//
        clearScreen();
        //first method//
        nms1();
        //ask for prompt before continue//
        System.out.printf("%-17s", "Press Enter for Next Employee: "); 
        cl.nextLine();
        //second method//
        nms2();
        //ask for prompt before continue//
        System.out.printf("%-17s", "Press Enter for Next Employee: "); 
        cl.nextLine();
        //third method//
        nms3();
        
        //summary//
        System.out.printf("%-17s", "Press Enter for Summary: "); 
        cl.nextLine();
        clearScreen();
        System.out.println("\n\n=================================================================================================\n"); 
        //format for each//
        System.out.printf("%-30s", "Employee Names"); 
        System.out.printf("%-30s", "Department"); 
        System.out.printf("%-30s", "Employee Number"); 
        System.out.printf("%-30s", "Net Pay"); 
        System.out.print("\n-------------------------------------------------------------------------------------------------");
        //display data//
        System.out.println();
        System.out.printf("%-30s", nm); System.out.printf("%-30s", py); 
        System.out.printf("%-30s", tn); System.out.printf("%-30s", String.format("%.1f",dd)); 
        System.out.println();
        System.out.printf("%-30s", nm1); System.out.printf("%-30s", py1); 
        System.out.printf("%-30s", tn1); System.out.printf("%-30s", String.format("%.1f",dd1)); 
        System.out.println();
        System.out.printf("%-30s", nm2); System.out.printf("%-30s", py2); 
        System.out.printf("%-30s", tn2); System.out.printf("%-30s", String.format("%.1f",dd2)); 
        System.out.println("\n\n=================================================================================================\n"); 

    }

    //clear screen//
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

    //first method//
    public static void nms1(){
        //first object//
        employee st = new employee();

        //display every data//
        System.out.println("=================================================="); 
        System.out.printf("%-30s", "\n  Employee Name: "); 
        System.out.printf("%-30s", st.Nm); 
        System.out.printf("%-30s", "\n  Employee Department: "); 
        System.out.printf("%-30s", st.dpt); 
        System.out.printf("%-30s", "\n  Employee Number: "); 
        System.out.printf("%-30s", st.eno); 
        System.out.printf("%-28s", "\n  Rate per hour: "); 
        System.out.printf("%-28s", "P "+st.rate); 
        System.out.printf("%-28s", "\n  Rate per Day: "); 
        System.out.printf("%-28s", "P "+st.nd); 
        System.out.printf("%-28s", "\n  Rate per Week: "); 
        System.out.printf("%-28s", "P "+st.nw); 
        System.out.printf("%-28s", "\n  Gross Pay: "); 
        System.out.printf("%-28s", "P "+String.format("%.1f",st.sal)); 
        System.out.println("\n\n--------------------------------------------------"); 
        //deductions//
        System.out.printf("%-28s", "\n  SSS Contribution: "); 
        System.out.printf("%-28s", "P "+String.format("%.1f",employee.z)); 
        System.out.printf("%-28s", "\n  PhilHealth Contribution: "); 
        System.out.printf("%-28s", "P "+String.format("%.1f",employee.m)); 
        System.out.printf("%-28s", "\n  PAG-IBIG Contribution: "); 
        System.out.printf("%-28s", "P "+String.format("%.1f",employee.f)); 
        System.out.printf("%-29s", "\n\n  Total Deductions: "); 
        System.out.printf("%-28s", "P "+String.format("%.1f",employee.t)); 
        System.out.println("\n\n--------------------------------------------------"); 
        System.out.printf("%-28s", "\n  Net Pay: "); 
        System.out.printf("%-28s", "P "+String.format("%.1f",st.tt)); 
        System.out.println("\n\n=================================================="); 

        //add value for following variables//
        nm = st.Nm;
        py = st.dpt;
        tn = st.eno;
        dd = st.tt;
    }


    //second method//
    public static void nms2(){
        //second object//
        employee cy = new employee();

        //display data//
        System.out.println("\n\n=================================================="); 
        System.out.printf("%-30s", "\n  Employee Name: "); 
        System.out.printf("%-30s", cy.Nm); 
        System.out.printf("%-30s", "\n  Employee Department: "); 
        System.out.printf("%-30s", cy.dpt); 
        System.out.printf("%-30s", "\n  Employee Number: "); 
        System.out.printf("%-30s", cy.eno); 
        System.out.printf("%-28s", "\n  Rate per hour: "); 
        System.out.printf("%-28s", "P "+cy.rate); 
        System.out.printf("%-28s", "\n  Rate per Day: "); 
        System.out.printf("%-28s", "P "+cy.nd); 
        System.out.printf("%-28s", "\n  Rate per Week: "); 
        System.out.printf("%-28s", "P "+cy.nw); 
        System.out.printf("%-28s", "\n  Gross Pay: "); 
        System.out.printf("%-28s", "P "+String.format("%.1f",cy.sal)); 
        System.out.println("\n\n--------------------------------------------------"); 
        //deductions//
        System.out.printf("%-28s", "\n  SSS Contribution: "); 
        System.out.printf("%-28s", "P "+String.format("%.1f",employee.z)); 
        System.out.printf("%-28s", "\n  PhilHealth Contribution: "); 
        System.out.printf("%-28s", "P "+String.format("%.1f",employee.m)); 
        System.out.printf("%-28s", "\n  PAG-IBIG Contribution: "); 
        System.out.printf("%-28s", "P "+String.format("%.1f",employee.f)); 
        System.out.printf("%-29s", "\n\n  Total Deductions: "); 
        System.out.printf("%-28s", "P "+String.format("%.1f",employee.t)); 
        System.out.println("\n\n--------------------------------------------------"); 
        System.out.printf("%-28s", "\n  Net Pay: "); 
        System.out.printf("%-28s", "P "+String.format("%.1f",cy.tt)); 
        System.out.println("\n\n=================================================="); 

        //add value for variables//
        nm1 = cy.Nm;
        py1 = cy.dpt;
        tn1 = cy.eno;
        dd1 = cy.tt;

    }

    //third method//
    public static void nms3(){
        //third object//
        employee br = new employee();

        //display data needed//
        System.out.println("\n\n=================================================="); 
        System.out.printf("%-30s", "\n  Employee Name: "); 
        System.out.printf("%-30s", br.Nm); 
        System.out.printf("%-30s", "\n  Employee Department: "); 
        System.out.printf("%-30s", br.dpt); 
        System.out.printf("%-30s", "\n  Employee Number: "); 
        System.out.printf("%-30s", br.eno); 
        System.out.printf("%-28s", "\n  Rate per hour: "); 
        System.out.printf("%-28s", "P "+br.rate); 
        System.out.printf("%-28s", "\n  Rate per Day: "); 
        System.out.printf("%-28s", "P "+br.nd); 
        System.out.printf("%-28s", "\n  Rate per Week: "); 
        System.out.printf("%-28s", "P "+br.nw); 
        System.out.printf("%-28s", "\n  Gross Pay: "); 
        System.out.printf("%-28s", "P "+String.format("%.1f",br.sal)); 
        System.out.println("\n\n--------------------------------------------------"); 
        //deductions//
        System.out.printf("%-28s", "\n  SSS Contribution: "); 
        System.out.printf("%-28s", "P "+String.format("%.1f",employee.z)); 
        System.out.printf("%-28s", "\n  PhilHealth Contribution: "); 
        System.out.printf("%-28s", "P "+String.format("%.1f",employee.m)); 
        System.out.printf("%-28s", "\n  PAG-IBIG Contribution: "); 
        System.out.printf("%-28s", "P "+String.format("%.1f",employee.f)); 
        System.out.printf("%-29s", "\n\n  Total Deductions: "); 
        System.out.printf("%-28s", "P "+String.format("%.1f",employee.t)); 
        System.out.println("\n\n--------------------------------------------------"); 
        System.out.printf("%-28s", "\n  Net Pay: "); 
        System.out.printf("%-28s", "P "+String.format("%.1f",br.tt)); 
        System.out.println("\n\n=================================================="); 

        //add value for variables//
        nm2 = br.Nm;
        py2 = br.dpt;
        tn2 = br.eno;
        dd2 = br.tt;

    }
    
    //variables that can be used in all method and on the main code//
    //used variables for the summary//
    public static String nm, py, tn, nm1, py1, tn1, nm2, py2, tn2;
    public static double dd, dd1, dd2;
}

