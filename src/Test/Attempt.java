package Test;

/*Checking if the sentence is Pangram or not*/
/*Pangram: is a sentence that all English Alphabets appears at least once*/
/*Find letters one by one approach*/

/*main class*/
public class Attempt {

    /*method to solve the question*/
    public boolean checkIfPangram(String sentence) {
        // We iterate over 'sentence' for 26 times, one for each letter 'currChar'.
        for (int i = 0; i < 26; ++i) {

            /**/
            char currChar = (char)('a' + i);

            // If 'sentence' doesn't contain currChar, it is not a pangram.
            if (sentence.indexOf(currChar) == -1)
                return false;
        }

        // If we manage to find all 26 letters, it is a Pangram.
        return true;
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
