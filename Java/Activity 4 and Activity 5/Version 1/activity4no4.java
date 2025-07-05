import java.util.*;

public class activity4no4 {
    static Scanner cl = new Scanner (System.in);
    public static void main(String args[]){  
        //variables//
        String[] name = new String[6];
        int[] grade = new int[6];
        int x;

        //first loop//
        //ask for name and grade//
        for (x=1;x<=5;x++){
            System.out.print(x+". Input Name: "); name[x]=cl.next();
            System.out.print(x+". Input Grade: "); grade[x]=cl.nextInt();
        }

        System.out.println("\n-------------------------------------------------\n");
        //Print out name and grade//
        for (x=1;x<=5;x++){
            System.out.println(x+". Name: "+name[x]);
            System.out.println(x+". Grade: "+grade[x]); 
        }
        System.out.println("\n-------------------------------------------------\n");
    }
    //code for clearscreen//
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  
}
