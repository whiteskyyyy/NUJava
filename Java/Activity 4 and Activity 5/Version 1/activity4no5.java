public class activity4no5 {

    //public variabless//
    //can be used everywhere//
    public static int row;
    public static int column;
    public static void main(String[] args) {
        
        clearScreen();
        //array variable for stuff//
        int[][] stuff = new int[5][10];

        //give value to stuff using the sub-code//
        stuff = Table (5,10);
    
        //loop for creating the table//
        for (row = 0; row < stuff.length ; row++)
        {
            //nested loop//
            for (column = 0; column < stuff[row].length; column++)
            {
                //display the value of stuff//
                //printf for format %5d spacing for each number//
                System.out.printf("%5d",stuff[row][column]);
            }
            //spacing downward
            System.out.println();
            System.out.println();
    
        }
    }
    
    //sub-code//
    //used int r and int c to ask for two prompt always//
    public static int[][] Table (int r, int c) {
        //array yes//
        int [][] yes = new int[r][c];

        //for loop//
        for (row = 0; row < yes.length ; row++)
        {
            for (column = 0; column < yes[row].length; column++)
            {
                //formula calculation for each number//
                yes[row][column] = (row+1)*(column+1);
            }
    
        }
        return yes;
    }

    //code for clearscreen//
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  

    }