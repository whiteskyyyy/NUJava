package midterm;
import java.util.*;

//class employee//
class employee{
    //attributes//
    static Scanner cl = new Scanner (System.in);
    String Nm, dpt, eno;
    double sal, rate, nd, nw, tt;

    //constructor//
    public employee(){

        //ask for input name, department, employee number, and rate//
        System.out.printf("%-17s", "Employee Name: "); 
        Nm = cl.nextLine();
        System.out.printf("%-17s", "Department: "); 
        dpt = cl.nextLine();
        System.out.printf("%-17s", "Employee Number: "); 
        eno = cl.nextLine();
        System.out.printf("%-17s", "Rate per hour: "); 
        rate = cl.nextFloat();

        //ask for hours per day using do loop//
        //do loop so user can only input 1-24//
        do{
            System.out.printf("%-17s", "Hours per day: "); 
            nd = cl.nextFloat();
            if(nd>24){
                System.out.print("Please Input Correct Number of hours\nNumber of Hours cannot exceed 24 Hours\n");
            }
        }
        while (nd>24);

        //ask for work days in a week using do loop//
        //do loop so user can only input 1-7//
        do{
            System.out.printf("%-17s", "Number of work days in a week: "); 
            nw = cl.nextFloat();
            if(nw>7){
                System.out.print("Please Input Correct Number of Days\nNumber of Work days cannot exceed 7 Days\n");
            }
        }
        while (nw>7);

        //calculation//
        //so we can get monthly income//
        nd = rate * nd;
        nw = nd * nw;
        //estimation monthly income//
        sal = nw * 4.28571428571;
        contr(sal);
        //variables that used for tax contributions//
        t = z + m + f;
        tt = sal - t;
        cl.nextLine();

    }

    //static method and calculation for tax contributions//
    //seperate so it can be a little organize :D//
    public static double contr(double sal){
        m = sal * 0.02;
        f = sal * 0.005;
        return z = sal * 0.045;
    }
    //public variables so it can be used in between the class and the seperate code//
    public static double z, m, f, t;
}


