//Purpose of this program: calculate the area of a circle using a costant variable

public class AreaCircleConstant 
{
    
    public static void main(String[] args) 
    {
        //declare and initialize variables
        double radius, area;
        radius = 2.369;
        //decalre and initiallize the constant variable
        final double PI = 3.14159;
        
        //calculate the area of the cirlce
        //area equals radius X radius X PI
        area = radius * radius * PI;
        
        
        //display the area of the cirlce
        System.out.println("The area of the circle is: " + area);
        



        
    }//end of main
}//end of the class