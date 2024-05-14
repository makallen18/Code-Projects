/*
I created a program thee Pigs Dice Game. The project was able to tell the players what the game is about, 
tell the player their score after rolling the die, and ask them if they want to roll again. 
To answer if they want to roll or keep playing they just have to type in Y. 
If not then the game restarts.            
*/     

               
import java.util.Random;
import java.util.Scanner;

      
public class PigGame
{
   static Die pigDie = new Die(20);
      public static void main(String[] args)
      {
   //create variable for the numbers of player, number of dice
         int numdice;
         int numplayer;
         Menu();
 
     //Create a Scanner object (import statement)
      Scanner keyboard = new Scanner(System.in);
          
      do
      { 
      int totalScore = 0; 
      boolean notOne = true; 
    //creating an array to tracj scores
    int[] scores = new int[20];
    int index = 0; 
    while (totalScore < 100)
    {
      while (notOne && keepRolling())
      {
        PlayerTurn(scores,index);
        
  
        index ++;
          
      }
      totalScore += getTotal(scores);
      System.out.println("Your total is : " + totalScore);
      scores = new int[20];//sets array back to zero 
    }
      
     }while(keepPlaying());    

}// ends main

 
   
      // Method for a player's turn to play 
     //need to roll die, get value, cheek for 1, 
      public static void PlayerTurn(int[] scores, int index) 
     {
         
         pigDie.roll();
         System.out.println("Roll pigDie : " + pigDie.getValue());
         scores[index] = pigDie.getValue();
       
    }
        
      

  //Method to get the total of all player's scores.
     public static int getTotal(int[]list)
   {
      int sum = 0;
      for (int index = 0; index < list.length; index++)
      {
         sum += list[index];
      }
      return sum; 
   }
  
    
      
//Method 1: KeepPlaying method
//Ask if player wants to play again  
public static boolean keepPlaying()
      {
      	Scanner readIn = new Scanner(System.in);
      	boolean playAgain = false; 
      	System.out.println("Do you want to play again?");
      	String answer = readIn.nextLine().toUpperCase();
      	char ans = answer.charAt(0);
      	if(ans == 'Y')
      		playAgain = true;
      	return playAgain;
      }
//Method 2:keepRolling Method 
//Ask if you want to roll again 
public static boolean keepRolling()
      {
      	Scanner readIn = new Scanner(System.in);
      	boolean playAgain = false; 
      	System.out.println("Do you want to roll again?");
      	String answer = readIn.nextLine().toUpperCase();
      	char ans = answer.charAt(0);
      	if(ans == 'N')
      		playAgain = true;
      	return playAgain;
      }
//Menu Method
//Tells player what the game will be about 
public static void Menu()
      {
      System.out.println("Welcome to the Pig Dice Game!");
      System.out.println("This game is played with you against the computer");
      System.out.println("This game is played with two dice");
      System.out.println("The player that reach the score of 100 wins!");

      }

}// ends class

/*   Welcome to the Pig Dice Game!
 //This game is played with you against the computer
 This game is played with two dice
 The player that reach the score of 100 wins!
 Do you want to roll again?
 yes
 Roll pigDie : 4
 Do you want to roll again?
 yes
 Roll pigDie : 8
 Do you want to roll again?
 yes
 Roll pigDie : 17
 Do you want to roll again?
 yes
 Roll pigDie : 10
 Do you want to roll again?
 yes
 Roll pigDie : 5
 Do you want to roll again?
 yes
 Roll pigDie : 10
 Do you want to roll again?
 yes
 Roll pigDie : 1
 Do you want to roll again?
 yes
 Roll pigDie : 17
 Do you want to roll again?
 yes 
 Roll pigDie : 1
 Do you want to roll again?
 yes 
 Roll pigDie : 2
 Do you want to roll again?
 yes
 Roll pigDie : 18
 Do you want to roll again?
 yes
 Roll pigDie : 16
 Do you want to roll again?
 no
 Your total is : 109
 Do you want to play again?
 no

*/
