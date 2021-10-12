import java.util.Scanner;

class HandIn1{

  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    int N = s.nextInt();

    String[] byer = new String[N];
    int[] kunder  = new int[N];
    int[] rang    = new int[N];

    int[] afstande= new int[(N*N - N)/2]; //antal afstande

    //Indlæser antal kunder pr.by
    for(int i = 0; i < N; i++){
      byer[i]     = s.next();
      kunder[i]   = s.nextInt();
    }

    //Indlæser afstande imellem byer og beregner rang
    int count=0;
    s.nextLine(); //dette er den første linje der skal skippes
    for(int row = 0 ; row < N ; row ++){
      for(int column = 0; column < row ; column ++){
        int afstand     = s.nextInt();
        afstande[count] = afstand;

        //Jeg kunne beregne "rang" her men så skal man tage indlæsning med i tidskompleksiteten
        
      //  rang[row]     += kunder[column]*afstand;
      //  rang[column]  += kunder[row]*afstand;

        count++;
      }
      s.nextLine();
    }


    count=0;
    for(int row = 0 ; row < N ; row ++){
      for(int column = 0; column < row ; column ++){
        rang[row]     += kunder[column]*afstande[count];
        rang[column]  += kunder[row]*afstande[count];
        count++;
      }
    }

/*
    System.out.println("Afstande indlæst:" +count);
    for(int i = 0; i < rang.length; i++){
      System.out.println("rang:" + rang[i]);
    }*/

    System.out.println("Afstande indlæst:" +count);
    for(int i = 0; i < rang.length; i++){
      System.out.println("rank:" + rang[i]);
    }

  }

}
