package Test;

/*what the hell is this code doing mehn*/

import java.util.Locale;

/*main class*/
public class Attempt {


    /*main method*/
    public static void main(String[] args) {

        String str = "Bobzero";
        String back = str.substring(str.length() - 3, str.length());
        System.out.println(back);
        String front = str.substring(0, str.length() - 3);
        System.out.println(front);
    }
}
