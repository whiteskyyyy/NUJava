//package for the needed file//
//class file//
package clssob;
import java.util.Scanner;

public class main {
    static Scanner cl = new Scanner(System.in);
    public static void main(String[] args) {


        //first instance object//
        //ask for data needed//
        esports first = new esports();
        System.out.println("First Player: ");
        System.out.println("Input Name: ");
        first.name = cl.next();
        System.out.println("Input Rank (1-10): ");
        first.rank = cl.nextInt();
        System.out.println("Input preferred Game: ");
        first.game = cl.next();
        System.out.println("===================================");

        //second instance object//
        //ask for data needed//
        esports second = new esports();
        System.out.println("Second Player: ");
        System.out.println("Input Name: ");
        second.name = cl.next();
        System.out.println("Input Rank (1-10): ");
        second.rank = cl.nextInt();
        System.out.println("Input preferred Game: ");
        second.game = cl.next();
        System.out.println("===================================");

        //third instance object//
        //ask for data needed//
        esports third = new esports();
        System.out.println("Third Player: ");
        System.out.println("Input Name: ");
        third.name = cl.next();
        System.out.println("Input Rank (1-10): ");
        third.rank = cl.nextInt();
        System.out.println("Input preferred Game: ");
        third.game = cl.next();
        System.out.println("===================================");


        //print out all of data gathered//
        System.out.print("\n\nNumber of players: 3");
        System.out.print("\nFirst Player Stats:");
        System.out.println("\nName: "+first.name);
        System.out.println("Rank: "+first.rank);
        System.out.println("Preferred Game: "+first.game);

        System.out.print("\nSecond Player Stats:");
        System.out.println("\nName: "+second.name);
        System.out.println("Rank: "+second.rank);
        System.out.println("Preferred Game: "+second.game);

        System.out.print("\nThird Player Stats:");
        System.out.println("\nName: "+third.name);
        System.out.println("Rank: "+third.rank);
        System.out.println("Preferred Game: "+third.game);
    }
}
