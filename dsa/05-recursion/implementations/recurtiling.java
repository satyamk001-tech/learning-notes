import java.util.*;
public class recurtiling{
    public static int tilingProblem(int n){//2 x n (floor size)
        if(n==0 || n==1){
            return 1;
        }
        //vertical choice
        int verticalTiles= tilingProblem(n-1);

        //horizintal choice
        int horizintalTiles= tilingProblem(n-2);

        int totWays = verticalTiles + horizintalTiles;
        return totWays;
    }
    public static void main(String args[]){
        System.out.println(tilingProblem(10));

    }
}