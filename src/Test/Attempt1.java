package Test;

import java.util.Arrays;

/**Demonstration on how to create the an array from permutation*/

/*main class*/
public class Attempt1 {

    /*method*/
    public int[] buildArray(int[] nums){

        // Creating array with same length as the given array
        int[] ans = new int[nums.length];

        // Looping through the given array
        // Apply permutation and assign the values to new array
        for (int i = 0; i < nums.length; i++){
            ans[i] = nums[nums[i]];
        }

        // Returning the new array
        return ans;
    }



    /*main method*/
    public static void main(String[] args) {

        // creating object of the class
        Attempt1 object = new Attempt1();

        // Creating an array named nums
        int[] nums = {0,2,1,5,3,4};

        // Assigning the method to a variable
        int[] result = object.buildArray(nums);

        // Displaying the result
        System.out.println(Arrays.toString(result));

    }
}
