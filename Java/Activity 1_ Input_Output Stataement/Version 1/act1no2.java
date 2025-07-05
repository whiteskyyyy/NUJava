//library//
import java.util.*;
import javax.swing.*;


//name of the code//
public class act1no2 {
    
    public static void main(String[]args)
	{
        //variables for the main code//
        int first;
        int second;
        int sum;
        String msg = " ";
        //ShowInputDialog to display a prompt to ask for the user's first and second number//
        first = Integer.parseInt(JOptionPane.showInputDialog("First number: "));
        second = Integer.parseInt(JOptionPane.showInputDialog("Second number: "));

        //give value to msg variable//
        sum = first + second;
        msg= first +" + "+ second +" = "+sum;
        
        //Display on the screen the message variable//
        JOptionPane.showMessageDialog(null,msg);

	}
}
