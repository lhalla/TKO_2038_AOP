// Import classes
import java.util.*;

public class Teht5
{
  public static void main(String[] args)
  {
    // Create a scanner
    try (Scanner reader = new Scanner(System.in))
    {
      //====================================================================================
      // REQUEST AND VALIDATE USER INPUT 1
      //====================================================================================
      
      System.out.print("Please enter the number of strings to be compared (> 1): ");
      int n = Integer.parseInt(reader.nextLine());
      
      // If fewer than two strings are to be compared, throw an exception
      if (n > 1)
      {
        //==================================================================================
        // INITIALISE VARIABLES
        //==================================================================================
        
        String[] strings = new String[n]; // Array of input strings
        int compIndex;                        // Temporary comparison string index
        
        //==================================================================================
        // REQUEST USER INPUT 2
        //==================================================================================
        
        for (int i = 0; i < n; i++)
        {
          System.out.println("Please enter a string (" + (char)(65 + i) + "):");
          strings[i] = reader.nextLine();
        }
        
        //==================================================================================
        // FIND UNIQUE CHARACTERS FOR EACH STRING
        //==================================================================================
        
        // Set the input strings initially as the unique character strings
        String[] uniques = strings.clone();
        
        // Iterate through the strings and compare them with all the other strings
        for (int i = 0; i < n; i++)
        {
          // Iterate through all the strings to remove characters from string (i) that occur
          // in them
          for (int j = 1; j < n; j++)
          {
            // Set the index of the current string to use for comparison
            compIndex = (i + j) % n;
            
            // Iterate over the comparison string and remove characters from (i) that are
            // found in it
            for (char c : strings[compIndex].toCharArray())
              uniques[i] = uniques[i].replace(Character.toString(c),"");
          }
        }
        
        //==================================================================================
        // PRINT THE STRING-SPECIFIC UNIQUE CHARACTER STRINGS
        //==================================================================================
        
        for (int i = 0; i < n; i++)
        {
          System.out.print("The characters unique to the string " + (char)(65 + i) + " are: ");
          System.out.println(unique(uniques[i]));
        }
      }
      else throw new java.lang.NumberFormatException();
    }
    catch (java.lang.NegativeArraySizeException | java.lang.NumberFormatException e)
    {
      System.out.println("ERROR: Invalid input. The input must be a positive integer (> 1)!");
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
  
  // Remove duplicates from a string
  public static String unique(String s)
  {
    //======================================================================================
    // INITIALISE VARIABLES
    //======================================================================================
    
    String uniq = "";
    String temp;
    
    //======================================================================================
    // REMOVE DUPLICATE CHARACTERS FROM THE STRING AND RETURN IT
    //======================================================================================
    
    while (s.length() > 0)
    {
      temp = s.substring(0,1);
      uniq += temp;
      s = s.replace(temp,"");
    }
    return uniq;
  }
}