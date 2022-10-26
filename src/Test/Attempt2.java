package Test;


import java.util.Arrays;

/*main class*/
public class Attempt2 {

    /*solver method*/
    public int runningSum(int[] nums){
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < nums.length; i++){
            sum1 += nums[i];
        }
        for (int j = 0; j < nums.length; j++){
            sum2 += nums[j];
            if (sum2 == sum1 / 2){
                return j;
            }
        }
        return -1;
    }


    /*main method*/
    public static void main(String[] args) {
        //creating object of the class
        Attempt2 object = new Attempt2();

        //creating an array
        int[] nums = {1,7,3,6,5,6};

        //assigning the method to variable
        int resultPrinter = object.runningSum(nums);

        //displaying the result
        System.out.println(resultPrinter);

    }
}
