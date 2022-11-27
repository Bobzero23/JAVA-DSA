package Test;

import java.util.*;

/** sorting a sentence */


/*imports*/


/*main class*/
public class Attempt1 {

    /*main method*/
    int x = 0;
    public boolean isPowerOfTwo(int n) {
        int ans = (int)Math.pow(2, x);
        if(n == ans) {
            return true;
        }else {
            x++;
            return isPowerOfTwo(n);
        }
    }


    public static void main(String[] args) {
        Attempt1 object = new Attempt1();

        int n = 8;

        boolean result = object.isPowerOfTwo(n);

        System.out.println(result);

        System.out.println((int)Math.pow(2, 4));

    }

}
