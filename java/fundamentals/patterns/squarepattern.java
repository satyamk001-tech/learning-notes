import java.util.*;
public class squarepattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*for(int lines=1;lines<=4;lines++){
            System.out.println("****");
        }*/
        System.out.println("Enter a number");
        int n= sc.nextInt();
        int line=1;
        while(line<=n){
            System.out.println("****");
            line++;
        }

    }
    
}
