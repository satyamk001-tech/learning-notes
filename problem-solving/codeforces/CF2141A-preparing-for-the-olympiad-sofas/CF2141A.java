import java.util.*;

public class CF2141A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Find the minimum price seen so far
            int minPrice = arr[0];

            // Store indices of sofas that cannot be ordered
            ArrayList<Integer> answer = new ArrayList<>();

            for (int i = 1; i < n; i++) {

                // If current sofa is more expensive than
                // an earlier sofa, it can never be the first affordable one.
                if (arr[i] > minPrice) {
                    answer.add(i + 1); // +1 because Codeforces uses 1-based index
                }

                minPrice = Math.min(minPrice, arr[i]);
            }

            System.out.println(answer.size());

            for (int index : answer) {
                System.out.print(index + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}