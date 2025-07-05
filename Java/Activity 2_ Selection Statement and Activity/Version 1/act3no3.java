import java.util.*;


public class act3no3 {


    static Scanner cl = new Scanner (System.in);
    
    //variables//
    //public global variables so it can be used in different void trees//
    public static int gen1 = 0, gen2 = 0;
    public static String[] name = new String[20];
    public static int x;
    public static int[] y = new int[20];

    //main code//
    public static void main(String args[]){  
        //clear the screen for much cleaner look//
        clearScreen();

        //first loop, limit to 15 input of name//
        for (x=1;x<=15;x++)
        {
            //ask for the user for names//
            System.out.print(x+ ". What's your name?: "); name[x]=cl.next();

            //nested loop//
            //ask for gender from the user//
            do{
                //input gender of name//
                System.out.print("Input your gender (0 for MALE; 1 for FEMALE): "); 
                y[x]=cl.nextInt();
                //separated code for cleaner look//
                ifs();

            }
            //limitation//
            //input gender will be 1 or 0//
            while(y[x]!= 1 && y[x]!=0);
            //every 2 rounds of loop, clear screen//
            if (x % 2 == 0){
                clearScreen();
            }
        }

        //finish loop, clear screen before displaying number of male and female//
        clearScreen();

        System.out.print("Total Number of MALE: "+gen1);
        System.out.print("\nTotal Number of FEMALE: "+gen2);
    }

    //sub-code for clearscreen//
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  

    //sub-code for if else statement inside the loop//
    public static void ifs()
    {
        //if inputted counter is not 1 or 0//
        //ask user to input correct input//
        if(y[x]!= 1 && y[x]!=0)
        {
            System.out.print("Please input gender 0(MALE) or 1(FEMALE)\n");
        }
        //counter for gender 2 or female//
        if(y[x]==0)
        {
            gen2=gen2+1;
        }
        //counter for gender 1 or male//
        else if(y[x]==1)
        {
            gen1=gen1+1;
        }
    }
}
