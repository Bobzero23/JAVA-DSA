package Side_exercises_udemy;

/*main class*/
public class Reverse_string {

    /*creating a recursion method to reverse a String*/
    static String reverse(String str){
        if (str.isEmpty()){
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }

    /*main method*/
    public static void main(String[] args) {

        /*displaying the reversed string*/
        System.out.println("The reversed string is " + reverse("Bobzero"));

    }
}
