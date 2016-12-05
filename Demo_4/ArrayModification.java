package Demo_4;
// Exercise 2

// Import classes
import java.util.Arrays;
import java.util.Scanner;

public class ArrayModification
{
  public static void main(String[] args)
  {
    try (Scanner reader = new Scanner(System.in))
    {
      //========================================================================
      // USER INPUT & VARIABLE INITIALISATION
      //========================================================================
      
      // MAIN ARRAY
      
      // Request the main array (to be modified)
      System.out.println("Please enter the integers of the main array (to be modified), separated by spaces:");
      String input = reader.nextLine();
      
      // Split the array into separate numbers
      String[] arrayIntegers = input.split(" ");
      
      // Initialise the main array
      int[] mainArray = new int[arrayIntegers.length];
      
      // Parse the main array
      for (int i = 0; i < mainArray.length; i++)
        mainArray[i] = Integer.parseInt(arrayIntegers[i]);
      
      // COMPARISON ARRAY
      
      // Request the comparison array
      System.out.println("Please enter the integers of the comparison array, separated by spaces:");
      input = reader.nextLine();
      
      // Split the array into separate numbers
      arrayIntegers = input.split(" ");
      
      // Initialise the comparison array
      int[] compArray = new int[arrayIntegers.length];
      
      // Parse the comparison array
      for (int i = 0; i < compArray.length; i++)
        compArray[i] = Integer.parseInt(arrayIntegers[i]);
      
      //========================================================================
      // MODIFY THE MAIN ARRAY
      //========================================================================
      
      modify(mainArray, compArray);
      
      //========================================================================
      // PRINT THE RESULTS
      //========================================================================
      
      System.out.println("The modified main array:");
      System.out.println(Arrays.toString(mainArray));
      
    }
    catch (java.lang.NumberFormatException e)
    {
      System.out.println("ERROR: Invalid input. The input must be an integer!");
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
  
  /**
   * (VOID) Compares to arrays and replaces shared values with 0
   * @param main: The main array on which the replacements are performed
   * @param comp: The comparison array
   */
  public static void modify(int[] main, int[] comp)
  {
    // Iterate over the length of the main array
    for (int i = 0; i < main.length; i++)
    {
      // Iterate over the comparison array
      for (int c : comp)
      {
        // If the comparison array includes the number from the main array,
        // replace it with 0
        if (main[i] == c)
        {
          main[i] = 0;
          break;
        }
      }
    }
  }
}