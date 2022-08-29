package Side_exercises_udemy;

/*Demonstration on how to capitalize every word in a sentence*/

import javax.swing.text.AttributeSet;
import java.nio.charset.CharsetEncoder;

/*main class*/
public class Capitalize_word {

    /*recursive method*/
    static String capitalize(String str) {
        /*just in case the string is empty*/
        if (str.isEmpty()) {
            return " ";
        }
        /*creating a character as the last letter of the last letter of the string*/
        char chr = str.charAt(str.length() - 1);
        /*just in case we have only one letter in the sentence capitalizing it*/
        if (str.length() == 1) {
            return Character.toString(Character.toUpperCase(chr));
        }
        if (str.substring(str.length() - 2, str.length() - 1).equals(" ")) {
            chr = Character.toUpperCase(chr);
        }
        return capitalize(str.substring(0,str.length() - 1)) + Character.toString(chr);
    }

    /*main method*/
    public static void main(String[] args) {

        /*displaying the result*/
        System.out.println(capitalize("i am going to school"));
    }

}
