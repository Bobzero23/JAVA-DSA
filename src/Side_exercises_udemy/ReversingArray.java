package Side_exercises_udemy;

/*Here I am going to try to reverse an array*/

import java.util.Arrays;

/*main class*/
public class ReversingArray {

    /*method*/
    static void reverse(int[] arr){
        for (int i = 0; i < arr.length / 2; i++){
            int eLast = arr.length - i - 1;
            int temp = arr[i];
            arr[i] = arr[eLast];
            arr[eLast] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    /*main method*/
    public static void main(String[] args) {

        /*creating an array*/
        int[] arr = {1, 2, 3, 4, 5};

        /*calling a method*/
        reverse(arr);
    }

}
