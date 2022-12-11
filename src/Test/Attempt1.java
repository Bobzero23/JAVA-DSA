package Test;

import java.util.*;

/** 4 sum */


/*main class*/
public class Attempt1 {

    /*method*/
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> set = new HashSet<>();

        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 3; i++) {
            int leftPointer = i + 1;
            int rightPointer = nums.length - 1;

            while(leftPointer < rightPointer) {
                if(nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] == target) {
                    set.add(Arrays.asList(nums[i], nums[i + 1], nums[i + 2], nums[i + 3]));
                    rightPointer--;
                    leftPointer++;
                }
            }
        }

        return new ArrayList(set);
    }

    /*main method*/
    public static void main(String[] args) {
        Attempt1 object = new Attempt1();

        int target = 0;
        int[] nums = {1,0,-1,0,-2,2};

        List<List<Integer>> result =  object.fourSum(nums, target);

        System.out.println(result);

    }
}
