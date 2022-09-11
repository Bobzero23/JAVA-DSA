package Morning_quiz;

/*The technique here is first to find the bigger number and then act accordingly*/

/*main class*/
public class WarmUp {

    static int max1020(int a, int b) {
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (a >= 10 && a <= 20) return a;
        if (b >= 10 && b <= 20) return b;
        return 0;
    }

    /*main method*/
    public static void main(String[] args) {

        System.out.println(max1020(11, 20));
    }
}
