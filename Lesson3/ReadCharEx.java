//Import Scanner class
import java.util.Scanner;



public class ReadCharEx {
    
    public static void main(String[] args) 
    {
        //declare variables
        char middleInt;
        
        String today = "monday"; //string literal
        
        //create scanner object
        //object name is sc
        Scanner sc = new Scanner(System.in);
        
        //prompt user for middle name
        System.out.print("Please enter your middle name: ");
        
        //read the middle initial
        middleInt = sc.next().charAt(0);
        
        //display results
        System.out.println("Your middle initial is: " + middleInt);
        
        System.out.println("today is: " + today);
        
        System.out.println("fourth character of today is: " + today.charAt(3) );
    }//end of main
}//end of the class