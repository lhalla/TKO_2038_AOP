// Import required classes
import java.util.Scanner;
import java.util.HashMap;

public class Teht2
{
  // Declare the class constant for the year used to calculate age
  public static final int YEARCOMPARISON = 2015;
  
  public static void main(String[] args)
  {
    // Try to create a scanner-object and catch potential exceptions
    try (Scanner reader = new Scanner(System.in))
    {
      // Ask for and read the year of birth
      System.out.println("Please enter your year of birth.");
      int yearBirth = reader.nextInt();
      
      // Create and initialise a hashmap for age output
      HashMap<Boolean, String> ageMap = new HashMap();
      ageMap.put(true, " you will be over 18.");
      ageMap.put(false, " you will be under 18.");
      
      System.out.println("At the end of the year " + YEARCOMPARISON + ageMap.get((YEARCOMPARISON - yearBirth) >= 18));
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