//must import scanner class before public
import java.util.*;

public class ReadInt {
    
    public static void main(String[] args) 
    {
        //declare varaible
        int age;
        
        //create a new Scanner object
        Scanner input = new Scanner (System.in);
        
        //Prompt user for the age
        System.out.print("How old are you? ");
        
        //read the users age using the nextInt method
        //input = the object
        age = input.nextInt();
        
        //display the age +5 to the console
        System.out.println("You will be " + (age + 5) + " in 5 years!");

        
    }//end of main
}//end of the class