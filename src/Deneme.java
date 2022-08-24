
    /*must imports*/
    import java.util.*;

public class Deneme {

        /*main class*/
        public static void main(String[] args) {


            int topla = 0;
            char Char;

            /*creating the scanner object*/
            Scanner scan = new Scanner(System.in);

            /*asking for the user input*/
            System.out.println("Enter the word you want to reverse: ");
            String normal = scan.next();

            for(int i = 0; i < normal.length(); i++) {


                Char = normal.charAt(i);
                topla = topla + Char;

            }

            System.out.println(topla);

            scan.close();
        }


}
