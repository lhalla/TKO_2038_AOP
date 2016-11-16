// Import required classes
import java.util.Random;

public class Test
{
  // Declare a class variable for the maximum of random numbers
  static int SATUNNAISMAX = 15;
  
  public static void main(String[] args)
  {
    // Define the number of runs
    int nRuns = 50000000;
    
    // Initialise the success counter and probability
    int counter = 0;
    double p = 0;
    
    // Do the runs
    for (int cur = 0; cur < nRuns; cur++)
    {
      counter += runTest();
    }
    
    // Calculate the probability
    p = (double) counter/nRuns;
    
    // Print the result
    System.out.println("The probability of the script to succeed is approx. " + 100*p + " %.");
    System.out.println("The average number of runs to get a success is: " + Math.ceil(1/p));
  }
  
  public static int runTest()
  {
    // Create a random-object
    Random r = new Random();
    
    // Generate a pseudorandom integer from the interval [0, SATUNNAISMAX)
    int satunnaisluku = r.nextInt(SATUNNAISMAX);
    
    // Declare an empty string
    String s = "";
    
    // Iterate satunnaisluku + 1 times
    for(int i=0; i<=satunnaisluku; i++)
    {
      // Generate a pseudorandom length from the interval [0, 4)
      int pituus = r.nextInt(4);
      
      // If the length of the string s is less than the generated length, append it with the variable i
      if(s.length() < pituus)
      {
        s += i;
      }
      
      // Parses the current string s into an integer
      if (s.length() > 0)
      {
        int kokonaisluku = Integer.parseInt(s);
        
        
        // If the integer is divisible by 2, replace the string s with half of the parsed integer as a string
        if(kokonaisluku%2 == 0)
        {
          s = (kokonaisluku/2)+"";
        }
      }
    }
    
    // If the final length of the string s is equal to the generatod pseudorandom integer satunnaisluku, the algorithm has succeeded
    if(s.length() == satunnaisluku)
    {
      return 1;
    }
    else
    {
      return 0;
    }
  }
}