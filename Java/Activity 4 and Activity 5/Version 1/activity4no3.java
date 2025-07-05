import java.util.*;

public class activity4no3 {
    static Scanner cl = new Scanner (System.in);
    public static void main(String args[]){  

        clearScreen();
        //variables//
        String inp[] = new String[11];
        int x;

        //ask for input for 8 names
        System.out.print("Ask for names: \n");
        //loop for input//
        for (x=1;x<=8;x++){
            System.out.print(x+".Input a Name: ");inp[x]=cl.nextLine();
        }

        System.out.println("\n-------------------------------------------------\n");


        //display eight names//
        System.out.print("Display all eight names: \n");
        for (x=1;x<=8;x++){
            System.out.println("Name " +x+": "+inp[x]);
        }
        System.out.println("\n-------------------------------------------------\n");

        //display specified name//
        System.out.print("Display 2nd, 4th, 6th, 8th Name: \n");
        for (x=2;x<=8;x=x+2){
            System.out.println("Name " +x+": "+inp[x]);
        }
        System.out.println("\n-------------------------------------------------\n");

        
    }
    //code for clearscreen//
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  
}
