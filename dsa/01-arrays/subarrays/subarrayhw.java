import java.util.*;

public class subarrayhw {

    public static void printSubarrays(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {

                int sum = 0;

                // print subarray and calculate sum
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + " ");
                    sum += numbers[k];
                }

                System.out.println("=> Sum = " + sum);

                // update max and min sum
                if (sum > maxSum) {
                    maxSum = sum;
                }

                if (sum < minSum) {
                    minSum = sum;
                }
            }
            System.out.println();
        }

        System.out.println("Maximum Subarray Sum = " + maxSum);
        System.out.println("Minimum Subarray Sum = " + minSum);
    }

    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};
        printSubarrays(numbers);
    }
}

