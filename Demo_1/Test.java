import java.util.Scanner;

public class Test
{
  public static final int KMAX = 3;
  
  public static void main(String[] args)
  {
    Scanner reader = new Scanner(System.in);
    int[] luku = new int[KMAX];
    for (int idx = 0; idx < KMAX; idx++)
    {
      System.out.println("Anna kokonaisluku " + Character.toString((char) (97 + idx)));
      luku[idx] = reader.nextInt();
    }
    System.out.println(luku[0]);
    reader.close();
  }
}