package Demo_4;
// Exercise 1

// Import classes
import java.util.Arrays;
import java.util.Scanner;

public class IntegersToArray
{
  public static void main(String[] args)
  {
    try (Scanner reader = new Scanner(System.in))
    {
      //========================================================================
      // USER INPUT
      //========================================================================
      
      // Request and parse the length of the array
      System.out.println("Please give the length of the integer array:");
      int arrayLength = Integer.parseInt(reader.nextLine());
      
      // Request and parse the maximum number to be inserted into the array
      System.out.println("Please give the maximum number to be inserted:");
      int x = Integer.parseInt(reader.nextLine());
      
      //========================================================================
      // INITIALISE VARIABLES
      //========================================================================
      
      int[] intArray = new int[arrayLength]; // An array of the desired length
      
      //========================================================================
      // PERFORM THE INSERTION
      //========================================================================
      
      // Insert the numbers [0, x] to the array, continuing from index 0 when
      // the end of the array is reached and x > arrayLength - 1
      insertIntegers(intArray, x);
      
      //========================================================================
      // PRINT THE RESULTS
      //========================================================================
      
      // Print the resulting array
      System.out.println("The resulting integer array:");
      System.out.println(Arrays.toString(intArray));
      
    }
    catch (java.lang.NumberFormatException e)
    {
      System.out.println("ERROR: Invalid input. The input must be a single integer!");
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
  
  /**
    * (VOID) Inserts integers to an array
    * @param arr: An integer array into which integers will be inserted
    * @param x: The maximum value up to which the integers will be iterated
    */
  public static void insertIntegers(int[] arr, int x)
  {
    // Insert integers up to x into the array, continuing from the first index
    // when the end of the array has been reached
    for (int i = 0; i <= x; i++)
      arr[i % arr.length] = i;
  }
}