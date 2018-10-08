//Import Scanner class
import java.util.Scanner;


public class ReadName {
    
    public static void main(String[] args) 
    {
        //declare variables
        String fname;
        
        //create a scanner object
        Scanner input = new Scanner(System.in);
        
        //prompt user for full name
        System.out.print("Please enter your full name: ");
        
        //Parse the string to return the first name
        fname = input.next();
        
        //display the first name only
        System.out.println("Thanks " + fname + "!");
        
    }//end of main
}//end of the class