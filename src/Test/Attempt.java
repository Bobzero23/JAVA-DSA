package Test;

/*Demonstration on how to solve the Given a string, return the count of the number of times that
a substring length 2 appears in the string and also as the last 2 chars of the string,
so "hixxxhi" yields 1 (we won't count the end substring). */

/*main class*/
public class Attempt {

    /*method to solve the question*/
    public int solver(String str){
        /*initializing a variable*/
        int count = 0;

        /*length of the string shall be at least 2*/
        if (str.length() < 2) return 0;

        /*initializing the comparing variable*/
        String end = str.substring(str.length() - 2);

        /*looping and comparing*/
        for (int i = 0; i < str.length() - 2; i++){
            String comp = str.substring(i, i + 2);
            if (comp.equals(end)){
                count++;
            }
        }

        /*returning the count*/
        return count;
    }



    /*main method*/
    public static void main(String[] args) {

        /*creating the object of the class*/
        Attempt object = new Attempt();

        /*instantiating the string*/
        String str = "hixxhi";

        /*assigning the result to variable*/
        int result = object.solver(str);

        /*displaying the result*/
        System.out.println(result);
    }
}
