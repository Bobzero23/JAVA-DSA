package LeetCode;

import java.util.Arrays;

/**
 * starting from right to left find the first lowest number
 * swap it with the first highest number to its right
 * the reverse from the swapped number all the numbers to the right
 */

public class Next_Permutation_31 {

    public  void next_Permutation(int[] nums) {
        int i = nums.length - 2;

        while(i >= 0 && nums[i] > nums[i + 1]) {
            i--;
        }

        if(i >= 0) {
            int j = nums.length - 1;

            while(j >= 0 && nums[j] <= nums[i]) j--;
            swap(nums, i, j);
        }

        reverse(nums, i + 1);

        System.out.println(Arrays.toString(nums));
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void reverse(int[] nums, int start) {
        int end = nums.length - 1;
        while(start < end) {
            swap(nums, start, end);
            end--;
            start++;
        }
    }

    public static void main(String[] args) {
        Next_Permutation_31 object = new Next_Permutation_31();

        int[] nums = {1,1,5};

        object.next_Permutation(nums);
    }
}
