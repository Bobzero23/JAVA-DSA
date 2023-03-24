package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class MajorityElement_169 {

    public int majorityElement(int[] nums) {
         int previousCounter = 0;
         int pointer = 0;
         int majorityElement = 0;

         Set<Integer> set = new HashSet<>();

         for(int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])) {
                continue;
            }else {
                set.add(nums[i]);
                pointer = i;
                int currentCounter = 0;
                while(pointer < nums.length) {
                    if(nums[pointer] == nums[i]) {
                        currentCounter++;
                        pointer++;
                    }else {
                        pointer++;
                    }
                }

                if(currentCounter > previousCounter) {
                 majorityElement = nums[i];
                 previousCounter = currentCounter;
                 }
             }
         }

         return majorityElement;
     }

    public static void main(String[] args) {
        int[] nums = {8,8,7,7,7};

        MajorityElement_169 object = new MajorityElement_169();

        int result = object.majorityElement(nums);

        System.out.println(result);
    }
}
