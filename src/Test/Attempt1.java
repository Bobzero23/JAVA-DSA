package Test;

/**Demonstration on how to check if the strings are isomorphic*/


/*imports*/
import java.util.HashMap;
import java.util.Map;

/*main class*/
public class Attempt1 {

    /*solver method*/
    private String transformString(String s) {
        Map<Character, Integer> indexMapping = new HashMap<>();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < s.length(); ++i) {
            char c1 = s.charAt(i);

            if (!indexMapping.containsKey(c1)) {
                indexMapping.put(c1, i);
            }

            builder.append(Integer.toString(indexMapping.get(c1)));
            builder.append(" ");
        }
        return builder.toString();
    }

    /*control method*/
    public boolean isIsomorphic(String s, String t) {
        return transformString(s).equals(transformString(t));
    }

    /*main method*/
    public static void main(String[] args) {

        //creating object of the class
        Attempt1 object = new Attempt1();

        //creating strings
        String s = "egg";
        String t = "add";

        //calling a method in a variable
        boolean result = object.isIsomorphic(t, s);

        //displaying the result
        System.out.println(result);

    }
}
