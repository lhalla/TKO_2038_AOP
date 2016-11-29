// Import classes
import java.util.*;

public class Demo3_Teht6
{
  // Semicolon count: 4
  public static void main(String[] args)
  {
    // Create a scanner
    try (Scanner reader = new Scanner(System.in))
    {
      // Request input from the user
      String inputString = input(reader);
      
      // Request integers from the user and print their sum
      System.out.println("The sum of the entered integers is: " + countSum(reader, countWords(inputString)));
      
      // Check the palindromicity of the input string
      System.out.println(isPalindrome(inputString, inputString.length()));
      
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
  
  /**
   * (STRING) Requests and reads user input
   * @param reader A scanner object used to read user input
   */
  // Semicolon count: 2
  public static String input(Scanner reader)
  {
    // Request and read user input
    System.out.println("Please enter a string:");
    
    // Return the input string
    return reader.nextLine();
  }
  
  /**
   * (INT) Requests and reads user input
   * @param reader A scanner object used to read user input
   * @param n The No. of integers still to be requested
   */
  // Semicolon count: 2
  public static int input(Scanner reader, int n)
  {
    // Request and read user input
    System.out.println("Please enter an integer (" + n + " remaining):");
    
    // Return the input integer
    return reader.nextInt();
  }
  
  /**
   * (INT) Counts the No. of words in input string
   * @param input An input string used for word counting
   */
  // Semicolon count: 1
  public static int countWords(String input)
  {
    // Return the No. of words, separated by spaces, in the input string
    return input.split(" ").length;
  }
  
  /**
   * (INT) Requests a given No. of integers from the user and returns their sum
   * @param reader A scanner object used to read user input
   * @param n The No. of integers to be summed
   */
  // Semicolon count: 3
  public static int countSum(Scanner reader, int n)
  {
    // Initialise the sum
    int sum = 0;
    
    // Sum the requested No. of integers
    while (n > 0)
      sum += input(reader, n--);
    
    // Return the sum
    return sum;
  }
  
  /**
   * (STRING) Checks the palindromicity of a given string
   * @param input A string, that is determined to be, or not to be, a palindrome
   * @param len The length of the input string
   */
  // Semicolon count: 2
  public static String isPalindrome(String input, int len)
  {
    // Format the input string by removing spaces and making all characters
    // lower case
    input = input.replace(" ", "").toLowerCase();
    
    // Return the resulting string
    return checkPalindromity(input, input.length());
  }
  
  /**
   * (STRING) Determines the palindromicity of a given string
   * @param input A string, that will be checked
   * @param len The length of the input string
   */
  // Semicolon count: 4
  public static String checkPalindromity(String input, int len)
  {
    // Compare the beginning and end of the string to determine its
    // palindromicity, return the result
    for (int i = 0; i < len/2; i++)
    {
      if (input.charAt(i) != input.charAt(len - 1 - i))
        return "The input is not a palindrome.";
    }
    
    return "The input is a palindrome.";
  }
}