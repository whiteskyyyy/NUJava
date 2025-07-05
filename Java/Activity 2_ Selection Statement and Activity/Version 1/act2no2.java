import java.util.*;






public class act2no2
{
    
    static Scanner cl =new Scanner (System.in);
    
    public static void main(String[]args) {
        
        
        //variables//
        String name;
        double qz=0;           //final average//
        double qz1, qz2, qz3, qz4; //scores//
        
        //input the scores//
        //student’s four examination scores//
        System.out.print("Student's Name: "); name=cl.nextLine();
        System.out.print("First Exam Score: "); qz1=cl.nextInt();
        System.out.print("Second Exam Score: "); qz2=cl.nextInt();
        System.out.print("Third Exam Score: "); qz3=cl.nextInt();
        System.out.print("Fourth Exam Score: "); qz4=cl.nextInt();
        
        //formula for scores//
        //compute for the average and converts the average to an equivalent numerical grade//
        qz=(qz1+qz2+qz3+qz4)/4;
        //output of qz//
        System.out.print("\n\n"+name +"'s Grades: ");
        System.out.print("\nFinal Grade: "+ qz);
        //if else statement//
        //conditions for each and equivalent grades if conditions are met//
        if (qz>=96)
        {
            System.out.println("\nEquivalent Grade: 4.0");
            System.out.println("\nLetter Grade: P");
            System.out.println("\nCongratulations!");
        }
        //conditions for each and equivalent grades if conditions are met//
        else if (qz>=90&&qz<96)
        {
            System.out.println("\nEquivalent Grade: 3.5");
            System.out.println("\nLetter Grade: P");
            System.out.println("\nCongratulations!");
        }
        //conditions for each and equivalent grades if conditions are met//
        else if (qz>=84&&qz<90)
        {
            System.out.println("\nEquivalent Grade: 3.0");
            System.out.println("\nLetter Grade: P");
            System.out.println("\nCongratulations!");
        }
        //conditions for each and equivalent grades if conditions are met//
        else if (qz>=78&&qz<84)
        {
            System.out.println("\nEquivalent Grade: 2.5");
            System.out.println("\nLetter Grade: P");
            System.out.println("\nCongratulations!");
        }
        //conditions for each and equivalent grades if conditions are met//
        else if (qz>=72&&qz<78)
        {
            System.out.println("\nEquivalent Grade: 2.0");
            System.out.println("\nLetter Grade: P");
            System.out.println("\nCongratulations!");
        }
        else if (qz>=66&&qz<72)
        //conditions for each and equivalent grades if conditions are met//
        {
            System.out.println("\nEquivalent Grade: 1.5");
            System.out.println("\nLetter Grade: P");
            System.out.println("\nCongratulations!");
        }
        //conditions for each and equivalent grades if conditions are met//
        else if (qz>=60&&qz<66)
        {
            System.out.println("\nEquivalent Grade: 1.0");
            System.out.println("\nLetter Grade: P");
            System.out.println("\nCongratulations!");
        }
        //conditions for each and equivalent grades if conditions are met//
        else 
        {
            System.out.println("\nEquivalent Grade: 0.0");
            System.out.println("\nLetter Grade: R");
            System.out.println("\nUnfortunately, you failed.");
        }
        System.out.println("\nEnd.");
    }



}