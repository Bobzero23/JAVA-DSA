package Test;

import java.util.*;

/** sorting a sentence */


/*imports*/


/*main class*/
public class Attempt1 {

    /*main method*/
    public  int[] removeDuplicates(int[] arr) {
        int current = 0;
        HashSet<Integer> set = new HashSet<>();

        for(int i: arr) {
            set.add(i);
        }

        int[] array = set.stream().mapToInt(Integer::intValue).toArray();

        return array;
    }


    public static void main(String[] args) {
        Attempt1 object = new Attempt1();

        int[] arr = {1, 1, 2, 2, 3, 4, 5};

        int[] result = object.removeDuplicates(arr);

        System.out.println(Arrays.toString(result));
    }
}
