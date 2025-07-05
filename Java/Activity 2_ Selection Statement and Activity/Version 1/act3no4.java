import java.util.*;



public class act3no4 {
    static Scanner cl = new Scanner (System.in);

    //main code//
    public static void main(String args[]){  
        
        //variables//
        int x,fact=1;  
        int number;

        //ask user for input//
        System.out.print("input a number: "); number=cl.nextInt();

        //loop for factorial//
        //formula using the counter variable//
        for(x=number;x>=1;x--){
            //print out the long version of vactorial//
            System.out.print("("+x+")");    
            fact=fact*x;
            
        } 
        //display the value of factorial//
        System.out.println("\nFactorial of "+number+" is: "+fact);    
       }  
      }  
