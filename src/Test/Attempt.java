package Test;

/*Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value,followed by the value plus 5,
followed by the value minus 1. Additionally, the 271 counts even if the "1" differs by 2 or less from the correct value.*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*main class*/
public class Attempt {

    /*method to solve the question*/
        public int[] twoSum(int[] nums, int target) {
            int n=nums.length;
            Map<Integer,Integer> map=new HashMap<>();
            int[] result=new int[2];
            for(int i=0;i<n;i++){
                if(map.containsKey(target-nums[i])){
                    result[1]=i;
                    result[0]=map.get(target-nums[i]);
                    return result;
                }
                map.put(nums[i],i);
            }
            return result;
        }


    /*main method*/
    public static void main(String[] args) {
        /*creating object of the class*/
        Attempt object = new Attempt();

        /*creating an array*/
        int[] nums = {3, 3};

        /*assigning the method to an array*/
        int[] result = object.twoSum(nums, 6);

        /*displaying the result*/
        System.out.println(Arrays.toString(result));


    }
}
