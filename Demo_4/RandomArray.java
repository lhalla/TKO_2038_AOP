package Demo_4;
// Exercise 3

// Import classes
import java.util.Arrays;
import java.util.Random;

public class RandomArray
{
  // Set class constants for minimum and maximum array sizes and maximum random
  // integer value
  public static final int MINARRAYSIZE = 3;
  public static final int MAXARRAYSIZE = 16;
  public static final int MAXRANDOMINT = 1000;
  
  public static void main(String[] args)
  {
    try
    {
      //========================================================================
      // INITIALISE VARIABLES
      //========================================================================
      
      Random rnd = new Random();
      
      // Generate an integer array with a random size
      int[] array = new int[MINARRAYSIZE + rnd.nextInt(MAXARRAYSIZE - MINARRAYSIZE + 1)];
      
      // Generate an integer array for the back-ups of the values to be replaced
      // from the original array
      int[] backup = new int[rnd.nextInt(Math.min(3, MINARRAYSIZE)) + 1];
      
      //========================================================================
      // FILL THE ORIGINAL ARRAY AND BACK IT UP
      //========================================================================
      
      // Iterate over the original array and insert random positive integers in
      // it
      randomFill(rnd, array);
      
      // Make a backup of the original array
      int[] arrayCopy = array.clone();
      
      //========================================================================
      // REPLACE VALUES
      //========================================================================
      
      // Replace randomly chosen values from the original array and back them up
      replace(rnd, array, backup);
      
      //========================================================================
      // PRINT RESULTS
      //========================================================================
      
      print(array, arrayCopy, backup);
      
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
  
  /**
   * (VOID) Fills an array with random integers
   * @param rnd: A Random object used to generate random integers
   * @param arr: An integer array to be filled
   */
  public static void randomFill(Random rnd, int[] arr)
  {
    // Iterate over the original array and insert random positive integers in
    // it
    for (int i = 0; i < arr.length; i++)
      arr[i] = rnd.nextInt(MAXRANDOMINT);
  }
  
  /**
   * (VOID) Replaces values of an integer array with -1
   * @param rnd: A Random object used to generate random integers
   * @param arr: The integer array in which the replacements are performed
   * @param backup: The backup array where the replaced values are saved
   */
  public static void replace(Random rnd, int[] arr, int[] backup)
  {
    // Initialise the random index variable
    int rndIndex;
    
    // Replace randomly chosen elements of arr with -1
    for (int i = 0; i < backup.length; i++)
    {
      // Choose a random index
      rndIndex = rnd.nextInt(arr.length);
      
      // If the value at the index has not yet been replaced, replace it
      if (arr[rndIndex] != -1)
      {
        backup[i] = arr[rndIndex];
        arr[rndIndex] = -1;
      }
      else
        i--;
    }
  }
  
  /**
   * (VOID) Prints the original, modified and backup arrays
   * @param arr: The modified integer array
   * @param arrCopy: A copy of the original integer array
   * @param backup: An array with backups of the replaced values
   */
  public static void print(int[] arr, int[] arrCopy, int[] backup)
  {
    // Print the original array
    System.out.println("The original, randomly generated array of integers:");
    System.out.println(Arrays.toString(arrCopy));
    
    // Print the modified array
    System.out.println("The modified array:");
    System.out.println(Arrays.toString(arr));
    
    // Print the backup array
    System.out.println("The replaced value(s):");
    System.out.println(Arrays.toString(backup));
  }
}