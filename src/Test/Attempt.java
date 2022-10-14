package Test;

/*Demonstration on how to solve the Given a string, return a new string made of every other char starting with the first*/

/*main class*/
public class Attempt {


    public int last2(String str) {
        // Screen out too-short string case.
        if (str.length() < 2) return 0;

        String end = str.substring(str.length()-2);
        // Note: substring() with 1 value goes through the end of the string
        int count = 0;

        // Check each substring length 2 starting at i
        for (int i=0; i<str.length()-2; i++) {
            String sub = str.substring(i, i+2);
            if (sub.equals(end)) {  // Use .equals() with strings
                count++;
            }
        }

        return count;
    }



    /*main method*/
    public static void main(String[] args) {

        /*creating the object of the class*/
        Attempt object = new Attempt();

        /*instantiating the string*/
        String str = "hixxh";

        /*assigning the result to variable*/
        int result = object.last2(str);

        /*displaying the result*/
        System.out.println(result);
    }
}
