package Test;


/*main class*/
public class Attempt2 {

    /*solver method*/
    public int removeDuplicates(int[] nums) {
        int pointer = 1;
        for (int i = 0; i < nums.length - 1; i++){
            if (nums[i] != nums[i+1]){
                nums[pointer++] = nums[i+1];
            }
        }
        return pointer;
    }

    /*main method*/
    public static void main(String[] args) {
        //creating object of the class
        Attempt2 object = new Attempt2();

        //creating an array
        int[] nums = {1,1,1,2,2,3,4,5,5,6};

        //assigning the method to variable
        int result = object.removeDuplicates(nums);

        //displaying the result
        System.out.println(result);

    }
}
