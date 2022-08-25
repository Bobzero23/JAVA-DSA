package recursion;

/*Find the sum of digits of a positive number*/

/*I am going to use recursion on this*/

/*main class*/
public class Exercise1_sumOfDigit {

    /*calculation method*/
    static int operate(int n){
        if (n == 0 || n < 0){
            return 0;
        }
        return n % 10 + operate(n / 10);
    }

    /*main method*/
    public static void main(String[] args) {

        /*displaying the result*/
        System.out.println(operate(111));
    }

}
