// Import the Scanner-class
import java.util.Scanner;

public class Teht1
{
  public static void main(String[] args)
  {
    // Try to create a scanner-object and catch potential exceptions
    try (Scanner reader = new Scanner(System.in))
    {      
      // Ask for and read three strings
      System.out.println("Please enter the first string.");
      String str1 = reader.nextLine();
      
      System.out.println("Please enter the second string.");
      String str2 = reader.nextLine();
      
      System.out.println("Please enter the third string.");
      String str3 = reader.nextLine();
      
      // Determine the shortest string(s) and print the result
      if ((str1.length() < str2.length()) && (str1.length() < str3.length()))
      {
        System.out.println("The shortest of the given strings is: " + "\"" + str1 + "\"");;
      }
      else if ((str2.length() < str1.length()) && (str2.length() < str3.length()))
      {
        System.out.println("The shortest of the given strings is: " + "\"" + str2 + "\"");;
      }
      else if ((str3.length() < str1.length()) && (str3.length() < str2.length()))
      {
        System.out.println("The shortest of the given strings is: " + "\"" + str3 + "\"");;
      }
      else if (str1.length() < str3.length() && (str2.length() < str3.length()))
      {
        System.out.println("The shortest of the given strings are: " + "\"" + str1 + "\", \"" + str2 + "\"");
      }
      else if (str1.length() < str2.length() && (str3.length() < str2.length()))
      {
        System.out.println("The shortest of the given strings are: " + "\"" + str1 + "\", \"" + str3 + "\"");
      }
      else if (str2.length() < str1.length() && (str3.length() < str1.length()))
      {
        System.out.println("The shortest of the given strings are: " + "\"" + str2 + "\", \"" + str3 + "\"");
      }
      else
      {
        System.out.println("All of the given strings are equally long.");
      }
    }
    catch (Exception e)
    {
      System.out.println("ERROR: Something went wrong! (" + e + ")");
    }
  }
}