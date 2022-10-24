package Test;

/*imports*/
import java.util.Arrays;
import java.util.Stack;

/**Demonstration on how to solve the valid parentheses*/

/*main class*/
public class Attempt1 {

    /*method*/
    public boolean isValid(String s){
        // String length must be even
        if (s.length() % 2 != 0 ) return false;

        // Creating a stack
        Stack<Character> stack = new Stack<>();

        // Looping through string
        for (char c : s.toCharArray()){
            // each time we encounter an opening bracket we push the corresponding closing bracket to the stack
            if (c == '('){
                stack.push(')');
            }else if (c == '['){
                stack.push(']');
            }else if (c == '{'){
                stack.push('}');
            }else if(stack.empty() || stack.pop() != c) return false;
        }
        // Returning true if the stack is empty
        return stack.isEmpty();
    }


    /*main method*/
    public static void main(String[] args) {

        // creating object of the class
        Attempt1 object = new Attempt1();

        // Creating a string array
        String s = "()";

        // Assigning the method to a variable
        boolean result = object.isValid(s);

        // Displaying the result
        System.out.println(result);


    }
}
