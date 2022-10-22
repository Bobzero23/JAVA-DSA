package Test;

/*Checking if the sentence is Pangram or not*/
/*Pangram: is a sentence that all English Alphabets appears at least once*/
/*Find letters one by one approach*/

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*main class*/
public class Attempt2 {
    int count = 1;
    /*method to solve the question*/



    /*main method*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){

            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int count = 1;
            int result = 0;
            for(int j = 1; j <= n; j++){



                result += (a + count * b);
                System.out.print(result + " ");
                count = count * t;

            }
            System.out.println();

        }
        in.close();
    }


}
