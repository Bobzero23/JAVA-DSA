package Test;

/*imports*/
import java.util.Arrays;

/**Demonstration on how to find the longest common prefix*/

/*main class*/
public class Attempt1 {

    /*method*/
    public String longestCommonPrefix(String[] strs){
        String LCP = "";
        for (int i = 0; i < strs.length; i++){
            for (int j = i + 1; j < strs.length; j++){
                if (strs[i].substring(i).equals(strs[j].substring(j))){
                    LCP += strs[i].substring(i);
                }
            }
        }
        return "";
    }

    /*main method*/
    public static void main(String[] args) {

        // creating object of the class
        Attempt1 object = new Attempt1();

        // Creating a string array
        String[] strs = {"flower","flow","flight"};

        // Assigning the method to a variable
        String result = object.longestCommonPrefix(strs);

        // Displaying the result
        System.out.println(result);



    }
}
