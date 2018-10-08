//Import Scanner class
import java.util.Scanner;



public class ReadStringEx1 {
    
    public static void main(String[] args) 
    {
        //declare variables
        String fname, mname, lname;
    
        //create a Scanner object 
        //object name is input
        Scanner input = new Scanner (System.in);
        
        //prompt the user for full name
        System.out.print("please enter your full name: ");
        
        //parse the string:
        //read the first name
        fname = input.next();
        
        //read the middle name
        mname = input.next();
        
        //read the last name
        lname = input.nextLine();
        
        //display the results
        System.out.println("your first name: " + fname);
        System.out.println("your middle name: " + mname);
        System.out.println("your last name: " + lname);
        
    }//end of main
}//end of the class