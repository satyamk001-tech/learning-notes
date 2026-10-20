import java.util.*;

public class factorial {
    public static int factorial(int n) {
        int f = 1; // initialize f to 1
        for (int i = 1; i <= n; i++) {
            f = f * i; // multiply iteratively
        }
        return f; // return factorial of n
    }

    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
}

