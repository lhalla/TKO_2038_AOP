// Import classes
import java.util.*;

public class Teht6
{
  public static void main(String[] args)
  {
    //======================================================================================
    // REQUEST AND VALIDATE USER INPUT
    //======================================================================================
    
    Scanner s = new Scanner(System.in);
    System.out.println("Anna kaksi lukua:");
    int a = s.nextInt();
    
    while (a < 0)
    {
      System.out.println("Luvun taytyy olla positiivinen. Anna uusi luku:");
      a = s.nextInt();   
    }
    
    System.out.println("Kiitos! Anna seuraava luku:");
    int b = s.nextInt();
    
    //======================================================================================
    // CALCULATE THE SQUARE ROOT OF A
    //======================================================================================
    
    System.out.println(Math.sqrt(a));
    
    System.out.println("----");
    
    //======================================================================================
    // CALCULATE THE GREATEST COMMON DIVISOR
    //======================================================================================
    
    int temp;
    
    while (a > 0)
    {
      temp = a;
      a = b % a;
      b = temp;
    }
    
    //======================================================================================
    // PRINT INTEGERS IN THE INTERVAL [gcd(a,b), 0]
    //======================================================================================
    
    for (int i = b; i >= 0; i--) System.out.println(i);
  }
}