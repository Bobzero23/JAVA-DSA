package Side_exercises_udemy;

/*Demonstration on how to reverse a matrix clock-wise by 90 degrees*/
/*First thing first, you need to check if the matrix is nxn or the row is not 0*/

import java.util.Arrays;

/*main class*/
public class ReversingMatrix {

    /*method for reversing a matrix*/
    public boolean reversingMatrix(int[][] arr){
        /*checking if the array is NxN or if it is empty*/
        if (arr.length == 0 || arr.length != arr[0].length) return false;

        /*taking the length of the array*/
        int n = arr.length;

        /*looping through layers of the array*/
        for (int layer = 0; layer < n / 2; layer++){
            int first = layer;
            int last = n - 1 - layer;
            for (int i = first; i < last; i++){
                int offset = i - first;
                int top = arr[first][i];
                arr[first][i] = arr[last - offset][first];
                arr[last - offset][first] = arr[last][last - offset];
                arr[last][last - offset] = arr[i][last];
                arr[i][last] = top;
            }
        }
        return true;
    }


    /*main method*/
    public static void main(String[] args) {
        /*creating object of the class*/
        ReversingMatrix object = new ReversingMatrix();

        /*instantiating a 2D array*/
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        /*calling a method using the object of the class*/
        object.reversingMatrix(arr);

        /*displaying the reversed array*/
        System.out.println(Arrays.deepToString(arr));

    }
}
