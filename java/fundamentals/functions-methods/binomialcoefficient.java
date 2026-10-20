public class binomialcoefficient {

    public static int factorial(int n) {
    int f = 1; // initialize f to 1
    for (int i = 1; i <= n; i++) {
        f = f * i; // multiply iteratively
    }
        return f; // return factorial of n
    }
    public static int binCoeff(int n, int r) {
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_nmr=factorial(n-r);

        int binCoeff= fact_n /( fact_r * fact_nmr );
        return binCoeff;
        
    }
    public static void main(String[] args) {
        System.out.println(binCoeff(5, 2));
    }
    
}
