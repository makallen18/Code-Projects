import java.util.Random; 
public class Die 
{
   private int sides;
   private int value;
   
   public Die()//no argument constructors (default constructors)
   {
      sides = 6;
      roll();
   
   }
   
   public Die(int numSides)
   {
      sides = numSides;
      roll();
   
   }
   
   public void roll()
   {
    Random gen = new Random();
    value = gen.nextInt(sides)+1; 
   }
   
   public int getValue()
   {
      return value; 
   }

}//ends class