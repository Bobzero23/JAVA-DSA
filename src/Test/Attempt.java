package Test;

/*Demonstration on how to solve the Given a string, return a new string made of every other char starting with the first*/

/*main class*/
public class Attempt {


    /*method for solving the Question*/
    public String solver(String str){
        /*A String to restore the new string*/
        String store = "";

        /*Looping through the string*/
        for (int i = 0; i < str.length(); i = i + 2){
            store += String.valueOf(str.charAt(i));
        }
        return store;
    }

    /*main method*/
    public static void main(String[] args) {

        /*creating the object of the class*/
        Attempt object = new Attempt();

        /*instantiating the string*/
        String str = "Bobzero";

        /*assigning the result to variable*/
        String result = object.solver(str);

        /*displaying the result*/
        System.out.println(result);
    }
}
