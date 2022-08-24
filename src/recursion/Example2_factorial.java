package recursion;

/*In this example we are going to see how to find a factorial of a number using recursion*/

/*main class*/
public class Example2_factorial {

    /*Recursion method*/
    static int factorial(int n){
        if(n < 1){
            return 1;
        }

        return n * factorial(n - 1);
    }

    /*main method*/
    public static void main(String[] args) {

        /*calling the recursion method*/
        factorial(5);
    }
}
