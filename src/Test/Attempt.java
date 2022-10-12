package Test;

/*main class*/
public class Attempt {

    boolean doubleX(String str) {
        /*finding the index of the first "x" */
        int firstX = str.indexOf("x");

        /*checking if there is no "x" at all*/
        if (firstX == -1) return false;

        /*checking if x is the last letter of the string*/
        if (firstX + 1 >= str.length()) return false;

        /*checking if there is another "x" */
        return str.substring(firstX + 1, firstX + 2).equals("x");

    }

    /*main method*/
    public static void main(String[] args) {

        /*creating the object of the class*/
        Attempt object = new Attempt();

        /*instantiating the string*/
        String str = "taxxing";

        /*assigning the result to variable*/
        boolean result = object.doubleX(str);

        /*displaying the result*/
        System.out.println(result);
    }
}
