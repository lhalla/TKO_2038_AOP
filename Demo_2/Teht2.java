// Import classes
import java.util.*;

public class Teht2
{
  public static void main(String[] args)
  {
    // Create a scanner
    try (Scanner reader = new Scanner(System.in))
    {
      //====================================================================================
      // USER INPUT
      //====================================================================================
      
      System.out.println("Please enter an input to be encrypted:");
      String insecure = reader.nextLine();
      
      //====================================================================================
      // INITIALISE VARIABLES
      //====================================================================================
      
      String secure = "";
      int charInt;
      
      //====================================================================================
      // PERFORM CAESAR ENCRYPTION
      //====================================================================================
      
      // Iterate over the input string one character at a time
      for (char c : insecure.toCharArray())
      {
        // Get the decimal representation of the ASCII character
        charInt = (int) c;
        
        // If the character is alphabetical, change it to the next one (Z -> A), else keep
        // it unchanged
        if (charInt > 64 && charInt < 91)       secure += (char) (65 + ((charInt - 64) % 26));
        else if (charInt > 96 && charInt < 123) secure += (char) (97 + ((charInt - 96) % 26));
        else                                    secure += c;
      }
      
      //====================================================================================
      // PRINT ENCRYPTED STRING
      //====================================================================================
      
      System.out.println("Encrypted output:");
      System.out.println(secure);
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
}