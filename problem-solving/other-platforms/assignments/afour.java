import java.util.*;
public class afour {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number");
        int n=sc.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+n*i);
        }
        System.out.println("Multiplication of table "+n);
    }
}
