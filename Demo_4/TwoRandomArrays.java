package Demo_4;
// Exercise 5

// Import classes
import java.util.Arrays;
import java.util.Random;

public class TwoRandomArrays
{
  // Set class constants for minimum and maximum array sizes and maximum random
  // integer value
  public static final int MINARRAYSIZE = 3;
  public static final int MAXARRAYSIZE = 16;
  public static final int MAXRANDOMINT = 50;
  
  public static void main(String[] args)
  {
    //==========================================================================
    // INITIALISE VARIABLES
    //==========================================================================
    
    Random rnd = new Random();
    
    // Initialise the random-sized integer arrays
    int[] arrayOne = new int[MINARRAYSIZE + rnd.nextInt(MAXARRAYSIZE - MINARRAYSIZE + 1)];
    int[] arrayTwo = new int[MINARRAYSIZE + rnd.nextInt(MAXARRAYSIZE - MINARRAYSIZE + 1)];
    
    //==========================================================================
    // FILL THE ARRAYS AND PRINT THEM
    //==========================================================================
    
    randomFill(rnd, arrayOne);
    System.out.println("The first array is:\n" + Arrays.toString(arrayOne));
    
    randomFill(rnd, arrayTwo);
    System.out.println("The second array is:\n" + Arrays.toString(arrayTwo));
    
    //==========================================================================
    // PRINT THE RESULTS
    //==========================================================================
    
    if (arrayOne.length == arrayTwo.length)
      checkArrayEquality(arrayOne, arrayTwo);
    else
      printShortestArray(arrayOne, arrayTwo);
    
  }
  
  /**
   * (VOID) Fills an array with random integers which are not divisible by 4
   * @param rnd: A Random object used to generate random integers
   * @param arr: An array to be filled
   */
  private static void randomFill(Random rnd, int[] arr)
  {
    // Initialise the variable for the random integers
    int rndInt;
    
    // Iterate over the array
    for (int i = 0; i < arr.length; i++)
    {
      // Generate a random integer
      rndInt = 2*rnd.nextInt(MAXRANDOMINT);
      
      // If the random integer is not divisible by 4, inser it into the array
      if (rndInt % 4 != 0)
        arr[i] = rndInt;
      else
        i--;
    }
  }
  
  /**
   * (VOID) Checks whether or not two arrays are equal and then prints the result
   * @param arr1: The first array
   * @param arr2: The second array
   */
  public static void checkArrayEquality(int[] arr1, int[] arr2)
  {
    if (Arrays.equals(arr1, arr2))
      System.out.println("The arrays are equal.");
    else
      System.out.println("The arrays are not equal.");
  }
  
  /**
   * (VOID) Prints the shorter of two arrays
   * @param arr1: The first array
   * @param arr2: The second array
   */
  public static void printShortestArray(int[] arr1, int[] arr2)
  {
    System.out.println("The shorter array is:");
    if (arr1.length < arr2.length)
      System.out.println(Arrays.toString(arr1));
    else
      System.out.println(Arrays.toString(arr2));
  }
}