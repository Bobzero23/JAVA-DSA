package recursion;

/*In this example we are going to see how to find a factorial of a number using recursion*/

/*main class*/
public class Example2_factorial {

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
        var rec = factorial(5);

        /*displaying the variable*/
        System.out.println(rec);
    }
}
