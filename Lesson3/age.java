//import the Scanner class
import java.util.*;

public class age {
    
    public static void main(String[] args) 
    {
        //declare variables
        int num1, num2, sum, product, modulus;
        
        //create scanner object
        //object name is keyboard
        Scanner keyboard = new Scanner(System.in);
        
        //prompt the user for the first number
        System.out.print("Please enter the first number: ");
        
        //read the first number
        num1 = keyboard.nextInt();
        
        //prompt the user for the second number
        System.out.print("Please enter the second number: ");
        
        //read the second number
        num2 = keyboard.nextInt();
        
        //calculate the sum
        sum = num1 + num2;
        
        //calculate the product
        product = num1 * num2;
        
        //calculate the modulus
        modulus = num1 % num2;
        
        //display the results
        System.out.println("The sum is: " + sum);
        System.out.println("The product is: " + product);
        System.out.println("The modulus is: " + modulus);

        
    }//end of main
}//end of the class