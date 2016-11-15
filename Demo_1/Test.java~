public class Test
{
  public static void main(String[] args)
  {
    String email = "lmhalautufi";
    
    // Check if the email address contains a domain
    if (email.contains("@"))
    {
      // Extract the domain from the email address
      String domain = email.substring(email.indexOf('@') + 1);
      
      System.out.println(email.length() - email.replace("@","").length());
      System.out.println(Math.pow(2, email.length() - email.replace("@","").length() - 1));
      
      // Print the domain of the given address
      System.out.println("The domain of the address entered is: " + domain);
    }
    else
    {
      System.out.println(email.indexOf('@'));
      System.out.println("ERROR: The given input is not a valid email address!");
    }
    
  }
}