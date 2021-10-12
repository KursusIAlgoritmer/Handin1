//0 1 2 3
//1 0 4 5
//2 4 0 6
//3 5 6 0

//for r = 0 to n
//for k = 0 to r

public class TestLoops{

  public static void main(String[] args){

    int N = Integer.parseInt(args[0]);

    int count=0;

    for(int r = 0 ; r < N; r++){

      for(int k =  0 ; k < r ; k++){

        //(rank by k) += (antal kunder by r) * (afstand r til k)
        //(rank by r) += (antal kunder by k) * (afstand r til k)
        System.out.print(++count);

      }

      System.out.println("");

    }

  }


}
