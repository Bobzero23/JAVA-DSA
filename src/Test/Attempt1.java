package Test;

/*imports*/
import java.util.Arrays;
import java.util.Stack;

/**Demonstration on how to check if two arrays are equivalent*/

/*main class*/
public class Attempt1 {

    /*solver method*/
    public int pivotIndex(int[] nums) {
        //first getting the right sum
        int right_sum = 0;

        //then get the sum of the array
        for(int i : nums){
            right_sum += i;
        }

        //now calculating the pivot index using left sum
        int left_sum = 0;
        for (int i = 0; i < nums.length; i++){
            right_sum -= nums[i];
            if (left_sum == right_sum){
                return i;
            }
            left_sum += nums[i];
        }
        // returning -1 otherwise
        return -1;
    }

    /*main method*/
    public static void main(String[] args) {

        //creating object of the class
        Attempt1 object = new Attempt1();

        //creating the nums array
        int[] nums = {1,7,3,6,5,6}; // 28 - 17 = 11 - 3 = 9

        // assigning the method to a variable
        int result = object.pivotIndex(nums);

        //displaying the result
        System.out.println("the pivot index is: " + result);
    }
}
