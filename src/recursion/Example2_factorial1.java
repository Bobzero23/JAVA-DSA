package recursion;

/*THIS CODE IS JUST MY ATTEMPT TO TRY TO EXECUTE A FACTORIAL OF A NUMBER BUT THIS IS NOT A GOOD PRACTICE SO AVOID IT*/

/*In this example we are going to see how to find a factorial of a number using recursion*/

/*main class*/
public class Example2_factorial1 {

    /*Recursion method*/
    static int factorial(int n){
        /*base case*/
        if(n < 1){
            return 1;
        }
        /*recursive case*/
        return n * factorial(n - 1);
    }

    /*main method*/
    public static void main(String[] args) {

        /*initializing the value of the method to a variable*/
        //var rec = factorial(5);

        /*displaying the variable*/
        //System.out.println("The factorial is: " + rec);

        /*displaying the result*/
        System.out.println("The factorial is: " + factorial(5));
    }
}
