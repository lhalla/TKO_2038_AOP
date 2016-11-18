// Import required classes
import java.util.*;

public class Teht5
{
  public static void main(String[] args)
  {
    // Try to create a scanner-object and catch potential exceptions
    try (Scanner reader = new Scanner(System.in))
    {
      // Declare an array for the coefficients
      int[] coef = new int[3];
      
      // Print the description of the method
      System.out.println("This method calculates the roots of a polynomial a*x^2 + b*x + c, if it has 2 roots.");
      
      // Ask for and read the coefficients
      for (int idx = 0; idx < 3; idx++)
      {
        System.out.print("Please enter a value for (" + Character.toString((char) (97 + idx)) + "):");
        coef[idx] = Integer.parseInt(reader.nextLine());
      }
      
      // Calculate the determinant
      double det = coef[1]*coef[1] - 4*coef[0]*coef[2];
      
      // If there are two roots, calculate them
      if ((det > 0) && (coef[0] != 0))
      {
        // Calculate the square root of the determinant
        det = Math.sqrt(det);
        
        // Calculate the roots
        double[] roots = {(-coef[1] + det)/(2*coef[0]), (-coef[1] - det)/(2*coef[0])};
        
        System.out.println("Two roots exist for the polynomial, and they are:");
        System.out.println("x_1 = " + roots[0]);
        System.out.println("x_2 = " + roots[1]);
      }
      else
      {
        System.out.println("Fewer than two roots exist for the polynomial.");
      }
    }
    catch (java.util.InputMismatchException | java.lang.NumberFormatException e)
    {
      System.out.println("ERROR: Invalid input type. The input must be a single integer!");
    }
    catch (Exception e)
    {
      System.out.println("ERROR: Something went wrong! (" + e + ")");
      e.printStackTrace();
    }
  }
}