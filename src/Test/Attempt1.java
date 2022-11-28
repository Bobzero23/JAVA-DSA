package Test;

import java.util.*;

/** sorting a sentence */


/*imports*/


/*main class*/
public class Attempt1 {

    /*main method*/
    public String capitalizeWord(String str) {
        StringBuilder strB = new StringBuilder();
        String[] array = str.split(" ");

        for(String s:array) {
            strB.append(s.substring(0, 1).toUpperCase() + s.substring(1, s.length())).append(" ");
        }

        return strB.toString().trim();
    }


    public static void main(String[] args) {
        Attempt1 object = new Attempt1();

        String str = "i love Java";

        String result = object.capitalizeWord(str);

        System.out.println(result);
    }

}
