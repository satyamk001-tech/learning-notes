public class Solution {

    public int[] buildArray(int[] nums) {
        int[] newArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            newArray[i] = nums[nums[i]];
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};

        Solution obj = new Solution();
        int[] result = obj.buildArray(nums);

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
