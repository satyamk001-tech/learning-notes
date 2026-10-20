public class sumofsecondarray {

    public static int sumOfsecondArray(int[][] nums) {
        int sum = 0;

        // second row has index 1
        for (int j = 0; j < nums[1].length; j++) {
            sum += nums[1][j];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] nums = { {1,4,9}, {11,4,3}, {2,2,3} };
        System.out.println(sumOfsecondArray(nums));
    }
}
