import java.util.Scanner;
import java.util.Arrays;

class HandIn1 {

  //By klasse - der samler data for hver by
  private static class Town implements Comparable<Town> {
    String  name;
    int     customers;
    int     accumulatedCustomerDistance;

    Town(String name, int customers) {
      this.name       = name;
      this.customers  = customers;
    }

    public int compareTo(Town by) {
      if (by.accumulatedCustomerDistance > accumulatedCustomerDistance)
        return -1;
      else if (by.accumulatedCustomerDistance < accumulatedCustomerDistance)
        return 1;
      else
        return 0;
    }

    public void addCustomerDistance(Town town, int distanceToTown) {
      accumulatedCustomerDistance += town.customers * distanceToTown;
    }
  }

  //Inverted Insertion sort - dvs. mindste først
  public static void invertedInsertionSort(Comparable[] a) {
    int N = a.length;
    for (int i = 1; i < N; i++) {
      for (int j = i; j > 0 && a[j - 1].compareTo(a[j]) > 0; j--) {
        Comparable t = a[j];
        a[j] = a[j - 1];
        a[j - 1] = t;
      }
    }
  }

  public static void main(String[] args) {
    Scanner s     = new Scanner(System.in);
    int N         = s.nextInt();
    Town[] towns  = new Town[N];

    // Indlæser bynavn og antal kunder og opretter by-objekter
    for (int i = 0; i < N; i++) {
      towns[i] = new Town(s.next(), s.nextInt());
    }

    // Indlæser afstande imellem by og beregner samletAfstandTilKunder
    s.nextLine();
    for (int r = 0; r < N; r++) {
      for (int c = 0; c < r; c++) {
        int afstand = s.nextInt();
        towns[c].addCustomerDistance(towns[r], afstand);
        towns[r].addCustomerDistance(towns[c], afstand);
      }
      s.nextLine();
    }

    // Sorterer byne på baggrund af summeret afstand til kunder, mindste først
    invertedInsertionSort(towns);

    for (Town town : towns)
      System.out.println(town.name);
  }

}