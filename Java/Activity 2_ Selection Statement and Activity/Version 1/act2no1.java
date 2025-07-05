import java.util.*;





public class act2no1
{
    
    static Scanner cl =new Scanner (System.in);
    
    public static void main(String[]args) {
        
        
        //variable//
        int x;           //integer//
        
        //input integer//
        System.out.print("Input a number: "); x=cl.nextInt();
        
        //if else statement//
        if (x % 2 == 0)
        {
            //output EVEN//
            System.out.println("\nThe number is EVEN");
        }
        else
        {
            //output ODD//
            System.out.println("\nThe number is ODD");
        }

        System.out.println("\nEnd.");
    }



}