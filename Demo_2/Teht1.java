// Import classes
import java.util.*;

public class Teht1
{
  public static void main(String[] args)
  {
    // Create a scanner
    try (Scanner reader = new Scanner(System.in))
    {
      //====================================================================================
      // REQUEST AND VALIDATE USER INPUT
      //====================================================================================
      
      System.out.print("Please enter an integer (n): ");
      int n = Integer.parseInt(reader.nextLine());
      
      if (n <= 0) throw new java.lang.NumberFormatException();
      
      //====================================================================================
      // INITIALISE VARIABLES
      //====================================================================================
      
      int[] f = new int[]{0, 1};  // An array with the latest and the next Fibonacci #
      
      //====================================================================================
      // ITERATE AND PRINT OUTPUT
      //====================================================================================
      
      System.out.println("Output:");
      for (int i = 1; i <= n; i++) System.out.print(nextF(f) + " " + i*i + " ");
      System.out.println("");
    }
    catch (java.lang.NumberFormatException e)
    {
      System.out.println("ERROR: Invalid input type. The input must be a positive integer!");
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
  
  //========================================================================================
  // CALCULATE THE NEXT FIBONACCI NUMBER
  //========================================================================================
  public static int nextF(int fib[])
  { 
    int tmp = fib[0];
    fib[0] = fib[1];
    fib[1] += tmp;
    return fib[0];
  }
}