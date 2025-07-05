import java.util.*;


public class act3no2 {
    static Scanner cl = new Scanner (System.in);
    public static void main(String args[]){  
        clearScreen();

        //variables//
        int pass = 0, fail = 0;             //pass or fail counter//
        String[] name = new String[20];     //Array for name, can be used in the loop//
        int x;                              //counter//
        int[] y = new int[20];              //array y to add value to pass or fail//

        //first loop, limit to 15 input of name//
        for (x=1;x<=15;x++)
        {
            //ask for the user for names//
            System.out.print(x+ ". Input student's name: "); name[x]=cl.next();

            //nested loop//
            //ask for grades from the user//
            do{
                //input grade of student//
                System.out.print("Input grade of student: "); y[x]=cl.nextInt();

                //if else statement, nested//
                
                if (y[x]<50 || y[x]>100)
                {
                    //if user input below 50 or above 100//
                    System.out.print("Please input grades 50-100\n");
                }

                //counter for pass or fail//
                //if student failed, add count to fail//
                if(y[x]<75 && y[x]>=50)
                {
                    fail=fail+1;
                }
                //if student passed, add count to pass//
                else if(y[x]>=75&&y[x]<=100)
                {
                    pass=pass+1;
                }

            }
            //limitation for do loop//
            //input grades 50-100//
            while(y[x]<50 || y[x]>100);
            //every 2 loop, clear screen for a cleaner look//
            if (x % 2 == 0){
                clearScreen();
            }

        }

        //after loop clear screen before displaying pass and fail count//
        clearScreen();
        System.out.print("Number of PASSING students: "+pass);
        System.out.print("\nNumber of FAILING students: "+fail);
    }

    //code for clearscreen//
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  
}
