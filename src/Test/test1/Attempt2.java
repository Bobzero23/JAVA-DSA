package Test.test1;

import java.util.Arrays;

public class Attempt2 {





    public static void main(String[] args) {
        int max = 0;

        int[] heights = {0,1,0,2,1,0,1,3,2,1,2,1};
        int[] left = new int[heights.length];
        int[] right = new int[heights.length];

        for(int i = 0; i < heights.length; i++) {
            max = Math.max(max, heights[i]);
            left[i] = max;
        }

        max = heights[heights.length - 1];
        for (int i = heights.length - 1; i >= 0; i--) {
            right[i] = Math.max(heights[i], max);
            max = right[i];
        }

        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
    }
}
