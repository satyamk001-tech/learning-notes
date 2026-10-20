import java.util.*;

public class CF2509C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();

            int[] a = new int[n];
            int maxA = 0;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                maxA = Math.max(maxA, a[i]);
            }

            int[] freq = new int[maxA + 1];

            for (int v : a) {
                freq[v]++;
            }

            long ans = 0;

            for (int i = 2; i * i <= x; i++) {
                if (x % i != 0) {
                    continue;
                }

                ans = Math.max(ans, getSum(i, a, freq, maxA));

                int other = x / i;

                if (other != i) {
                    ans = Math.max(ans, getSum(other, a, freq, maxA));
                }
            }

            if (x > 1) {
                ans = Math.max(ans, getSum(x, a, freq, maxA));
            }

            System.out.println(ans);
        }

        sc.close();
    }

    static long getSum(int d, int[] a, int[] freq, int maxA) {
        long sum = 0;

        if (a.length <= maxA / d) {
            for (int v : a) {
                if (v % d == 0) {
                    sum += v;
                }
            }
        } else {
            for (int v = d; v <= maxA; v += d) {
                sum += (long) v * freq[v];
            }
        }

        return sum;
    }
}
