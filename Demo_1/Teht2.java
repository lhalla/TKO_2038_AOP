// Import required classes
import java.util.*;

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
      HashMap<Boolean, String> ageMap = new HashMap<>();
      ageMap.put(false, "over");
      ageMap.put(true, "under");
      
      // Print the result
      System.out.println("At the end of the year " + YEARCOMPARISON + " you will be " + ageMap.get((YEARCOMPARISON - yearBirth) < 18) + " 18.");
    }
    catch (java.util.InputMismatchException e)
    {
      System.out.println("ERROR: Invalid input type. The input must be an integer!");
    }
    catch (Exception e)
    {
      System.out.println("ERROR: Something went wrong! (" + e + ")");
      e.printStackTrace();
    }
  }
}