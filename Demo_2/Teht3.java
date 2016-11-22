// Import classes
import java.util.*;

public class Teht3
{
  public static void main(String[] args)
  {
    // Create a scanner
    try (Scanner reader = new Scanner(System.in))
    {
      //====================================================================================
      // REQUEST AND VALIDATE USER INPUT
      //====================================================================================
      
      System.out.println("Please enter a positive odd integer:");
      int n = Integer.parseInt(reader.nextLine());
      
      // If the input isn't an odd positive integer, throw an exception
      if (n <= 0 || n % 2 == 0) throw new java.lang.NumberFormatException();
      
      //====================================================================================
      // PRINT THE DIAMOND
      //====================================================================================
      
      System.out.println("Lo and behold!");
      
      // Print the top of the diamond
      for (int i = 1; i <= n; i += 2)
      {
        for (int j = (n - i)/2; j > 0; j--) System.out.print(" ");
        for (int j = 1; j <= i; j++) System.out.print("*");
        System.out.println("");
      }
      
      // Print the bottom of the diamond
      for (int i = n - 2; i >= 1; i-= 2)
      {
        for (int j = 1; j <= (n - i)/2; j++) System.out.print(" ");
        for (int j = i; j > 0; j--) System.out.print("*");
        System.out.println("");
      }
    }
    catch (java.lang.NumberFormatException e)
    {
      System.out.println("ERROR: Invalid input. Input must be a positive odd integer!");
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
}