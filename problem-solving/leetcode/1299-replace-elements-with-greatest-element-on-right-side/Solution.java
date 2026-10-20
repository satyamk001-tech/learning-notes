import java.util.*;

public class Solution {

    public static int[] replaceElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            if (i == arr.length - 1) {
                arr[i] = -1;
            } else {
                int max = arr[i + 1];

                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] > max) {
                        max = arr[j];
                    }
                }
                arr[i] = max;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] result = replaceElement(new int[]{17, 18, 5, 4, 6, 1});
        System.out.println(Arrays.toString(result));
    }
}

