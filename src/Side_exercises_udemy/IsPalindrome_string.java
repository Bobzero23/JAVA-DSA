package Side_exercises_udemy;

/*Demonstration on how to tell if the string is palindrome or not using recursion*/

/*main class*/
public class IsPalindrome_string {

    /*recursion method*/
    static boolean isPalindrome(String str){
        if (str.length() == 0 || str.length() == 1)
            return true;
        if (str.charAt(0) == str.charAt(str.length()-1))
            return isPalindrome(str.substring(1, str.length()-1));
            return false;
    }

    /*main method*/
    public static void main(String[] args) {
        System.out.println(isPalindrome("Bobzero"));
        System.out.println(isPalindrome("tacocat"));
    }

}
