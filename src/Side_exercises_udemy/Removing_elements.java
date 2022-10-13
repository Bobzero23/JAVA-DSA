package Side_exercises_udemy;

/*Demonstration on how to remove the first and the last element of the array*/

import java.util.Arrays;

/*main class*/
public class Removing_elements {

    /*method to solve the question*/
    public int[] solver(int[] arr){
        return Arrays.copyOfRange(arr, 1, arr.length - 1 );
    }

    /*main method*/
    public static void main(String[] args) {

        /*creating the object of the class*/
        Removing_elements object = new Removing_elements();

        /*creating the array*/
        int[] arr = {1, 2, 3, 4, 5, 6,7, 8, 9, 0};

        /*assigning the method to a variable*/
        int[] result = object.solver(arr);

        /*displaying the result*/
        System.out.println(Arrays.toString(result));
    }

}
