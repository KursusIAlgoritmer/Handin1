import java.util.Scanner;
import java.util.Arrays;

class HandIn1{


    private static class By implements Comparable<By>{
      String navn;	int kunder; int samletAfstandTilKunder;

      By(String navn, int kunder){this.navn = navn; this.kunder	= kunder;}

      public int compareTo(By byer){
        if(byer.samletAfstandTilKunder      > samletAfstandTilKunder)      return -1;
        else if(byer.samletAfstandTilKunder < samletAfstandTilKunder)	     return 1;
        else  return 0;
      }

      public void addAfstandTilKunder(By byer, int afstandTilBy){samletAfstandTilKunder += byer.kunder*afstandTilBy;}
    }


    public static void invertedInsertionSort(Comparable[] a){
      int N = a.length;
        for (int i = 1; i < N; i ++){
            for (int j = i; j > 0 && a[j-1].compareTo(a[j]) > 0 ; j--){
              Comparable t = a[j]; a[j] = a[j-1]; a[j-1] = t;
            }
          }
    }


    public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      int N     = s.nextInt();
      By[] byer   = new By[N];


    //Indlæser bynavn og antal kunder og opretter byer-objekter
    for(int i = 0; i < N; i++){
      byer[i] = new By(s.next(),s.nextInt());
    }


    //Indlæser afstande imellem byer og beregner samletAfstandTilKunder
    s.nextLine();
    for(int r = 0 ; r < N ; r ++){
      for(int c = 0; c < r ; c ++){
        int afstand = s.nextInt();
         byer[c].addAfstandTilKunder( byer[r],afstand);
         byer[r].addAfstandTilKunder( byer[c],afstand);
      }
      s.nextLine();
    }

    //Sorterer byerne på baggrund af summeret afstand til kunder, mindste først
    invertedInsertionSort(byer);

    for(By by: byer)System.out.println(by.navn);
  }

}
