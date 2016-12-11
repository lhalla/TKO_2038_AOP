package Demo_4;
// Exercise 6

// Import classes
import java.util.Arrays;
import java.util.Scanner;

public class StringToCubeCentre
{
  public static void main(String[] args)
  {
    try (Scanner reader = new Scanner(System.in))
    {
      //========================================================================
      // USER INPUT
      //========================================================================
      
      // Initialise the dimension array
      int[] dims = new int[3];
      
      // Request the char array dimensions
      for (int i = 0; i < 3; i++)
      {
        System.out.println("Please enter a positive integer for the size of the character array in the " + (char)(120 + i) + "-dimension:");
        dims[i] = Integer.parseInt(reader.nextLine());
        if (dims[i] < 1) i--;
      }
      
      // Initialise the 3-dimensional character array
      char[][][] charArray = new char[dims[0]][dims[1]][dims[2]];
      
      // Request a string
      System.out.println("Please enter a string:");
      String input = reader.nextLine();
      
      //========================================================================
      // INSERT THE STRING INSIDE THE ARRAY
      //========================================================================
      
      char[][][] tempArray = insertString(charArray, dims, input);
      
      if (Arrays.equals(charArray, tempArray))
      {
        System.out.println("No string inserted. The given array was not a cube, or the string was too long.");
      }
      else
      {
        charArray = tempArray;
        System.out.println("The string was successfully stored in the array.");
      }
      
    }
    catch (java.util.InputMismatchException e)
    {
      System.out.println("ERROR: Invalid input. The input must be an integer!");
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
  
  /**
   * (INT) Stores a string in the centre of a cubic character array
   * @param arr: The character array
   * @param dim: The dimensions of the array
   * @param str: The string
   */
  private static char[][][] insertString(char[][][] arr, int[] dim, String str)
  {
    
    // Make sure the array is cubic
    if (!(dim[0] == dim[1] && dim[1] == dim[2])) return arr;
    
    // Make sure the string can fit inside the array
    int strLen = str.length();
    if (strLen > dim[0]) return arr;
    
    // Clone the array
    char[][][] arrCopy = new char[dim[0]][dim[1]][dim[2]];
    for (int i = 0; i < dim[0]; i++)
    {
      for (int j = 0; j < dim[1]; j++)
        arrCopy[i][j] = arr[i][j].clone();
    }
    
    // Place the string in the middle along the x-axis
    for (int i = 0; i < strLen; i++)
      arrCopy[(dim[0] - strLen)/2 + i][dim[1]/2][dim[2]/2] = str.charAt(i);
    
    return arrCopy;
  }
}