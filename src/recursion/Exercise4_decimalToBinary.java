package recursion;

/*Demonstration on how to convert a decimal number to binary number using recursion*/

/*main class*/
public class Exercise4_decimalToBinary {

    /*recursion method*/
    static  int convert(int n){
        if (n == 0){
            return 0;
        }
        return n % 2 + 10 * convert(n / 2);
    }

    /*main method*/
    public static void main(String[] args) {

        /*displaying the conversion*/
        System.out.println("The binary conversion of a number is: " + convert(10));
    }
}
