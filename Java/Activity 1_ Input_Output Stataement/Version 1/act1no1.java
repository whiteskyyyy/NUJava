//library//
import java.util.*;
import javax.swing.*;


//name of the code//
public class act1no1 {
    
    public static void main(String[]args)
	{
        //variables for the main code//
        int bday;
        String msg=" ";
        String name=" ";
        int month;
        int days;
        //ShowInputDialog to display a prompt to ask for the user's name and birthyear//
        name = JOptionPane.showInputDialog("Enter your Name: ");
        bday = Integer.parseInt(JOptionPane.showInputDialog("Enter your Birthyear: "));
        bday=2022-bday;
        month=bday*12;
        days=bday*365;
        //give value to msg variable by putting a string hello and the string name//
        msg="Hello "+ name +"!\nYour age in year is: "+ bday +
        "\nYour age in months is: "+ month +"\nYour age in days is: "+ days;

        
        //Display on the screen the message variable//
        JOptionPane.showMessageDialog(null,msg);

	}
}
