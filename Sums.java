/* 

Purpose: a recursive method that accepts an integer argument and returns the sum of all the integers from 1 up to the number passed as an argument.
*/

import java.util.Scanner;

public class Sums
{
     
      public static void main(String[] args) 
      {
        
         //Scanner object
         int number = 0; 
         Scanner keyboard = new Scanner(System.in);

         System.out.println("Please enter a postive number:");
         
         number =keyboard.nextInt();
         
         while (number <= 0)
         {
            System.out.println("Error: Please enter a postive number and greater than 0 "); 
            number = keyboard.nextInt();//user should enter the correct number
         }
         //calculate the sum
         int sum = sum(number);
         
         // Output
         System.out.println("The sum from 1 to " + number + " = " + sum);

       }
      
         
      public static int sum(int number)
      {
        if (number <= 0)
            return 0; //base case
         else 
            return number + sum(number-1);  
      }
      

}//ends class

/*




*/ 

