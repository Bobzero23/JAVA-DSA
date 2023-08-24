package Test.test1;

import java.util.*;

/** 997 leetcode 23 Day */


/*main class*/
public class Attempt1 {

    /*method*/
    public int findJudge(int n, int[][] trust) {
        if(n == 1 && trust.length == 0) return 1;

        int[] count = new int[n + 1];

        for(int i = 0; i < trust.length; i++) {
            count[trust[i][0]]--;
            count[trust[i][1]]++;
        }

        for(int i = 0; i < count.length; i++) {
            if(count[i] == n - 1) {
                return i;
            }
        }
        return -1;
    }

    /*main method*/
    public static void main(String[] args) {
        int[] array = {4, 6, 200, 8, 1, 3, 5};

        Arrays.sort(array);

        System.out.println(Arrays.toString(array));
    }
}
