import java.util.Arrays;

public class Solution {

    public static int[] separateDigits(int[] nums) {

        // First pass: count total digits
        int size = 0;
        for (int n : nums) {
            if (n == 0) {
                size++;
            } else {
                while (n > 0) {
                    size++;
                    n /= 10;
                }
            }
        }

        // Result array
        int[] result = new int[size];
        int index = size - 1;

        // Second pass: fill digits from right to left
        for (int i = nums.length - 1; i >= 0; i--) {
            int n = nums[i];

            if (n == 0) {
                result[index--] = 0;
            } else {
                while (n > 0) {
                    result[index--] = n % 10;
                    n /= 10;
                }
            }
        }

        return result;
    }

    // ✅ main method added
    public static void main(String[] args) {
        int[] nums = {32,43,68,8,100,84,80,14,88,42,53,98,69,64,40,60,23,99};
        int[] output = separateDigits(nums);
        System.out.println(Arrays.toString(output));
    }
}
