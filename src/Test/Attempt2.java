package Test;

/*imports*/
import java.util.Scanner;


/*main class*/
public class Attempt2 {
    int count = 1;

    /*main method*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){

            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            // inner for loop
            for (int j = 0; j < n; j++){
                a +=  Math.pow(2,j) * b;
                System.out.print(a + " ");
            }
            System.out.println();

        }
        in.close();
    }


}
// input 2  0,2,10  5,3,5  // output   2 6 14 30 62 126 254 510 1022 2046   8 14 26 50 98
// input 3  3,3,3  0,0,5  6,6,10  // output 6 12 24   0 0 0 0 0    12 24 48 96 192 384 768 1536 3072 6144
