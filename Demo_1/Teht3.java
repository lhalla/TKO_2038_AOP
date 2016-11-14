// Import the Random-class
import java.util.Random;

public class Teht3
{
  // Declare a global variable for the maximum of random numbers
  static int SATUNNAISMAX = 15;
  
  public static void main(String[] q)
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
      System.out.print("i = " + i + ", L = " + s.length() + ", s = " + s + " | ");
      if(s.length() < pituus)
      {
        s += i;
      }
      System.out.println("i = " + i + ", L = " + s.length() + ", s = " + s);
      
      // Parses the current string s into an integer
      int kokonaisluku = Integer.parseInt(s);
      
      // If the integer is divisible by 2, replace the string s with half of the parsed integer as a string
      if(kokonaisluku%2 == 0)
      {
        s = (kokonaisluku/2)+"";
      }
    }
    
    // If the final length of the string s is equal to the generatod pseudorandom integer satunnaisluku, the algorithm has succeeded
    if(s.length() == satunnaisluku)
    {
      System.out.println("Algoritmi onnistui.");
    }
    else
    {
      System.out.println("Algoritmi ei tällä kertaa onnistunut.");
    }
  }
}