package Test;


import java.util.Arrays;

/*main class*/
public class Attempt2 {

    /*solver method*/
    public int[] runningSum(int[] nums){
        int[] result = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++){
           count = count + nums[i];
           result[i] = count;
        }
        return result;
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
