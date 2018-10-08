//Import the scanner class
import java.util.Scanner;

public class ComputeAreaInput {
    
    public static void main(String[] args) 
    {
        //declare variables
        final double PI = 3.14159;
        double radius, area;
        
        //create a scanner object called keyboard
        Scanner keyboard = new Scanner (System.in);
        
        //prompt the user to enter the radius
        System.out.print("Enter the radius: ");
        
        //read and initialize the radius 
        radius = keyboard.nextDouble();
        
        //calculate the area
        area = radius * radius * PI;
        
        //dsiplay the results
        System.out.println("The area of the circle is: " + area);
        
        
    }//end of main
}//end of the class