import java.util.*;

public class Solution {

    public static List<List<Integer>> minimumAbsDifference(int[] nums) {
        Arrays.sort(nums);

        int min = Integer.MAX_VALUE;

        // Step 1: find minimum absolute difference
        for (int i = 1; i < nums.length; i++) {
            int diff = nums[i] - nums[i - 1];
            min = Math.min(min, diff);
        }

        // Step 2: collect all pairs with that minimum difference
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == min) {
                result.add(Arrays.asList(nums[i - 1], nums[i]));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 6, 10, 15};
        System.out.println(minimumAbsDifference(nums));
    }
}
