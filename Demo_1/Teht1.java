public class Teht1
{
  public static void main(String[] args)
  {
    // Check the number of arguments
    if (args.length == 3)
    {
      // Declare string-objects based on the args
      String str1 = args[0];
      String str2 = args[1];
      String str3 = args[2];
      
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
    else
    {
      System.out.println("ERROR: Invalid number of arguments.");
    }
  }
}