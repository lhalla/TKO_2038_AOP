// Import required classes
import java.util.*;

public class Teht1
{
  public static void main(String[] args)
  {
    try
    {
      // Initialise the list of shortest strings
      TreeSet<String> shorts = new TreeSet<>();
      shorts.add(args[0]);
      
      // Initialise the hashmap for determining the plurality of the shortest strings
      HashMap<Boolean, String> pluralMap = new HashMap<>();
      pluralMap.put(true, " strings are:");
      pluralMap.put(false, " string is:");
      
      // Loop through the args to find the shortest string
      for (int i = 1; i < args.length; i++)
      {
        // If a new shortest string is found, replace the shortest and the list with the candidate
        if (args[i].length() < shorts.first().length())
        {
          shorts.clear();
          shorts.add(args[i]);
        }
        // If a string with an equal length to the shortest is found, add it to the list
        else if (args[i].length() == shorts.first().length())
        {
          shorts.add(args[i]);
        }
      }
      
      // Print the shortest string(s)
      System.out.println("The shortest" + pluralMap.get(shorts.size() > 1));
      System.out.println(Arrays.toString(shorts.toArray()).replace("[","").replace("]",""));
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e)
    {
      System.out.println("ERROR: At least one argument needed!");
      e.printStackTrace();
    }
    catch (Exception e)
    {
      System.out.println("ERROR: Something went wrong! (" + e + ")");
      e.printStackTrace();
    }
  }
}