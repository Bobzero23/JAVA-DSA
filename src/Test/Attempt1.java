package Test;

/*imports*/
import java.util.Arrays;
import java.util.Stack;

/**Demonstration on how to check if two arrays are equivalent*/

/*main class*/
public class Attempt1 {

    /*solver method*/
    public boolean arrayStringsAreEqual(String[] word1, String[] word2){
        // variables to hold the string
        String str1 = "";
        String str2 = "";

        // looping through an array and take the strings
        for (int i = 0; i < word1.length; i++){
            str1 = str1 + word1[i];
        }

        // looping through an array and take the strings
        for (int i = 0; i < word2.length; i++){
            str2 = str2 + word2[i];
        }

        return str1.equals(str2);
    }


    /*main method*/
    public static void main(String[] args) {
        //creating the object of the class
        Attempt1 object = new Attempt1();

        //creating the arrays
        String[] word1 = {"a", "cb"};
        String[] word2 = {"ab", "c"};

        //assigning the method to a variable
        boolean result = object.arrayStringsAreEqual(word1, word2);

        //displaying the result
        System.out.println(result);

    }
}
