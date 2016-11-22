// Import classes
import java.util.*;

public class Teht4
{
  public static void main(String[] args)
  {
    // Create a scanner
    try (Scanner reader = new Scanner(System.in))
    {
      //====================================================================================
      // REQUEST USER INPUT
      //====================================================================================
      
      System.out.println("Please enter a string:");
      String inputString = reader.nextLine();
      
      //====================================================================================
      // INITIALISE VARIABLES
      //====================================================================================
      
      String outputString = "";
      int idx;
      
      //====================================================================================
      // "SORT" THE STRING
      //====================================================================================
      
      // Iterate through the input string while it's not empty
      while (!inputString.isEmpty())
      {
        // Add the first remaining character (Current Character, CC) of the input string to
        // the output string
        outputString += inputString.charAt(0);
        
        // Remove the first instance of the CC from the input string
        inputString = inputString.substring(1);
        
        // Determine if there are more instances of the CC left
        idx = inputString.indexOf(outputString.charAt(outputString.length() - 1));
        
        // While there are instances of the CC left in the input string, add them to the
        // output string and remove from the input string
        while (idx != -1)
        {
          // Add an instance of the CC to the output string
          outputString += inputString.charAt(idx);
          
          // Remove an instance of the CC from the input string
          inputString = inputString.substring(0, idx) + inputString.substring(idx + 1);
          
          // Determine if there are more instances of the CC left
          idx = inputString.indexOf(outputString.charAt(outputString.length() - 1));
        }
      }
      
      //====================================================================================
      // PRINT THE "SORTED" STRING
      //====================================================================================
      System.out.println("The \"sorted\" output:");
      System.out.println(outputString);
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
}