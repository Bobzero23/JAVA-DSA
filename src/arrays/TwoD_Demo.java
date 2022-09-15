package arrays;

/*Demonstration on Two Dimensional Arrays*/

import java.util.Arrays;

/*main class*/
public class TwoD_Demo {

    /*main method*/
    public static void main(String[] args) {

        /*declaration*/
        int[][] arr;

        /*instantiation*/
        arr = new int[2][2];

        /*initialization*/
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[1][0] = 3;
        arr[1][1] = 4;

        /*displaying the array using deepToString method*/
        System.out.println(Arrays.deepToString(arr));

        /*all together*/
        String[][] sArr = {{"a", "b"}, {"c", "d"}};

        /*displaying the array*/
        System.out.println(Arrays.deepToString(sArr));

    }
}
