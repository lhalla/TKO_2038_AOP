// Import classes
import java.util.*;

public class Demo3_Teht2
{
  public static void main(String[] args)
  {
    // Create a scanner
    try (Scanner reader = new Scanner(System.in))
    {
      //========================================================================
      // INITIALISE VARIABLES
      //========================================================================
      
      int n = 0, s = 0; // number of dice, number of sides
      
      //========================================================================
      // USER INPUT
      //========================================================================
      
      while (n < 1)
      {
        System.out.println("Please enter the No. of dice (N):");
        n = Integer.parseInt(reader.nextLine());
      }
      
      while (s < 1)
      {
        System.out.println("Please enter the No. of sides per die (S):");
        s = Integer.parseInt(reader.nextLine());
      }
      
      //========================================================================
      // PRINT RESULTS
      //========================================================================
      
      // Print the results based on the input format and the number of dice
      // thrown
      if (n < 2)
        System.out.println(n + " die with " + s + " sides thrown. Result: " + heitaNoppaa(n, s));
      else
        System.out.println(n + " dice with " + s + " sides thrown. Result: " + heitaNoppaa(n, s));
      
    }
    catch (java.lang.NumberFormatException e)
    {
      System.out.println("ERROR: Invalid input. The input must be a single integer!");
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
  
  /**
   * (INT) Calculates the total of the dice thrown
   * @param n The number of dice to be thrown
   * @param tahkot The number of sides per die
   */
  public static int heitaNoppaa(int n, int tahkot)
  {
    // Initialise the dice random variable
    Random dice = new Random();
    
    // Initialise the total sum
    int total = 0;
    
    // Throw the dice and return the total
    for (int i = 0; i < n; i++)
      total += 1 + dice.nextInt(tahkot);
    
    // Return the total of the throws
    return total;
  }
}