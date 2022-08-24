package recursion;

/*Demonstration on how to display a Fibonacci using recursion*/
/*As in Factorial, also Fibonacci runs to infinite in Unintentional conditional also if you put
* floating numbers as input and here is the formula of fibonacci f(n) = f(n-1) + f(n-2)*/

/*main class*/
public class Example3_fibonacci {

    /*Fibonacci method*/
    static int fibonacci(int n){
        if(n < 0){
            return -1;
        }
        if(n == 0 || n == 1){
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /*main method*/
    public static void main(String[] args) {

        /*displaying the output*/
        System.out.println("The Fibonacci is: " + fibonacci(12));

    }
}
