//Import Scanner class
import java.util.Scanner;



public class Casting {
    
    public static void main(String[] args) 
    {
        //declare variables
        //an example of type widening (implicit)
        double num1 = 77;
        
        System.out.println("Num1 is: " + num1);

        //declare variable
        //an example of typpe narrowing (explicit)
        int num2 = (int) 98.456;
        
        System.out.println("Num2 is: " + num2);
    }//end of main
}//end of the class