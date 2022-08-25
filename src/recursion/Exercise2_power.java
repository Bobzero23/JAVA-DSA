package recursion;

/*Demonstration on how to find a power of a positive number using recursion*/

/*main class*/
public class Exercise2_power {

    /*recursion method*/
    static int power(int base, int exponent){
        if(exponent < 0){
            System.out.println("Negative exponent is not allowed..");
            return -1;
        }
        if(exponent == 0){
            return 1;
        }
        return base * power(base, exponent - 1);
    }

    /*main method*/
    public static void main(String[] args) {
        System.out.println("The power is: " + power(5, -5));
    }
}
