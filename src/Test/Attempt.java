package Test;

/*Demonstration on how to solve the Given String, Count the number of "xx" in the given string.
We'll say that overlapping is allowed, so "xxx" contains 2 "xx" */

/*main class*/
public class Attempt {

    /*method to solve the question*/
    public int solver(String str){
        /*initializing variables*/
        int count = 0;

        /*checking the String length*/
        if (str.length() < 2) return 0;

        /*looping through the characters of String*/
        for (int i = 0; i < str.length() - 1; i++){
            if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x'){
                count = count + 1;
            }
        }
        return count;
    }

    /*main method*/
    public static void main(String[] args) {
        /*creating object of the class*/
        Attempt object = new Attempt();

        /*initializing the string*/
        String str = "Hexxo thxxe";

        /*assigning the method to a variable*/
        int result = object.solver(str);

        /*displaying the result*/
        System.out.println(result);
    }
}
