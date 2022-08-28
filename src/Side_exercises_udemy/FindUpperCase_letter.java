package Side_exercises_udemy;

/*Demonstration on how to find the first uppercase in a given string using recursion*/

/*main class*/
public class FindUpperCase_letter {

    /*recursion method*/
    static char upperCase(String str){
        if (str.length() == 0){
            return ' ';
        }
        if(Character.isUpperCase(str.charAt(0))){
            return str.charAt(0);
        }else {
            return upperCase(str.substring(1));
        }
    }

    /*main method*/
    public static void main(String[] args) {

        /*displaying the output*/
        System.out.println("The first UpperCase string is: " + upperCase("theProblem"));
    }
}
