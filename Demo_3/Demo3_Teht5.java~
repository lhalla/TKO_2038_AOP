// Import classes
import java.util.*;

public class Demo3_Teht5
{
  public static void main(String[] args)
  {
    // Create a scanner
    try (Scanner reader = new Scanner(System.in))
    {
      //========================================================================
      // USER INPUT
      //========================================================================
      
      System.out.println("Please enter a string:");
      String input = reader.nextLine();
      
      //========================================================================
      // INITIALISE VARIABLES
      //========================================================================
      
      // Initialise a hashmap for counting the occurrences of characters
      Map<Character, Integer> charCount = new HashMap<>();
      
      // Initialise the print modifier
      double nMod = 2;
      
      //========================================================================
      // COUNT THE CHARACTERS
      //========================================================================
      
      // Iterate through the input string. If a new character is found, add it
      // to the hashmap with a count of 1. Otherwise increase the count by 1.
      for (char c : input.toCharArray())
      {
        if (!charCount.containsKey(c))
          charCount.put(c, 1);
        else
          charCount.put(c, charCount.get(c) + 1);
      }
      
      //========================================================================
      // PRINT RESULTS
      //========================================================================
      
      printStars(input, charCount, nMod);
      
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
  
  /**
   * (VOID) Prints a number of asterisks based on the input string
   * @param input A string that determines the pattern of the printed asterisks
   * @param charCount A hashmap that includes the number of occurrences of each
   *                  of the characters in the string
   * @param nMod A multiplier for determining the final number of asterisks
   */
  public static void printStars(String input, Map<Character, Integer> charCount, double nMod)
  {
    // Print the length of the input string
    System.out.println(input.length());
    
    // Print a No. of asterisks equal to the length of the input string
    printStars(input.length(), nMod);
    
    // Iterate over the input string and each time print a No. of asterisks
    // equal to the No. of occurrences of that character
    for (char c : input.toCharArray()) printStars(charCount.get(c), nMod);
    
    // Print a No. of asterisks equal to the length of the input string
    printStars(input.length(), nMod);
  }
  
  /**
   * (VOID) Prints the requested number of asterisks on the same line
   * @param n The number of asterisks to be printed
   * @param nMod A multiplier for the number of printed asterisks
   */
  public static void printStars(int n, double nMod)
  {
    // Print the requested No. of asterisks on the same line
    for (int i = 0; i < (int) (n*nMod); i++) System.out.print("*");
    System.out.println("");
  }
}