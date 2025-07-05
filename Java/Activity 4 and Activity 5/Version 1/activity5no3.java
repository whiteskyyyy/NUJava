import java.util.Scanner;

public class activity5no3 {
    static Scanner cl = new Scanner(System.in);
    public static void main(String[] args) {
        
        clearScreen();
        //variables//
        int no[] = new int[9];
        String nm[] = new String[9];
        int x,y,z;

        //input number loop//
        for(x=1;x<=5;x++){

            System.out.print(x+ ". Input Name: ");
            nm[x]=cl.next();

            System.out.print(x+ ". Input Grade: ");
            no[x]=cl.nextInt();
        }

        System.out.println("\n\n-------------------------------------------------\n\n");
        System.out.println();
        System.out.print("Arranged based on input (Not Sorted): ");
        System.out.println();
        for(x=1;x<=5;x++){
            System.out.printf("%-20s %s\n",x+". " +nm[x], no[x]);

        }

        //loop for arrangement//
        for (x=1; x<=5;x++)
		{
			for (y=x+1; y<=5;y++)
			{
				if (no[x]>no[y])
				{
					//temp variable use for sorting lowest to highest//
					z=no[x];
					no[x]=no[y];
					no[y]=z;

					nm[8]=nm[x];
					nm[x]=nm[y];
					nm[y]=nm[8];
				}
			}
		}
        System.out.println("\n\n-------------------------------------------------\n\n");
        System.out.println();
        System.out.print("Arranged based on grades (Ascending): ");
        System.out.println();
        for(x=1;x<=5;x++){
            System.out.printf("%-20s %s\n",x+". " +nm[x], no[x]);

        }

        System.out.println("\n\n-------------------------------------------------\n\n");

}

    //code for clearscreen//
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  
}
