import java.util.*;

public class activity4no2 {
    static Scanner cl = new Scanner (System.in);
    public static void main(String args[]){  

        clearScreen();
        //variables//
        int inp[] = new int[11];
        int x;

        //ask for input for 7 numbers
        System.out.print("Input a seven numbers: \n");
        //loop for input//
        for (x=1;x<=7;x++){
            System.out.print(x+".Input a numbers: ");inp[x]=cl.nextInt();
        }

        //formula for sum of seven//
        inp[9] = inp[1] + inp[2] + inp[3] + inp[4] + inp[5] + inp[6] + inp[7];

        System.out.println("\n-------------------------------------------------\n");
        //display sum of seven number//
        System.out.print("Sum of all seven numbers: "+inp[9]);
        System.out.println("\n\n-------------------------------------------------\n");


        //display seven numbers//
        System.out.print("Display all seven numbers: \n");
        for (x=1;x<=7;x++){
            System.out.println(" Number " +x+": "+inp[x]);
        }
        System.out.println("\n-------------------------------------------------\n");

        //display specified numbers//
        System.out.print("Display 1st, 3rd, 5th, 7th numbers: \n");
        for (x=1;x<=7;x=x+2){
            System.out.println(" Number " +x+": "+inp[x]);
        }
        System.out.println("\n-------------------------------------------------\n");

        //formula for specified numbers//
        for(x=1;x<=7;x=x+2){
            inp[10] = inp[10] + inp[x];
        }
        System.out.print("Sum of the four numbers: "+ inp[10]);
        System.out.println("\n\n-------------------------------------------------\n");
        
    }
    //code for clearscreen//
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  
}
