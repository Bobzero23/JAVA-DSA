package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisappearingNumbers_448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();

        if(nums.length == 0) {
            list.add(0);
            return list;
        }

        Arrays.sort(nums);
        int pointer = 1;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != pointer) {
                list.add(pointer);
            }
            pointer++;
        }

        return list;
    }

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};

        DisappearingNumbers_448 object = new DisappearingNumbers_448();

        List<Integer> result = object.findDisappearedNumbers(nums);

        System.out.println(result);
    }
}
