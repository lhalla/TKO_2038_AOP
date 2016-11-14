// Import the Scanner-class
import java.util.Scanner;

public class Teht4
{
  public static void main(String[] args)
  {
    // Try creating a scanner-object and catch potential exceptions
    try (Scanner reader = new Scanner(System.in))
    {
      // Ask for and read an email address
      System.out.println("Please enter your email address.");
      String email = reader.nextLine();
      
      // Check the validity of the entered email address
      if ((email.indexOf('@') > 0)
            && (email.indexOf('@') < email.length() - 1)
            && (email.length() - email.replace("@","").length() == 1)
            && (email.substring(email.indexOf('@') + 1).contains("."))
            && (email.lastIndexOf('.') != email.length() - 1))
      {
        // Extract the domain from the email address
        String domain = email.substring(email.indexOf('@') + 1);
        
        // Print the domain of the email address
        System.out.println(" The domain of the address entered is: " + domain);
      }
      else
      {
        // Print an error message caused by an invalid email address
        System.out.println("ERROR: The given input is not a valid email address!");
      }
    }
    catch (Exception e)
    {
      System.out.println("ERROR: Something went wrong! (" + e + ")");
    }
  }
}