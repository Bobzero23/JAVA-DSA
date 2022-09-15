package arrays;

/*imports*/
import java.util.Arrays;

public class OneD_Demo {
    public static void main(String[] args) {

        int[] arr; // declaration

        arr = new int[3]; // instantiation

        /*initialization*/
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        /*displaying the array*/
        System.out.println(Arrays.toString(arr));

        /*all together*/
        String[] sArr = {"a", "b", "c"};

        /*displaying the array*/
        System.out.println(Arrays.toString(sArr));


    }
}
