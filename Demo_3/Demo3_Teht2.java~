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
      // USER INPUT
      //========================================================================
      
      System.out.println("Please enter the No. of dice (N), or N and the No. of sides (S) in NdS format:");
      String input = reader.nextLine();
      
      //========================================================================
      // INITIALISE VARIABLES
      //========================================================================
      
      int n, dN;                       // number of dice, number of sides
      String[] NdS = input.split("d"); // string array split from input
      
      // If both n and dN were given in the first input, parse them. Otherwise
      // ask for dN
      if (NdS.length == 2)
      {
        // Parse n
        System.out.println("Input format NdS detected.\nParsing N...");
        n = Integer.parseInt(NdS[0]);
        
        // Parse dN
        System.out.println("Parsing S...");
        dN = Integer.parseInt(NdS[1]);
      }
      else
      {
        // Parse n
        n = Integer.parseInt(NdS[0]);
        
        // Request and parse dN
        System.out.println("Please enter the number of sides per die:");
        dN = Integer.parseInt(reader.nextLine());
      }
      
      //========================================================================
      // PRINT RESULTS
      //========================================================================
      
      // Print the results based on the input format and the number of dice
      // thrown
      if (NdS.length == 2)
        System.out.println(n + "d" + dN + " thrown. Result: " + heitaNoppaa(n, dN));
      else if (n == 1)
        System.out.println(n + " die with " + dN + " sides thrown. Result: " + heitaNoppaa(n, dN));
      else
        System.out.println(n + " dice with " + dN + " sides thrown. Result: " + heitaNoppaa(n, dN));
      
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