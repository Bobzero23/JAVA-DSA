package Test;

/*Checking if the sentence is Pangram or not*/
/*Pangram: is a sentence that all English Alphabets appears at least once*/
/*Find letters one by one approach*/

import java.util.HashSet;
import java.util.Set;

/*main class*/
public class Attempt {

    /*method to solve the question*/
    public boolean checkIfPangram(String sentence) {
        // Empty set 'seen'.
        Set<Character> seen = new HashSet<>();

        // Iterate over 'sentence' add every letter to 'seen'.
        for (char currChar : sentence.toCharArray())
            seen.add(currChar);

        // If the size of 'seen' is 26, then 'sentence' is a pangram.
        return seen.size() == 26;
    }


    /*main method*/
    public static void main(String[] args) {

        /*creating object of the class*/
        Attempt object = new Attempt();

        /*Creating the string*/
        String sentence = "thequickbrownfoxjumpsoverthelazydog";

        /*assigning the method a variable*/
        boolean result = object.checkIfPangram(sentence);

        /*displaying the result*/
        System.out.println(result);

    }
}
