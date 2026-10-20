import java.util.*;

public class arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers (A, B):");
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        System.out.println("add= " + (A+B));
        System.out.println("sub= " + (A-B));
        System.out.println("mul= " + (A*B));
        System.out.println("div= " + (A/B));
        System.out.println("mod= " + (A%B));
    }

}    