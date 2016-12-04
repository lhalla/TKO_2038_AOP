// Import classes
import java.util.*;

public class Demo3_Teht4
{
  public static void main(String[] args)
  {
    // Create a scanner
    try (Scanner reader = new Scanner(System.in, "UTF-8"))
    {
      //========================================================================
      // USER INPUT
      //========================================================================
      
      System.out.println("Please enter a string:");
      String input = reader.nextLine();
      
      //========================================================================
      // PRINT RESULTS
      //========================================================================
      
      System.out.println("The given string, without special characters, is:");
      System.out.println(poistaErikoismerkit(input));
      
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
  
  /**
   * (STRING) Removes special characters from input string
   * @param mjono A string from which all special characters are to be removed
   */
  public static String poistaErikoismerkit(String mjono)
  {
    // Return the string with all non-alphanumerical characters replaced with
    // spaces
    return mjono.replaceAll("[^A-Z???a-z???0-9]", " ");
  }
}