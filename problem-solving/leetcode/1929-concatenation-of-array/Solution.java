public class Solution {

    public static void newresult(int[] nums) {
        int n = nums.length;
        int[] result = new int[2 * n];

        for (int i = 0; i < n; i++) {
            result[i] = nums[i];
            result[i + n] = nums[i];
        }

        // Printing without Arrays.toString()
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        newresult(nums);
    }
}
/*
import java.util.*;

public class Solution {

    public static void newresult(int[] nums) {
        int n = nums.length;
        int[] result = new int[2 * n];

        for (int i = 0; i < n; i++) {
            result[i] = nums[i];
            result[i + n] = nums[i];
        }

        System.out.println(Arrays.toString(result));
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        newresult(nums);
    }
}
*/

