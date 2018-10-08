//Import Scanner class
import java.util.Scanner;



public class ReadError {
    
    public static void main(String[] args) 
    {
        //declare variable
        int age;
        double gpa;
        String city;
        
        //Scanner object
        //object name is sc
        Scanner sc = new Scanner(System.in);
        
        //prompt the user for age and gpa
        System.out.print("How old are you? and what is your gpa? ");
        
        //read the age
        age = sc.nextInt();
        
        //read the gpa
        gpa = sc.nextDouble();
        
        //we can remove the newline character from the buffer to fix the error
        //sc.nextLine();
        
        //display the age and gpa
        System.out.println("your age is: " + age + " and your gpa is: " + gpa);
        //prompt user for city
        System.out.print("what city are you from? ");
        
        //read the city
        //or just use next() for one word answers to fix the errors
        city = sc.next();
        
        //display the city
        System.out.println("city of " + city);
        
    }//end of main
}//end of the class