package Test;

import java.util.*;

/** sorting a sentence */


/*imports*/


/*main class*/
public class Attempt1 {

    /*main method*/
    public int uniqueMorseRepresentations(String[] words) {
        int counter = 0;
        Set<String> set = new HashSet<>();

        for(int i = 0; i < words.length; i++) {
            String lastChar = words[i].substring(words[i].length() - 1);
            set.add(lastChar);
            lastChar = "";
        }

        return set.size();
    }


    public static void main(String[] args) {
        Attempt1 object = new Attempt1();

        String[] words = {"gin", "zen", "gig", "msg"};

        int result = object.uniqueMorseRepresentations(words);

        System.out.println(result);

    }

}
