package recursion;

/*demonstration on how to calculate the factorial of a number using recursion */

/*mian class*/
public class Example3_factorial {

    /*factorial method*/
    public int factorial(int n){

        /*Unintentional case*/
        if (n < 0){
            return -1;
        }
        /*Recursive case*/
        if (n == 1 || n == 0){
            return 1;
        }
        return n * factorial(n - 1);
    }

    /*main method*/
    public static void main(String[] args) {

        /*creating object of the main class*/
        Example3_factorial object = new Example3_factorial();

        /*initializing the value of factorial method to rec*/
        var rec = object.factorial(5);

        /*calling the method using object of the main class*/
        System.out.println("The factorial is: " + rec);

    }
}
