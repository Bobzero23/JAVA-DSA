package Test;

import java.util.*;

/** sorting a sentence */


/*imports*/


/*main class*/
public class Attempt1 {

    int[] myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};

    /*main method*/
    static String firstSecond(int[] myArray) {
        Arrays.sort(myArray);
        return String.valueOf(myArray[myArray.length - 1] + " " + String.valueOf(myArray[myArray.length - 2]));
    }


    public static void main(String[] args) {
        Attempt1 object = new Attempt1();

        System.out.println(firstSecond(object.myArray));


    }

}
