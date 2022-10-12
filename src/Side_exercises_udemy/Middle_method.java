package Side_exercises_udemy;

/*Demonstration on how to write a method that will return the new list without
* the first and the last element of the list*/

/*imports*/
import java.util.Arrays;

/*main class*/
public class Middle_method {


    /*method to solve the question*/
    public int[] solver(int[] arr){
        return Arrays.copyOfRange(arr, 1, arr.length - 1);
    }

    /*main method*/
    public static void main(String[] args) {

        /*creating object of the class*/
        Middle_method object = new Middle_method();

        /*Creating an array*/
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        /*assigning a method to a variable*/
        int[] result = object.solver(arr);

        /*displaying the result*/
        System.out.println(Arrays.toString(result));

    }
}
