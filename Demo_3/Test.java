import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class Test
{
  public static void main(String[] args)
  {
    final Random r = new Random();
    
    int[][] lauta = new int[5][5];
    
    lauta = teeLauta(r);
    tulostaLauta(lauta);
    
    ArrayList<Integer> arvotut = arvoNumerot(lauta, r);
    
    //peli alkakoon
    boolean peliKaynnissa = true;
    
    while(peliKaynnissa)
    {
      int numero = arvoNumero(arvotut);
      peliKaynnissa = !pelaaVuoro(lauta, numero);
    }
  }
  
  public static boolean pelaaVuoro(int[][] board, int n)
  {
    int sumRow = 0, sumCol = 0;
    
    for (int row = 0; row < board.length; row++)
    {
      for (int col = 0; col < board[row].length; col++)
      {
        if (board[row][col] == n)
        {
          board[row][col] = -1;
          for (int i = 0; i < board[row].length; i++) sumRow += board[row][i];
          for (int i = 0; i < board.length; i++) sumCol += board[i][col];
          if (sumRow == -board[row].length || sumCol == -board.length)
          {
            System.out.println("BINGO!");
            return true;
          }
        }
      }
    }
    
    return false;
  }
  
  public static ArrayList<Integer> arvoNumerot(int[][] lauta, Random r)
  {
    ArrayList<Integer> arvotut = new ArrayList<>();
    
    //arvo voittava rivi
    int rivi = r.nextInt(lauta.length);
    for(int i=0; i<lauta[rivi].length; i++)
    {
      int numero = lauta[rivi][i];
      numero = (numero == -1 ? r.nextInt(75)+1 : numero);
      arvotut.add(numero);
    }
    //muutama hämäysnumero
    for(int i=0; i<6; i++)
    {
      int numero = r.nextInt(75)+1;
      if(!arvotut.contains(numero))
        arvotut.add(numero);
      else
        i--;
    }
    sekoitaLista(r, arvotut);
    return arvotut;
  }
  
  public static void sekoitaLista(Random r, ArrayList<Integer> lista)
  {
    for(int i=0; i< lista.size(); i++)
    {
      lista.add(lista.remove(r.nextInt(lista.size())));
    }
  }
  
  public static int[][] teeLauta(Random r)
  {
    int[][] lauta = new int[5][5];
    ArrayList<Integer> arvotut = new ArrayList<>();
    for(int i=0; i<lauta.length; i++)
    {
      for(int j=0; j< lauta[i].length; j++)
      {
        int numero = i*15+(r.nextInt(15)+1);
        if(!arvotut.contains(numero))
        {
          lauta[j][i] = numero;
          arvotut.add(numero);
        }
        else
        {
          j--;
        }
      }
    }
    lauta[2][2] = -1;
    return lauta;
  }
  
  public static int arvoNumero(ArrayList<Integer> arvotut)
  {
    int arvottu = arvotut.remove(0);
    
    System.out.println("ViLLE arpoi numeron "+arvottu);
    return arvottu;
  }
  
  public static void tulostaLauta(int[][] lauta)
  {
    System.out.println("B  I  N  G  O");
    for(int i=0; i<lauta.length; i++)
    {
      for(int j=0; j< lauta[i].length; j++)
      {
        int arvo = lauta[i][j];
        int pituus = (arvo+"").length();
        System.out.print(""+ arvo+ (pituus==1 ? "  " : " "));
      }
      System.out.println();
    }
  }
}