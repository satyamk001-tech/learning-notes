public class Solution {

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int maxarea = 0;
        for(int i=0; i<height.length; i++){
            for(int j=i+1; j<height.length; j++){
                int ht = Math.min(height[i], height[j]);
                int width = j-i;
                int currarea = ht*width;
                maxarea = Math.max(maxarea, currarea);
            }
        }
        System.out.println(maxarea);
    }
}