package LeetCode;


import java.util.LinkedList;
import java.util.Queue;

public class DuplicateZeros_1089 {

    public static void duplicateZeros(int[] arr) {
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                queue.add(0);
                queue.add(0);
            }else {
                queue.add(arr[i]);
            }

            arr[i] = queue.poll();
        }

        System.out.println(arr);
    }

    public static void main(String[] args) {
        int[] array = {1,0,2,3,0,4,5,0};

        duplicateZeros(array);
    }
}
