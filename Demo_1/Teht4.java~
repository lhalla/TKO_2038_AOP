// Import required classes
import java.util.*;
import java.util.regex.*;

public class Teht4
{
  // Define a "simple" email address validation regex pattern
  public static final Pattern SIMPLE_VALIDATION_PATTERN = Pattern.compile("((?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\"))@((?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\]))");
  
  public static void main(String[] args)
  {
    // Try to create a scanner-object and catch potential exceptions
    try (Scanner reader = new Scanner(System.in))
    {
      // Ask for and read an email address
      System.out.println("Please enter your email address.");
      String email = reader.nextLine();
      
      // Find matches from the email with the pattern
      Matcher matcher = SIMPLE_VALIDATION_PATTERN.matcher(email);
      
      // Check if the entered address includes a domain and print the result
      if (matcher.find())
      {
        // Extract the domain from the address
        String domain = matcher.group(2);
        
        // Print the domain
        System.out.println("The domain of the entered address is: " + domain);
      }
      else
      {
        System.out.println("ERROR: The given input is not a valid email address!");
      }
    }
    catch (Exception e)
    {
      System.out.println("ERROR: Something went wrong! (" + e + ")");
      e.printStackTrace();
    }
  }
}