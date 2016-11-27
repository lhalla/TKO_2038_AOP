// Import classes
import java.util.*;

public class Teht2
{
  public final static int OFFSETMAX = 26;
  
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
      Random rnd = new Random();
      int offset = 1 + rnd.nextInt(OFFSETMAX - 1);
      
      //====================================================================================
      // PERFORM CAESAR CIPHER
      //====================================================================================
      
      // Iterate over the input string one character at a time
      for (char c : insecure.toCharArray())
      {
        // If the character is alphabetical, change it to the next one (Z -> A, z -> a),
        // else keep it unchanged
        if ('A' <= c && c <= 'Z')       secure += (char) (((c - 'A' + offset) % 26) + 'A');
        else if ('a' <= c && c <= 'z')  secure += (char) (((c - 'a' + offset) % 26) + 'a');
        else                            secure += c;
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