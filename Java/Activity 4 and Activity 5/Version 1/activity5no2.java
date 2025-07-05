import java.util.Scanner;

public class activity5no2 {
    static Scanner cl = new Scanner(System.in);
    public static void main(String[] args) {
        
        clearScreen();
        //variables//
        String no[] = new String[9];
        String z;
        int x,y;

        //input name loop//
        for(x=1;x<=5;x++){
            System.out.print(x+ ". Input Name: ");
            no[x]=cl.nextLine();
        }

        System.out.println("\n\n-------------------------------------------------\n\n");

        //loop for arrangement//
        for (x=1; x<=5;x++)
		{
			for (y=x+1; y<=5;y++)
			{
				if (no[x].compareTo(no[y])>0)
				{
					//temp variable use for sorting lowest to highest//
					z=no[x];
					no[x]=no[y];
					no[y]=z;
				}
			}
		}

        System.out.println();
        System.out.print("Arranged names (Descending): ");
        System.out.println();
        for(x=5;x>=1;x--){
            System.out.println(x+ ". "+no[x]);
        }

        System.out.println("\n\n-------------------------------------------------\n\n");

}

    //code for clearscreen//
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  
}
