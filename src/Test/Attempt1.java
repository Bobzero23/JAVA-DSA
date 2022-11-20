package Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** sorting a sentence */


/*imports*/


/*main class*/
public class Attempt1 {

    /*main method*/
    public String sortSentence(String s) {
        Map<Integer, String> map = new HashMap<>();

        for(String word : s.split(" ")) {
            int lastIndex = word.length() - 1;
            int index = word.charAt(lastIndex) - '0';
            String actualWord = word.substring(0, lastIndex);
            map.put(index, actualWord);
        }

        StringBuilder actualString = new StringBuilder();
        for(Map.Entry<Integer, String> mapper : map.entrySet()) {
            actualString.append(mapper.getValue());
            actualString.append(" ");
        }
        return actualString.toString().trim();
    }


    public static void main(String[] args) {
        Attempt1 object = new Attempt1();

        String s = "a3 this1 is2 sentence4";

        String result = object.sortSentence(s);

        System.out.println(result);
    }
}
