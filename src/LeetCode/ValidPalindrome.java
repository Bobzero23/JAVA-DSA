package LeetCode;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        char[] sCharArr = s.toCharArray();

        int left = 0;
        int right = sCharArr.length - 1;

        while (left < right) {
            if (sCharArr[left] != sCharArr[right]) return false;
            left++;
            right--;
        }

        return true;
    }
    public static void main(String[] args) {
        String testCase1 = "A man, a plan, a canal: Panama";
        String testCase2 = "0P";
        boolean result = isPalindrome(testCase2);
        System.out.println(result);
    }
}
