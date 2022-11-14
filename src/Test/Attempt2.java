package Test;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*main class*/
public class Attempt2 {

    /*solver method*/
        public int[] decompressRLElist(int[] nums) {
            int arrSize = 0;
            for (int i = 0; i < nums.length; i += 2) {
                arrSize += nums[i];
            }

            int[] result = new int[arrSize];

            int startIdx = 0;
            for (int i = 0; i < nums.length; i += 2) {
                Arrays.fill(result, startIdx, startIdx + nums[i], nums[i + 1]);
                startIdx += nums[i];
            }
            return result;
        }



    /*main method*/
    public static void main(String[] args) {
        //creating object of the class
        Attempt2 object = new Attempt2();

        //creating the array
        int[] nums = {1,2,3,4};

        //calling the method output
        int[] result = object.decompressRLElist(nums);

        //displaying the output
        System.out.println(Arrays.toString(result));

    }
}
