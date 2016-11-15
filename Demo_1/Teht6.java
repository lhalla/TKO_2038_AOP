// Import required classes
import java.util.Scanner;

public class Teht6
{
  public static void main(String[] args)
  {
    // Try to create a scanner-object and catch potential exceptions
    try (Scanner reader = new Scanner(System.in))
    {
      // Ask for and read two strings
      System.out.println("Please enter a string (A).");
      String a = reader.nextLine();
      
      System.out.println("Please enter another string (B).");
      String b = reader.nextLine();
      
      // Create a modified version of A by replacing every occurrence of the string B in it with upper case characters
      String aMod = a.replaceAll(b, b.toUpperCase());
      
      // Print the modified string A
      System.out.print("The string A, when all occurrences of B are in upper case, is: ");
      System.out.println(aMod);
    }
    catch (Exception e)
    {
      System.out.println("ERROR: Something went wrong! (" + e + ")");
    }
  }
}