public class Solution {
    // Method to find the single number using XOR
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {2, 2, 1};
        int answer = singleNumber(nums);
        System.out.println("The single number is: " + answer);
    }
}

