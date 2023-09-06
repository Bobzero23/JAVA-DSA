package Test.test1;

import java.util.*;

/** 3Sum LeetCode 15*/

public class Solution {

    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();

        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++) {
            if(i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while(left < right) {
                if(nums[left] + nums[right] == -nums[i]) {
                    set.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    right--;
                    left++;
                }else if(nums[left] + nums[right] > -nums[i]) {
                    right--;
                }else {
                    left++;
                }
            }

        }

        return new ArrayList<>(set);
    }


    /*main method*/
    public static void main(String[] args) {
        int[] array = {-1,0,1,2,-1,-4};

        List<List<Integer>> result = threeSum(array);
        System.out.println(result);
    }
}
