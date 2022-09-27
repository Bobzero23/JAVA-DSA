package Side_exercises_udemy;

/*Demonstration on how to  find the sum of two pair which return the given target*/

/*imports*/
import java.util.Arrays;

/*main class*/
public class TwoSumPairs {

    /*method to find the tow sum pairs*/
    public int[] twoSumPairs(int[] arr, int target){
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] + arr[j] == target){
                    return new int[] {i , j};
                }
            }
        }
        throw new IllegalArgumentException("The result not found..");
    }


    /*main method*/
    public static void main(String[] args) {

        /*creating the object of the class*/
        TwoSumPairs object = new TwoSumPairs();

        /*instantiation the array*/
        int[] arr = {2, 22, 12, 32, 15, 8};

        /*calling the function and assigning it to the array*/
        int[] result = object.twoSumPairs(arr, 64);

        /*displaying the result*/
        System.out.println("The answer is: " + Arrays.toString(result));
    }
}
