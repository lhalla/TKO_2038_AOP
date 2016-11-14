// Import the Scanner-class
import java.util.Scanner;

public class Teht6
{
  public static void main(String[] args)
  {
    // Create a scanner-object
    Scanner reader = new Scanner(System.in);
    
    // Ask for and read two strings
    System.out.println("Please enter a string (A).");
    String A = reader.nextLine();
    
    System.out.println("Please enter another string (B).");
    String B = reader.nextLine();
    
    // Close the scanner
    reader.close();
    
    // Print the modified string A
    System.out.print("The string A, when all occurrences of B are made upper case, is: ");
    System.out.println(A.replaceAll(B,B.toUpperCase()));
  }
}