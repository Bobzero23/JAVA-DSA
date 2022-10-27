package Test;

/*imports*/
import java.util.Arrays;
import java.util.Stack;

/**Demonstration on how to check if two arrays are equivalent*/

/*main class*/
public class Attempt1 {

    /*solver method*/
    public int pivotIndex(int[] nums) {
        //if there is no index return 0
        if (nums.length == 0) return  0;

        //getting the total sum of elements in the array
        int total_sum = 0;
        for (int i = 0; i < nums.length; i++){
            total_sum += nums[i];
        }

        /*getting the difference of the total sum and the current
        * sum without including the current index would give us the
        * pivot index if they equal zero*/
        int dif = 0;
        for (int j = 0; j <= nums.length; j++){
            dif += nums[j - 1];
            if (total_sum - dif - nums[j + 1] == dif){
                return j + 1;
            }
        }

        // if there is no pivot index return -1
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
