package Test;

/*what the hell is this code doing mehn*/

/*main class*/
public class Attempt {


    static int powerOf2(int n){
        if (n < 1){
            return 0;
        } else if (n == 1) {
            System.out.println(1);
            return 1;
        }else {
            var prev = powerOf2(n / 2);
            var curr = prev * 2;
            System.out.println(curr);
            return curr;
        }
    }

    /*main method*/
    public static void main(String[] args) {

        powerOf2(5);
    }
}
