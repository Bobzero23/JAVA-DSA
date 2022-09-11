package recursion;

/*Demonstration on how to find the GCD using recursion*/
/* GCD -> The Greatest Common Divisor*/

/*main class*/
public class Exercise3_GCD {

    /*recursion method*/
    static int gcd(int a, int b){
        if (a < 0 || b < 0){
            return -1;
        }
        if (b == 0){
            return a;
        }
        return gcd(b, a % b);
    }

    /*main method*/
    public static void main(String[] args) {
        System.out.println("The GCD is: " + gcd(4,18));
    }
}
