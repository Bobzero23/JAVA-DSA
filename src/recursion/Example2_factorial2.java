package recursion;
/*EXECUTING THE FACTORIAL OF A NUMBER USING MAJOR THREE STEPS*/

/*demonstration on how to calculate the factorial of a number using recursion */

/*mian class*/
public class Example2_factorial2 {

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
        Example2_factorial2 object = new Example2_factorial2();

        /*initializing the value of factorial method to rec*/
        var rec = object.factorial(5);

        /*calling the method using object of the main class*/
        System.out.println("The factorial is: " + rec);

    }
}
