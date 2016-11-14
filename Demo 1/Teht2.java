// Import the Scanner-class
import java.util.Scanner;

public class Teht2
{
  public static void main(String[] args)
  {
    // Try creating a scanner-object and catch potential exceptions
    try (Scanner reader = new Scanner(System.in))
    {
      // Declare the variable for the year used to calculate age
      int yearCompare = 2015;
      
      // Ask for and read the year of birth
      System.out.println("Please enter your year of birth.");
      int yearBirth = reader.nextInt();
      
      if ((yearCompare - yearBirth) >= 18)
      {
        System.out.println("At the end of the year 2015 you will be over 18.");
      }
      else
      {
        System.out.println("At the end of the year 2015 you will be under 18.");
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