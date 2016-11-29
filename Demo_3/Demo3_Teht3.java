import java.util.Random;
import java.util.Scanner;

public class Demo3_Teht3
{
  
  public static void main(String[] args)
  {
    teht3();
  }
  
  private static void teht3()
  {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Anna merkkijono:");
    String mjono = scan.nextLine();
    
    System.out.println("Anna etsittavat merkit:");
    String merkit = scan.nextLine();
    
    scan.close();
    
    int merkkienMaara = laskeMerkit(mjono, merkit);
    String muodostettavaMerkkijono = "";
    
    if(merkkienMaara % 2 == 0)
    {
      // !!! tuotaParillinenMerkkijono ei palauta mitaan !!!
      tuotaParillinenMerkkijono(muodostettavaMerkkijono);
    }
    else
    {
      muodostettavaMerkkijono = "0";
    }
    
    System.out.println("Viimeiseksi merkiksi muodostui " + viimeinenMerkki(muodostettavaMerkkijono));
  }
  
  /**
   * Laskee esiintymien maaran
   * @param mjono merkkijono, josta merkkeja etsitaan
   * @param merkit merkkijono, jota etsitaan
   * @return kuinka monta kertaa merkkijono merkit esiintyi merkkijonossa mjono
   */
  private static int laskeMerkit(String mjono, String merkit)
  {
    int maara = 0;
    //indexOf palauttaa -1, kun etsittavaa merkkijonoa ei loytynyt. Muulloin palautuu indeksi, josta merkkijono alkaa.
    for(int i = mjono.indexOf(merkit); i >= 0; i = mjono.indexOf(merkit, i + 1))
    {
      maara++;
    }
    return maara;
  }
  
  /**
   * Tuotetaan uusi nelinumeroinen merkkijono. Merkkijono on parillinen kokonaisluku.
   * @param muodostettavaMerkkijono merkkijono, johon numeroita kerataan. On lopuksi parillinen seka nelinumeroinen.
   */
  private static void tuotaParillinenMerkkijono(String muodostettavaMerkkijono)
  {
    Random rand = new Random();
    for(int i = 0; i < 4; i++)
    {   
      // alustetaan luku joka kierroksella uudella satunnaisluvulla
      int luku = rand.nextInt(10);
      
      if(i == 3)
      {
        //viimeinen kierros: varmistetaan parillinen, yksinumeroinen luku
        if(luku % 2 == 1)
        {
          luku++;
          luku %= 10;
        }
      }   
      muodostettavaMerkkijono += luku;
    }
  }
  
  /**
   * Palauttaa viimeisen merkin annetusta merkkijonosta.
   * @param mjono Merkkijono, josta viimeinen merkki halutaan
   * @return yksi merkki.
   */
  private static char viimeinenMerkki(String mjono)
  {
    return mjono.charAt(mjono.length() - 1);
  }
  
}
