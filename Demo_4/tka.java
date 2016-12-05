package Demo_4;
// Exercise 4

// Import classes
import java.util.Random;

public class tka
{
  
  // Set a class variable for the range of the array size randomness
  // * Renamed from rvtra to ARRAYSIZERANDOMRANGE: More descriptive
  public static int ARRAYSIZERANDOMRANGE = 11;
  
  public static void main(String[] tk)
  {
    // Initialise variable
    // * Renamed from tka to arrayAverage: More descriptive
    double arrayAverage = 0;
    
    // Loop while arrayAverage (tka) < 5
//    while(checkAverage(arrayAverage))
//    {
      arrayAverage = calculateAverage(generateArray());
//    }
    
    // If arrayAverage < 5, print it, otherwise print 0
//    if(checkAverage(arrayAverage))
//    {
      System.out.println(arrayAverage);
//    }
//    else
//    {
//      System.out.println(0);
//    }
  }
  
  /**
   * (INT[]) Generates a randomly sized integer array
   */
  // * Renamed from tka to generateArray: More descriptive
  public static int[] generateArray()
  {
    // Initialise a random variable
    Random ka = new Random();
    
    // Initialise an integer array of size [7, 17]
    int[] tk = new int[ka.nextInt(ARRAYSIZERANDOMRANGE) + 7];
    
    // Set the value of an array element at index tka as a random value in the
    // range [1, tka + 1]
    for(int tka = 0; tka < tk.length; tka++)
    {
      tk[tka] = ka.nextInt(tka + 1) + 1;
    }
    
    // Return the array
    return tk;
  }
  
  /**
   * (DOUBLE) Calculates the average of an array
   * @param tk: An array used for calculating the average
   */
  // * Renamed from tka to calculateAverage: More descriptive
  private static double calculateAverage(int[] tk)
  {
    // If the length of the array is 0, return 0
    if(tk.length == 0)
      return 0;
    
    // Initialise the variable for average
    int tka = 0;
    
    // Sum all the elements of the array
    for(int tka1 : tk)
    {
      tka += tka1;
    }
    
    // Return the average
    // * Force the result to be double: Better accuracy
    return (double) tka/tk.length;
  }
  
  /**
   * (BOOLEAN) Checks if the input is less than 5
   * @param tka: A double variable
   */
  // * Renamed from tka to checkAverage: More descriptive
  public static boolean checkAverage(double tka)
  {
    return tka < 5;
  }
}
