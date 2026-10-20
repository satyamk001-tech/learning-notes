import java.util.*;

public class CF2509B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] freq = new int[101];

            for (int i = 0; i < n; i++) {
                freq[sc.nextInt()]++;
            }

            int maxFreq = 0;

            for (int x = 1; x <= 100; x++) {
                maxFreq = Math.max(maxFreq, freq[x]);
            }

            for (int k = 1; k <= maxFreq; k++) {
                for (int x = 100; x >= 1; x--) {
                    if (freq[x] >= k) {
                        System.out.print(x + " ");
                    }
                }
            }

            System.out.println();
        }

        sc.close();
    }
}