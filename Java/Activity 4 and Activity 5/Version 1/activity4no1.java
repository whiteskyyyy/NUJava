import java.util.*;

public class activity4no1 {
    static Scanner cl = new Scanner (System.in);
    public static void main(String args[]){  
        clearScreen();

        //variables//
        int pass = 0, fail = 0;             //pass or fail counter//
        String[] name = new String[20];     //Array for name, can be used in the loop//
        String[] grade = new String[20];   
        int x;                              //counter//
        int[] y = new int[20];              //array y to add value to pass or fail//

        //first loop, limit to 15 input of name//
        for (x=1;x<=5;x++)
        {
            //ask for the user for names//
            System.out.print(x+ ". Input student's name: "); name[x]=cl.next();

            //nested loop//
            //ask for grades from the user//
            do{
                //input grade of student//
                System.out.print("Input grade of student: "); y[x]=cl.nextInt();

                //counter for pass or fail//
                if(y[x]<75 && y[x]>=50)
                {
                    //if student failed, add count to fail//
                    fail=fail+1;
                    grade[x]= "FAILED";
                    //display student's name if failed//
                    System.out.println(name[x]+" failed the exam");
                }
                
                else if(y[x]>=75&&y[x]<=100)
                {
                    //if student passed, add count to pass//
                    pass=pass+1;
                    grade[x]= "PASSED";
                    //display student's name if passed//
                    System.out.println(name[x]+" passed the exam");
                }

                //if else statement, nested//
                if (y[x]<50 || y[x]>100)
                {
                    //if user input below 50 or above 100//
                    System.out.print("Please input grades 50-100\n");
                }
                else{
                    //if user input 50-100, proceed with loop//
                    System.out.println("\n\nPress Enter to continue");
                    //Press enter to proceed with the code//
                    try{System.in.read();}
                    catch(Exception e){}
                    //clear screen to erase previous displayed data//
                    clearScreen();
                }

            }
            //limitation for do loop//
            //input grades 50-100//
            while(y[x]<50 || y[x]>100);
            
        }

        //displaying pass and fail count//
        System.out.println("\n\n-------------------------------------------------\n\n");
        System.out.print("Number of PASSING students: "+pass);
        System.out.print("\nNumber of FAILING students: "+fail+"\n");
        System.out.println("\n\n-------------------------------------------------\n");

        //loop to display all of the student's name and grade//
        for (x=1;x<=5;x++){
            System.out.println("Student's Name: "+name[x]);
            System.out.println("Your grade: "+y[x]);
            System.out.println(grade[x]);
            System.out.println("\n-------------------------------------------------\n");
        }

        
    }

    //code for clearscreen//
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  
}
