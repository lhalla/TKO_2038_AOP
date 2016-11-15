// Import required classes
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Teht4
{
  // Define a simple email address validation regex pattern
  public static final Pattern SIMPLE_VALIDATION_PATTERN = Pattern.compile("^([^.@]+\\.)*[^.@]+@(([^.@]+\\.)+[^.@]+)$");
  
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
    }
  }
}