// Import required classes
import java.util.Scanner;

public class Teht5
{
  public static void main(String[] args)
  {
    // Try to create a scanner-object and catch potential exceptions
    try (Scanner reader = new Scanner(System.in))
    {
      // Ask for and read three integers a, b and c
      System.out.println("Please enter an integer (a).");
      int a = reader.nextInt();
      
      System.out.println("Please enter an integer (b).");
      int b = reader.nextInt();
      
      System.out.println("Please enter an integer (c).");
      int c = reader.nextInt();
      
      // Calculate the determinant
      double det = b*b - 4*a*c;
      
      // If there are two roots, calculate them
      if (det > 0)
      {
        // Calculate the square root of the determinant
        det = Math.sqrt(det);
        
        // Calculate the roots
        double root1 = (-b + det)/(2*a);
        double root2 = (-b - det)/(2*a);
        
        System.out.println("Two roots exist, and they are:");
        System.out.println("x_1 = " + root1);
        System.out.println("x_2 = " + root2);
      }
      else
      {
        System.out.println("There are fewer than two roots.");
      }
    }
    catch (java.util.InputMismatchException e)
    {
      System.out.println("ERROR: The input must be an integer!");
    }
    catch (Exception e)
    {
      System.out.println("ERROR: Something went wrong! (" + e + ")");
    }
  }
}