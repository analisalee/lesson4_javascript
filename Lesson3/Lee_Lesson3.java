/************************************************************************
 * File Name:   Lee_Lesson3.java
 * 
 * Due Date:    09/28/18
 * 
 * Author:      Analisa Lee
 * 
 * Program Description:  
 *              This program is designed to compute the tax and tip on a restaurant bill. I should display the meal cost, tax, tip, and total bill.
 * 
 * Program Input: meal price, tip, and tax        
 *
 * Program Output: answer the total bill amount       
 *
 * Program Processing: Calculate the tip, tax, and total bill      
 *              
 * **********************************************************************/
 
 
 public class Lee_Lesson3 
 {

    public static void main(String[] args) 
    {
        //declare variables
        final double TAX = .0675;
        final double TIP = .15;
        double taxamount;
        double priceofmeal;
        double taxchargedmeal;
        double tipamount;
        double totalbill;
        
        //initialize variables
        priceofmeal = 92.36;
        
        //calculate the tax amount
        taxamount = priceofmeal * TAX;
        
        //calculate the price of meal with tax
        taxchargedmeal = taxamount + priceofmeal;
        
        //calculate the tip amount
        tipamount = taxchargedmeal * TIP;
        
        //calculate the total bill
        totalbill = taxchargedmeal + tipamount;
        
        //display the location
        System.out.println("\t\t\t\t\t   Seminole Buffett " + "\n\t\t\t\t\t  123 Gaines Street" + "\n\t\t\t\t\tTallahassee, FL 32301");
        
        //display the receipt
        System.out.printf("Reciept Details: \nMeal Cost: %.2f \nTax Amount: %.2f \nTip Amount: %.2f \nTotal Bill: %.2f" , priceofmeal , taxamount , tipamount , totalbill );
  
        //display note at end of reciept
        System.out.println("\n\nThank you for dining with us! \nPlease come again to Seminole Buffett!");
        
    }//end of main

}//end of class