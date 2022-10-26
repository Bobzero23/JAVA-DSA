package Test;


import java.util.Arrays;

/*main class*/
public class Attempt2 {

    /*solver method*/
    public int[] runningSum(int[] nums){
        for (int i = 1; i < nums.length; i++){
            nums[i] += nums[i - 1];
        }
        return nums;
    }


    /*main method*/
    public static void main(String[] args) {
        //creating object of the class
        Attempt2 object = new Attempt2();

        //creating an array
        int[] nums = {1,1,1,1,1,};

        //assigning the method to variable
        int[] resultPrinter = object.runningSum(nums);

        //displaying the result
        System.out.println(Arrays.toString(resultPrinter));

    }
}
