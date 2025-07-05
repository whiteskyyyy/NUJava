import java.util.Scanner;

public class activity5no1 {
    static Scanner cl = new Scanner(System.in);
    public static void main(String[] args) {
        
        clearScreen();
        //variables//
        int no[] = new int[9];
        int x,y,z;

        //input number loop//
        for(x=1;x<=7;x++){
            System.out.print(x+ ". Input number: ");
            no[x]=cl.nextInt();
        }

        //sum formula//
        no[8] = no[2] + no[3] + no[4] + no[5] + no[1] + no[6] + no[7];

        System.out.println("\n\n-------------------------------------------------\n\n");

        //display sum//
        System.out.print("Sum of all numbers: "+no[8]);

        //loop for arrangement//
        for (x=1; x<=7;x++)
		{
			for (y=x+1; y<=7;y++)
			{
				if (no[x]>no[y])
				{
					//temp variable use for sorting lowest to highest//
					z=no[x];
					no[x]=no[y];
					no[y]=z;
				}
			}
		}

        System.out.println();
        System.out.print("Arranged numbers (Descending): ");
        System.out.println();
        for(x=7;x>=1;x--){
            System.out.println(x+ ". Number: "+no[x]);
        }

        System.out.println("\n\n-------------------------------------------------\n\n");

}

    //code for clearscreen//
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  
}
