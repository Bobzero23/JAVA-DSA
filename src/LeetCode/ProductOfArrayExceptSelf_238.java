package LeetCode;

import java.util.Arrays;

public class ProductOfArrayExceptSelf_238 {
    public static int[] productExceptSelf(int[] nums) {
        int numsLength = nums.length;
        int pointer = 0;
        int[] result = new int[numsLength];

        while (pointer < numsLength) {
            int currentProduct = 1;

            for (int i = 0; i < numsLength; i++) {
                if (i == pointer) {
                    continue;
                }
                currentProduct = currentProduct * nums[i];
            }

            result[pointer] = currentProduct;
            pointer++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-1,1,0,-3,3};

        int[] result = productExceptSelf(nums);

        System.out.println(Arrays.toString(result));
    }
}
