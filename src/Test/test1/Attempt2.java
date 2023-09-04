package Test.test1;

import java.util.Arrays;

public class Attempt2 {





    public static void main(String[] args) {
        int max = 0;

        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int[] left = new int[height.length];

        for(int i = 0; i < height.length; i++) {
            max = Math.max(max, height[i]);
            left[i] = max;
        }

        System.out.println(Arrays.toString(left));
    }
}
