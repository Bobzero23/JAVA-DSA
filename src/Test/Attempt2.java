package Test;


import java.util.ArrayList;
import java.util.List;

/*main class*/
public class Attempt2 {

    /*solver method*/
    public List<String> cellsInRange(String s) {
        //creating the list of type string to store our answer
        List<String> list = new ArrayList<>();
        //creating variables to hold the character of the given string s
        char starting_row = s.charAt(1), ending_row = s.charAt(4);
        char starting_col = s.charAt(0), ending_col = s.charAt(3);
        //iterating from the starting column to the ending column
        for(char i = starting_col; i <= ending_col; i++){
            //iterating from the starring row to the ending row
            for(char j = starting_row; j <= ending_row; j++){
                /*adding the character 'i' and 'j' from character array
                then adding taking them two characters as ane string
                then again adding them to the list which stores the answers,
                we do this eah time we do the iteration*/
                list.add(new String(new char[]{i, j}));
            }
        }
        // returning the list
        return list;
    }

    /*main method*/
    public static void main(String[] args) {
        //creating object of the class
        Attempt2 object = new Attempt2();

        //creating the string variable
        String s = "K1:L2";

        //calling the method output
        List<String> result = object.cellsInRange(s);

        //displaying the output
        System.out.println(result);

    }
}
