// Import classes
import java.util.*;

public class Demo3_Teht1
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
      // PRINT RESULTS
      //========================================================================
      
      if (onkoPalindromi(input.replace(" ", "")))
        System.out.println("The string input \"" + input + "\" is a palindrome.");
      else
        System.out.println("The string input \"" + input + "\" is not a palindrome.");
      
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
  /** 
   * (BOOLEAN) Determines whether or not an argument string is a palindrome
   * @param mjono A string to be checked
   */
  public static boolean onkoPalindromi(String mjono)
  {
    // Calculate the length of the string
    int l = mjono.length();
    
    // Remove spaces and make the whole string lower case
    mjono = mjono.replace(" ", "").toLowerCase();
    
    // Compare the beginning and end of the string to determine its
    // palindromicity, return the result
    for (int i = 0; i < l/2; i++)
    {
      if (mjono.charAt(i) != mjono.charAt(l - 1 - i))
        return false;
    }
    
    return true;
  }
}