public class Solution {

    public static int largestAltitude(int[] gain) {
        int maxHeight = 0;
        int[] newGain = new int[gain.length + 1];

        newGain[0] = 0;

        for (int i = 1; i < newGain.length; i++) {
            newGain[i] = newGain[i - 1] + gain[i - 1];
            if (newGain[i] > maxHeight) {
                maxHeight = newGain[i];
            }
        }
        return maxHeight;
    }

    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
}
