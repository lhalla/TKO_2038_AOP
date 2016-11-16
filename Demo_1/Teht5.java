// Import required classes
import java.util.Scanner;

public class Teht5
{
  public static void main(String[] args)
  {
    // Try to create a scanner-object and catch potential exceptions
    try (Scanner reader = new Scanner(System.in))
    {
      // Declare the number of coefficients
      int nCoef = 3;
      
      // Declare an array for the coefficients
      int[] coef = new int[nCoef];
      
      // Print the description of the method
      System.out.println("This method calculates the roots of a 2nd degree polynomial if it has 2 roots.");
      
      // Ask for and read the coefficients
      for (int idx = 0; idx < nCoef; idx++)
      {
        System.out.print("Please enter a value for (" + Character.toString((char) (97 + idx)) + "):");
        coef[idx] = reader.nextInt();
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
        System.out.println("There are fewer than two roots for the polynomial.");
      }
    }
    catch (java.util.InputMismatchException e)
    {
      System.out.println("ERROR: The input must be an integer!");
      e.printStackTrace();
    }
    catch (Exception e)
    {
      System.out.println("ERROR: Something went wrong! (" + e + ")");
      e.printStackTrace();
    }
  }
}