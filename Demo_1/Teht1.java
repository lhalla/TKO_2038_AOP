public class Teht1
{
  public static void main(String[] args)
  {
    // Declare the shortest string
    String shortest = args[0];
    
    // Loop through the args to find the shortest string
    for (String cand : args)
    {
      if (cand.length() < shortest.length())
      {
        shortest = cand;
      }
    }
    
    // Print the shortest string
    System.out.println("The shortest string is: " + shortest);
  }
}