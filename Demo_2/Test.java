import java.util.*;

public class Test
{
  public static void main(String[] args)
  {
    final int KYSYMYKSET = 5;
    final int MAXPITUUS = 2;
    final Random r = new Random();
    
    char merkki;
    String merkit = "";
    for(int kysymys=0; kysymys<KYSYMYKSET; kysymys = kysymys+1){
      int pituus = 1+r.nextInt(MAXPITUUS);
      for(int i=0; i<pituus; i = i+1) {
        merkki = (char)(49+r.nextInt(90-49));
        merkit += merkki;
      }
      
      int vastaus = 0;
      int oikeaVastaus = 0;
      for(int i = 0; i< merkit.length(); i = i+1){
        vastaus = vastaus + merkkijonoLuvuksi(i, merkit);
      }
      
      System.out.println(merkit + " = " + vastaus);
    }
    
  }
  
  public static int merkkijonoLuvuksi(int i, String s)
  {
    char c = s.charAt(i);
    
    if (c < '0' || '9' < c) return 3;
    else return Integer.parseInt(s.substring(i,i+1));
  }
}