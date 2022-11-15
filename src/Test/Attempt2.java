package Test;
/*Description-> 1389. Create Target Array in the Given Order*/

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*main class*/
public class Attempt2 {

    /*solver method*/
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            a.add(index[i],nums[i]);
        }
        int[] target = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            target[i] = a.get(i);
        }
        return target;
    }



    /*main method*/
    public static void main(String[] args) {
        //creating object of the class
        Attempt2 object = new Attempt2();

        //creating the array
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};

        //calling the method output
        int[] result = object.createTargetArray(nums,index);

        //displaying the output
        System.out.println(Arrays.toString(result));

    }
}
