import java.util.*;


public class act3no1
{
    static Scanner cl = new Scanner(System.in);
    public static void main(String[]args)
    {
        clearScreen();
        
        // the string sentinel that was used in the condition//
        String sentinel= "yes";
        //counter//
		int x = 1;

        System.out.println();
		
        //the loop if the sentinel is not equal to no//
        //it will continue to keep counting//
        //unless we input "no" to stop the loop//
		while(sentinel.equalsIgnoreCase("no")!=true)
		{
            //count 1 to 4 every loop//
            System.out.print(x);x++;
            System.out.print("\n"+x);x++;
            System.out.print("\n"+x);x++;
            System.out.print("\n"+x);x++;
            //ask user to input yes or no//
			System.out.print("\nwould you like to continue? (no to end): ");
			sentinel=cl.nextLine();

            
				
		}
        //if we input the final string, it will stop the counting//
		System.out.println("\nCounting is stopped");

    }
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  
}